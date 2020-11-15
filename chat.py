import threading
import datetime
import grpc
import sys
from concurrent import futures

import p2p_service_pb2 as chat
import p2p_service_pb2_grpc as rpc

class Client:

    def __init__(self, server_ip, port, username):
        self.username = username
        channel = grpc.insecure_channel(server_ip + ':' + port)
        self.conn = rpc.PeerStub(channel)
        threading.Thread(target=self.__listen_for_messages, daemon=True).start()
        self.__send_message()


    def __listen_for_messages(self):
        for message in self.conn.ChatStream(chat.Empty()):
            print('[' + message.time + '] ' + message.name + ': ' + message.text)
    
    def __send_message(self):
        print('Starting listening user input...')
        while (True):
            msgToSend = input()
            if (len(msgToSend) == 0):
                continue

            timeStr = datetime.datetime.now().strftime('%H:%M:%S')

            self.conn.Message(chat.PeerMessage(
                name = self.username,
                time = timeStr,
                text = msgToSend
            ))





class ChatServer(rpc.PeerServicer):

    def __init__(self, username):
        self.username = username

    def ChatStream(self, request_iterator, context):
        print('User connected.')
        print('Starting listening user input...')
        while (True):
            msgToSend = input()
            if (len(msgToSend) == 0):
                continue

            timeStr = datetime.datetime.now().strftime('%H:%M:%S')

            yield chat.PeerMessage(
                name = self.username, 
                time = timeStr,
                text = msgToSend)

    def Message(self, request: chat.PeerMessage, context):
        print('[' + request.time + '] ' + request.name + ': ' + request.text)
        return chat.Empty() 


def start_server(port, username):
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=16))
    rpc.add_PeerServicer_to_server(ChatServer(username), server)
    print('Starting server. Listening...')
    server.add_insecure_port('[::]:' + str(port))
    server.start()
    server.wait_for_termination()

def start_client(ip, port, username):
    try:
        Client(ip, port, username)
    except:
        print('Error stert_client')


if len(sys.argv) < 4:
    print('Please specify peer\'s IP, port and your name to be a client')
    print('or type \'--server\' instead of IP to be a server and a client at the same time.')
    sys.exit(0)

isFirst = sys.argv[1] == '--server'
port = sys.argv[2]
username = sys.argv[3]

try:
    if isFirst:
        start_server(port, username)
    else:
        ip = sys.argv[1]
        start_client(ip, port, username)
except:
    print('Error occured.')
# p2p-msg-grpc

## Requirements:
1. Python 3.7 and higher

## Build:
1. `python -m pip install -r requirements.txt`
2. `python -m grpc_tools.protoc -I. --python_out=. --grpc_python_out=. p2p_service.proto`

## Usage:

server:
```python peer.py --server <port> <username>```

users:
```python peer.py <server's ip address> <port> <username>```


##Docker build

1. Build:
`docker build --tag p2p-grpc-chat:1.0 .`
2. Start server:
`docker run -a stdin -a stdout -i -t p2p-grpc-chat:1.0 --server <port> <username>`
3. Find server container's name:
`docker ps`
4. Find server container's IP by name:
`docker inspect <container's name>`
5. Start client:
`docker run -a stdin -a stdout -i -t p2p-grpc-chat:1.0 <server ip> <port> <username>`
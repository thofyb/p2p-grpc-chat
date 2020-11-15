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

package se.arch.chat;

import io.grpc.stub.StreamObserver;
import se.arch.chat.grpc.P2PService;
import se.arch.chat.grpc.PeerGrpc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class PeerService extends PeerGrpc.PeerImplBase {

    //private Set<StreamObserver<P2PService.Empty>> observers = new HashSet<>();

    @Override
    public StreamObserver<P2PService.PeerMessage> msg(StreamObserver<P2PService.Empty> responseObserver) {
        //observers.add(responseObserver);

        return new StreamObserver<P2PService.PeerMessage>() {
            @Override
            public void onNext(P2PService.PeerMessage value) {
                String name = value.getName();
                String time = value.getTime();
                String text = value.getText();

                System.out.println(time + "\t" + name + ": " + text + "\n");
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

            }
        };
    }
    //    @Override
//    public void msg(P2PService.PeerMessage request, StreamObserver<P2PService.Empty> responseObserver) {
//        String name = request.getName();
//        String time = request.getTime();
//        String text = request.getText();
//
//        System.out.println(time + "\t" + name + ": " + text + "\n");
//
//        responseObserver.onNext(P2PService.Empty.newBuilder().build());
//        responseObserver.onCompleted();
//
//    }
//
//    @Override
//    public void subscribeMsg(P2PService.Empty request, StreamObserver<P2PService.PeerMessage> responseObserver) {
//        super.subscribeMsg(request, responseObserver);
//    }

    //    @Override
//    public StreamObserver<P2PService.PeerMessage> msg(StreamObserver<P2PService.Empty> responseObserver) {
//        responseObserver.
//        return super.msg(responseObserver);
//    }
}

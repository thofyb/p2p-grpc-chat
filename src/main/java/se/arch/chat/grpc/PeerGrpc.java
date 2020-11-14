package se.arch.chat.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: p2p_service.proto")
public final class PeerGrpc {

  private PeerGrpc() {}

  public static final String SERVICE_NAME = "se.arch.chat.grpc.Peer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<se.arch.chat.grpc.P2PService.PeerMessage,
      se.arch.chat.grpc.P2PService.Empty> getMsgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Msg",
      requestType = se.arch.chat.grpc.P2PService.PeerMessage.class,
      responseType = se.arch.chat.grpc.P2PService.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<se.arch.chat.grpc.P2PService.PeerMessage,
      se.arch.chat.grpc.P2PService.Empty> getMsgMethod() {
    io.grpc.MethodDescriptor<se.arch.chat.grpc.P2PService.PeerMessage, se.arch.chat.grpc.P2PService.Empty> getMsgMethod;
    if ((getMsgMethod = PeerGrpc.getMsgMethod) == null) {
      synchronized (PeerGrpc.class) {
        if ((getMsgMethod = PeerGrpc.getMsgMethod) == null) {
          PeerGrpc.getMsgMethod = getMsgMethod = 
              io.grpc.MethodDescriptor.<se.arch.chat.grpc.P2PService.PeerMessage, se.arch.chat.grpc.P2PService.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "se.arch.chat.grpc.Peer", "Msg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  se.arch.chat.grpc.P2PService.PeerMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  se.arch.chat.grpc.P2PService.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new PeerMethodDescriptorSupplier("Msg"))
                  .build();
          }
        }
     }
     return getMsgMethod;
  }

  private static volatile io.grpc.MethodDescriptor<se.arch.chat.grpc.P2PService.Empty,
      se.arch.chat.grpc.P2PService.PeerMessage> getSubscribeMsgMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeMsg",
      requestType = se.arch.chat.grpc.P2PService.Empty.class,
      responseType = se.arch.chat.grpc.P2PService.PeerMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<se.arch.chat.grpc.P2PService.Empty,
      se.arch.chat.grpc.P2PService.PeerMessage> getSubscribeMsgMethod() {
    io.grpc.MethodDescriptor<se.arch.chat.grpc.P2PService.Empty, se.arch.chat.grpc.P2PService.PeerMessage> getSubscribeMsgMethod;
    if ((getSubscribeMsgMethod = PeerGrpc.getSubscribeMsgMethod) == null) {
      synchronized (PeerGrpc.class) {
        if ((getSubscribeMsgMethod = PeerGrpc.getSubscribeMsgMethod) == null) {
          PeerGrpc.getSubscribeMsgMethod = getSubscribeMsgMethod = 
              io.grpc.MethodDescriptor.<se.arch.chat.grpc.P2PService.Empty, se.arch.chat.grpc.P2PService.PeerMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "se.arch.chat.grpc.Peer", "SubscribeMsg"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  se.arch.chat.grpc.P2PService.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  se.arch.chat.grpc.P2PService.PeerMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new PeerMethodDescriptorSupplier("SubscribeMsg"))
                  .build();
          }
        }
     }
     return getSubscribeMsgMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PeerStub newStub(io.grpc.Channel channel) {
    return new PeerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PeerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PeerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PeerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PeerFutureStub(channel);
  }

  /**
   */
  public static abstract class PeerImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<se.arch.chat.grpc.P2PService.PeerMessage> msg(
        io.grpc.stub.StreamObserver<se.arch.chat.grpc.P2PService.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getMsgMethod(), responseObserver);
    }

    /**
     */
    public void subscribeMsg(se.arch.chat.grpc.P2PService.Empty request,
        io.grpc.stub.StreamObserver<se.arch.chat.grpc.P2PService.PeerMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeMsgMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMsgMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                se.arch.chat.grpc.P2PService.PeerMessage,
                se.arch.chat.grpc.P2PService.Empty>(
                  this, METHODID_MSG)))
          .addMethod(
            getSubscribeMsgMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                se.arch.chat.grpc.P2PService.Empty,
                se.arch.chat.grpc.P2PService.PeerMessage>(
                  this, METHODID_SUBSCRIBE_MSG)))
          .build();
    }
  }

  /**
   */
  public static final class PeerStub extends io.grpc.stub.AbstractStub<PeerStub> {
    private PeerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PeerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PeerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PeerStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<se.arch.chat.grpc.P2PService.PeerMessage> msg(
        io.grpc.stub.StreamObserver<se.arch.chat.grpc.P2PService.Empty> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getMsgMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void subscribeMsg(se.arch.chat.grpc.P2PService.Empty request,
        io.grpc.stub.StreamObserver<se.arch.chat.grpc.P2PService.PeerMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeMsgMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PeerBlockingStub extends io.grpc.stub.AbstractStub<PeerBlockingStub> {
    private PeerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PeerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PeerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PeerBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<se.arch.chat.grpc.P2PService.PeerMessage> subscribeMsg(
        se.arch.chat.grpc.P2PService.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeMsgMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PeerFutureStub extends io.grpc.stub.AbstractStub<PeerFutureStub> {
    private PeerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PeerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PeerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PeerFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SUBSCRIBE_MSG = 0;
  private static final int METHODID_MSG = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PeerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PeerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE_MSG:
          serviceImpl.subscribeMsg((se.arch.chat.grpc.P2PService.Empty) request,
              (io.grpc.stub.StreamObserver<se.arch.chat.grpc.P2PService.PeerMessage>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MSG:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.msg(
              (io.grpc.stub.StreamObserver<se.arch.chat.grpc.P2PService.Empty>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PeerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PeerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return se.arch.chat.grpc.P2PService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Peer");
    }
  }

  private static final class PeerFileDescriptorSupplier
      extends PeerBaseDescriptorSupplier {
    PeerFileDescriptorSupplier() {}
  }

  private static final class PeerMethodDescriptorSupplier
      extends PeerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PeerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PeerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PeerFileDescriptorSupplier())
              .addMethod(getMsgMethod())
              .addMethod(getSubscribeMsgMethod())
              .build();
        }
      }
    }
    return result;
  }
}

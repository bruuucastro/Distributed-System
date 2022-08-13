package grpc.clientStream Smart Farming;

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
 * <pre>
 * The server's interface exports.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ImprovingDistributor.proto")
public final class RegisteredDistribuitorGrpc {

  private RegisteredDistribuitorGrpc() {}

  public static final String SERVICE_NAME = "SmartFarming.RegisteredDistribuitor";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.clientStream Smart Farming.RequestDistribuitors,
      grpc.clientStream Smart Farming.DistribuitorAvailable> getRegisteredDistribuitorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisteredDistribuitor",
      requestType = grpc.clientStream Smart Farming.RequestDistribuitors.class,
      responseType = grpc.clientStream Smart Farming.DistribuitorAvailable.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.clientStream Smart Farming.RequestDistribuitors,
      grpc.clientStream Smart Farming.DistribuitorAvailable> getRegisteredDistribuitorMethod() {
    io.grpc.MethodDescriptor<grpc.clientStream Smart Farming.RequestDistribuitors, grpc.clientStream Smart Farming.DistribuitorAvailable> getRegisteredDistribuitorMethod;
    if ((getRegisteredDistribuitorMethod = RegisteredDistribuitorGrpc.getRegisteredDistribuitorMethod) == null) {
      synchronized (RegisteredDistribuitorGrpc.class) {
        if ((getRegisteredDistribuitorMethod = RegisteredDistribuitorGrpc.getRegisteredDistribuitorMethod) == null) {
          RegisteredDistribuitorGrpc.getRegisteredDistribuitorMethod = getRegisteredDistribuitorMethod = 
              io.grpc.MethodDescriptor.<grpc.clientStream Smart Farming.RequestDistribuitors, grpc.clientStream Smart Farming.DistribuitorAvailable>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarming.RegisteredDistribuitor", "RegisteredDistribuitor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.clientStream Smart Farming.RequestDistribuitors.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.clientStream Smart Farming.DistribuitorAvailable.getDefaultInstance()))
                  .setSchemaDescriptor(new RegisteredDistribuitorMethodDescriptorSupplier("RegisteredDistribuitor"))
                  .build();
          }
        }
     }
     return getRegisteredDistribuitorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RegisteredDistribuitorStub newStub(io.grpc.Channel channel) {
    return new RegisteredDistribuitorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RegisteredDistribuitorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RegisteredDistribuitorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RegisteredDistribuitorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RegisteredDistribuitorFutureStub(channel);
  }

  /**
   * <pre>
   * The server's interface exports.
   * </pre>
   */
  public static abstract class RegisteredDistribuitorImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * rpc method for client streaming calls
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.clientStream Smart Farming.RequestDistribuitors> registeredDistribuitor(
        io.grpc.stub.StreamObserver<grpc.clientStream Smart Farming.DistribuitorAvailable> responseObserver) {
      return asyncUnimplementedStreamingCall(getRegisteredDistribuitorMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisteredDistribuitorMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.clientStream Smart Farming.RequestDistribuitors,
                grpc.clientStream Smart Farming.DistribuitorAvailable>(
                  this, METHODID_REGISTERED_DISTRIBUITOR)))
          .build();
    }
  }

  /**
   * <pre>
   * The server's interface exports.
   * </pre>
   */
  public static final class RegisteredDistribuitorStub extends io.grpc.stub.AbstractStub<RegisteredDistribuitorStub> {
    private RegisteredDistribuitorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegisteredDistribuitorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegisteredDistribuitorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegisteredDistribuitorStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for client streaming calls
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.clientStream Smart Farming.RequestDistribuitors> registeredDistribuitor(
        io.grpc.stub.StreamObserver<grpc.clientStream Smart Farming.DistribuitorAvailable> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getRegisteredDistribuitorMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The server's interface exports.
   * </pre>
   */
  public static final class RegisteredDistribuitorBlockingStub extends io.grpc.stub.AbstractStub<RegisteredDistribuitorBlockingStub> {
    private RegisteredDistribuitorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegisteredDistribuitorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegisteredDistribuitorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegisteredDistribuitorBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * The server's interface exports.
   * </pre>
   */
  public static final class RegisteredDistribuitorFutureStub extends io.grpc.stub.AbstractStub<RegisteredDistribuitorFutureStub> {
    private RegisteredDistribuitorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RegisteredDistribuitorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegisteredDistribuitorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RegisteredDistribuitorFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_REGISTERED_DISTRIBUITOR = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RegisteredDistribuitorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RegisteredDistribuitorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTERED_DISTRIBUITOR:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.registeredDistribuitor(
              (io.grpc.stub.StreamObserver<grpc.clientStream Smart Farming.DistribuitorAvailable>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RegisteredDistribuitorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RegisteredDistribuitorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.clientStream Smart Farming.Smart Farming.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RegisteredDistribuitor");
    }
  }

  private static final class RegisteredDistribuitorFileDescriptorSupplier
      extends RegisteredDistribuitorBaseDescriptorSupplier {
    RegisteredDistribuitorFileDescriptorSupplier() {}
  }

  private static final class RegisteredDistribuitorMethodDescriptorSupplier
      extends RegisteredDistribuitorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RegisteredDistribuitorMethodDescriptorSupplier(String methodName) {
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
      synchronized (RegisteredDistribuitorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RegisteredDistribuitorFileDescriptorSupplier())
              .addMethod(getRegisteredDistribuitorMethod())
              .build();
        }
      }
    }
    return result;
  }
}

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
    comments = "Source: ProductQualityType.proto")
public final class GrainTypeGrpc {

  private GrainTypeGrpc() {}

  public static final String SERVICE_NAME = "SmartFarming.GrainType";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.clientStream Smart Farming.RequestGrainType,
      grpc.clientStream Smart Farming.BetterGrain> getTypeGrainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TypeGrain",
      requestType = grpc.clientStream Smart Farming.RequestGrainType.class,
      responseType = grpc.clientStream Smart Farming.BetterGrain.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.clientStream Smart Farming.RequestGrainType,
      grpc.clientStream Smart Farming.BetterGrain> getTypeGrainMethod() {
    io.grpc.MethodDescriptor<grpc.clientStream Smart Farming.RequestGrainType, grpc.clientStream Smart Farming.BetterGrain> getTypeGrainMethod;
    if ((getTypeGrainMethod = GrainTypeGrpc.getTypeGrainMethod) == null) {
      synchronized (GrainTypeGrpc.class) {
        if ((getTypeGrainMethod = GrainTypeGrpc.getTypeGrainMethod) == null) {
          GrainTypeGrpc.getTypeGrainMethod = getTypeGrainMethod = 
              io.grpc.MethodDescriptor.<grpc.clientStream Smart Farming.RequestGrainType, grpc.clientStream Smart Farming.BetterGrain>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarming.GrainType", "TypeGrain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.clientStream Smart Farming.RequestGrainType.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.clientStream Smart Farming.BetterGrain.getDefaultInstance()))
                  .setSchemaDescriptor(new GrainTypeMethodDescriptorSupplier("TypeGrain"))
                  .build();
          }
        }
     }
     return getTypeGrainMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GrainTypeStub newStub(io.grpc.Channel channel) {
    return new GrainTypeStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GrainTypeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GrainTypeBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GrainTypeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GrainTypeFutureStub(channel);
  }

  /**
   * <pre>
   * The server's interface exports.
   * </pre>
   */
  public static abstract class GrainTypeImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * rpc method for client streaming calls
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.clientStream Smart Farming.RequestGrainType> typeGrain(
        io.grpc.stub.StreamObserver<grpc.clientStream Smart Farming.BetterGrain> responseObserver) {
      return asyncUnimplementedStreamingCall(getTypeGrainMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTypeGrainMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.clientStream Smart Farming.RequestGrainType,
                grpc.clientStream Smart Farming.BetterGrain>(
                  this, METHODID_TYPE_GRAIN)))
          .build();
    }
  }

  /**
   * <pre>
   * The server's interface exports.
   * </pre>
   */
  public static final class GrainTypeStub extends io.grpc.stub.AbstractStub<GrainTypeStub> {
    private GrainTypeStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GrainTypeStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrainTypeStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GrainTypeStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for client streaming calls
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.clientStream Smart Farming.RequestGrainType> typeGrain(
        io.grpc.stub.StreamObserver<grpc.clientStream Smart Farming.BetterGrain> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getTypeGrainMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The server's interface exports.
   * </pre>
   */
  public static final class GrainTypeBlockingStub extends io.grpc.stub.AbstractStub<GrainTypeBlockingStub> {
    private GrainTypeBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GrainTypeBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrainTypeBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GrainTypeBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * The server's interface exports.
   * </pre>
   */
  public static final class GrainTypeFutureStub extends io.grpc.stub.AbstractStub<GrainTypeFutureStub> {
    private GrainTypeFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GrainTypeFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GrainTypeFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GrainTypeFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_TYPE_GRAIN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GrainTypeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GrainTypeImplBase serviceImpl, int methodId) {
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
        case METHODID_TYPE_GRAIN:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.typeGrain(
              (io.grpc.stub.StreamObserver<grpc.clientStream Smart Farming.BetterGrain>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class GrainTypeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GrainTypeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.clientStream Smart Farming.Smart Farming.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GrainType");
    }
  }

  private static final class GrainTypeFileDescriptorSupplier
      extends GrainTypeBaseDescriptorSupplier {
    GrainTypeFileDescriptorSupplier() {}
  }

  private static final class GrainTypeMethodDescriptorSupplier
      extends GrainTypeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GrainTypeMethodDescriptorSupplier(String methodName) {
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
      synchronized (GrainTypeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GrainTypeFileDescriptorSupplier())
              .addMethod(getTypeGrainMethod())
              .build();
        }
      }
    }
    return result;
  }
}

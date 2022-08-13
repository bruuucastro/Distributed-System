package grpc.unary Smart Farming;

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
    comments = "Source: DataCollectionIrrigated.proto")
public final class DataCollectionIrrigatedGrpc {

  private DataCollectionIrrigatedGrpc() {}

  public static final String SERVICE_NAME = "SmartFarming.DataCollectionIrrigated";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.unary Smart Farming.RequestStatus,
      grpc.unary Smart Farming.StatusIrrigation> getIrrigatedareasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Irrigatedareas",
      requestType = grpc.unary Smart Farming.RequestStatus.class,
      responseType = grpc.unary Smart Farming.StatusIrrigation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.unary Smart Farming.RequestStatus,
      grpc.unary Smart Farming.StatusIrrigation> getIrrigatedareasMethod() {
    io.grpc.MethodDescriptor<grpc.unary Smart Farming.RequestStatus, grpc.unary Smart Farming.StatusIrrigation> getIrrigatedareasMethod;
    if ((getIrrigatedareasMethod = DataCollectionIrrigatedGrpc.getIrrigatedareasMethod) == null) {
      synchronized (DataCollectionIrrigatedGrpc.class) {
        if ((getIrrigatedareasMethod = DataCollectionIrrigatedGrpc.getIrrigatedareasMethod) == null) {
          DataCollectionIrrigatedGrpc.getIrrigatedareasMethod = getIrrigatedareasMethod = 
              io.grpc.MethodDescriptor.<grpc.unary Smart Farming.RequestStatus, grpc.unary Smart Farming.StatusIrrigation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarming.DataCollectionIrrigated", "Irrigatedareas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.unary Smart Farming.RequestStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.unary Smart Farming.StatusIrrigation.getDefaultInstance()))
                  .setSchemaDescriptor(new DataCollectionIrrigatedMethodDescriptorSupplier("Irrigatedareas"))
                  .build();
          }
        }
     }
     return getIrrigatedareasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.unary Smart Farming.Message,
      grpc.unary Smart Farming.Empty> getEmptyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "empty",
      requestType = grpc.unary Smart Farming.Message.class,
      responseType = grpc.unary Smart Farming.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.unary Smart Farming.Message,
      grpc.unary Smart Farming.Empty> getEmptyMethod() {
    io.grpc.MethodDescriptor<grpc.unary Smart Farming.Message, grpc.unary Smart Farming.Empty> getEmptyMethod;
    if ((getEmptyMethod = DataCollectionIrrigatedGrpc.getEmptyMethod) == null) {
      synchronized (DataCollectionIrrigatedGrpc.class) {
        if ((getEmptyMethod = DataCollectionIrrigatedGrpc.getEmptyMethod) == null) {
          DataCollectionIrrigatedGrpc.getEmptyMethod = getEmptyMethod = 
              io.grpc.MethodDescriptor.<grpc.unary Smart Farming.Message, grpc.unary Smart Farming.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarming.DataCollectionIrrigated", "empty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.unary Smart Farming.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.unary Smart Farming.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DataCollectionIrrigatedMethodDescriptorSupplier("empty"))
                  .build();
          }
        }
     }
     return getEmptyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataCollectionIrrigatedStub newStub(io.grpc.Channel channel) {
    return new DataCollectionIrrigatedStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataCollectionIrrigatedBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DataCollectionIrrigatedBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataCollectionIrrigatedFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DataCollectionIrrigatedFutureStub(channel);
  }

  /**
   * <pre>
   * The server's interface exports.
   * </pre>
   */
  public static abstract class DataCollectionIrrigatedImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * rpc method for unary calls
     * </pre>
     */
    public void irrigatedareas(grpc.unary Smart Farming.RequestStatus request,
        io.grpc.stub.StreamObserver<grpc.unary Smart Farming.StatusIrrigation> responseObserver) {
      asyncUnimplementedUnaryCall(getIrrigatedareasMethod(), responseObserver);
    }

    /**
     * <pre>
     * rpc method that does not return any response
     * </pre>
     */
    public void empty(grpc.unary Smart Farming.Message request,
        io.grpc.stub.StreamObserver<grpc.unary Smart Farming.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getEmptyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getIrrigatedareasMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.unary Smart Farming.RequestStatus,
                grpc.unary Smart Farming.StatusIrrigation>(
                  this, METHODID_IRRIGATEDAREAS)))
          .addMethod(
            getEmptyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.unary Smart Farming.Message,
                grpc.unary Smart Farming.Empty>(
                  this, METHODID_EMPTY)))
          .build();
    }
  }

  /**
   * <pre>
   * The server's interface exports.
   * </pre>
   */
  public static final class DataCollectionIrrigatedStub extends io.grpc.stub.AbstractStub<DataCollectionIrrigatedStub> {
    private DataCollectionIrrigatedStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataCollectionIrrigatedStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataCollectionIrrigatedStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataCollectionIrrigatedStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for unary calls
     * </pre>
     */
    public void irrigatedareas(grpc.unary Smart Farming.RequestStatus request,
        io.grpc.stub.StreamObserver<grpc.unary Smart Farming.StatusIrrigation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIrrigatedareasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * rpc method that does not return any response
     * </pre>
     */
    public void empty(grpc.unary Smart Farming.Message request,
        io.grpc.stub.StreamObserver<grpc.unary Smart Farming.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmptyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The server's interface exports.
   * </pre>
   */
  public static final class DataCollectionIrrigatedBlockingStub extends io.grpc.stub.AbstractStub<DataCollectionIrrigatedBlockingStub> {
    private DataCollectionIrrigatedBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataCollectionIrrigatedBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataCollectionIrrigatedBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataCollectionIrrigatedBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for unary calls
     * </pre>
     */
    public grpc.unary Smart Farming.StatusIrrigation irrigatedareas(grpc.unary Smart Farming.RequestStatus request) {
      return blockingUnaryCall(
          getChannel(), getIrrigatedareasMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * rpc method that does not return any response
     * </pre>
     */
    public grpc.unary Smart Farming.Empty empty(grpc.unary Smart Farming.Message request) {
      return blockingUnaryCall(
          getChannel(), getEmptyMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The server's interface exports.
   * </pre>
   */
  public static final class DataCollectionIrrigatedFutureStub extends io.grpc.stub.AbstractStub<DataCollectionIrrigatedFutureStub> {
    private DataCollectionIrrigatedFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataCollectionIrrigatedFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataCollectionIrrigatedFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataCollectionIrrigatedFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for unary calls
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.unary Smart Farming.StatusIrrigation> irrigatedareas(
        grpc.unary Smart Farming.RequestStatus request) {
      return futureUnaryCall(
          getChannel().newCall(getIrrigatedareasMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * rpc method that does not return any response
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.unary Smart Farming.Empty> empty(
        grpc.unary Smart Farming.Message request) {
      return futureUnaryCall(
          getChannel().newCall(getEmptyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_IRRIGATEDAREAS = 0;
  private static final int METHODID_EMPTY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataCollectionIrrigatedImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataCollectionIrrigatedImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_IRRIGATEDAREAS:
          serviceImpl.irrigatedareas((grpc.unary Smart Farming.RequestStatus) request,
              (io.grpc.stub.StreamObserver<grpc.unary Smart Farming.StatusIrrigation>) responseObserver);
          break;
        case METHODID_EMPTY:
          serviceImpl.empty((grpc.unary Smart Farming.Message) request,
              (io.grpc.stub.StreamObserver<grpc.unary Smart Farming.Empty>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DataCollectionIrrigatedBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataCollectionIrrigatedBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.unary Smart Farming.Smart Farming.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataCollectionIrrigated");
    }
  }

  private static final class DataCollectionIrrigatedFileDescriptorSupplier
      extends DataCollectionIrrigatedBaseDescriptorSupplier {
    DataCollectionIrrigatedFileDescriptorSupplier() {}
  }

  private static final class DataCollectionIrrigatedMethodDescriptorSupplier
      extends DataCollectionIrrigatedBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataCollectionIrrigatedMethodDescriptorSupplier(String methodName) {
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
      synchronized (DataCollectionIrrigatedGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataCollectionIrrigatedFileDescriptorSupplier())
              .addMethod(getIrrigatedareasMethod())
              .addMethod(getEmptyMethod())
              .build();
        }
      }
    }
    return result;
  }
}

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
    comments = "Source: DataCollectionCheck.proto")
public final class DataCollectionGrpc {

  private DataCollectionGrpc() {}

  public static final String SERVICE_NAME = "SmartFarming.DataCollection";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.unary Smart Farming.RequestPhoto,
      grpc.unary Smart Farming.ReceivePhoto> getCheckPlantioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkPlantio",
      requestType = grpc.unary Smart Farming.RequestPhoto.class,
      responseType = grpc.unary Smart Farming.ReceivePhoto.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.unary Smart Farming.RequestPhoto,
      grpc.unary Smart Farming.ReceivePhoto> getCheckPlantioMethod() {
    io.grpc.MethodDescriptor<grpc.unary Smart Farming.RequestPhoto, grpc.unary Smart Farming.ReceivePhoto> getCheckPlantioMethod;
    if ((getCheckPlantioMethod = DataCollectionGrpc.getCheckPlantioMethod) == null) {
      synchronized (DataCollectionGrpc.class) {
        if ((getCheckPlantioMethod = DataCollectionGrpc.getCheckPlantioMethod) == null) {
          DataCollectionGrpc.getCheckPlantioMethod = getCheckPlantioMethod = 
              io.grpc.MethodDescriptor.<grpc.unary Smart Farming.RequestPhoto, grpc.unary Smart Farming.ReceivePhoto>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarming.DataCollection", "checkPlantio"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.unary Smart Farming.RequestPhoto.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.unary Smart Farming.ReceivePhoto.getDefaultInstance()))
                  .setSchemaDescriptor(new DataCollectionMethodDescriptorSupplier("checkPlantio"))
                  .build();
          }
        }
     }
     return getCheckPlantioMethod;
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
    if ((getEmptyMethod = DataCollectionGrpc.getEmptyMethod) == null) {
      synchronized (DataCollectionGrpc.class) {
        if ((getEmptyMethod = DataCollectionGrpc.getEmptyMethod) == null) {
          DataCollectionGrpc.getEmptyMethod = getEmptyMethod = 
              io.grpc.MethodDescriptor.<grpc.unary Smart Farming.Message, grpc.unary Smart Farming.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarming.DataCollection", "empty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.unary Smart Farming.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.unary Smart Farming.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new DataCollectionMethodDescriptorSupplier("empty"))
                  .build();
          }
        }
     }
     return getEmptyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataCollectionStub newStub(io.grpc.Channel channel) {
    return new DataCollectionStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataCollectionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DataCollectionBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataCollectionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DataCollectionFutureStub(channel);
  }

  /**
   * <pre>
   * The server's interface exports.
   * </pre>
   */
  public static abstract class DataCollectionImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * rpc method for unary calls
     * </pre>
     */
    public void checkPlantio(grpc.unary Smart Farming.RequestPhoto request,
        io.grpc.stub.StreamObserver<grpc.unary Smart Farming.ReceivePhoto> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckPlantioMethod(), responseObserver);
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
            getCheckPlantioMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.unary Smart Farming.RequestPhoto,
                grpc.unary Smart Farming.ReceivePhoto>(
                  this, METHODID_CHECK_PLANTIO)))
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
  public static final class DataCollectionStub extends io.grpc.stub.AbstractStub<DataCollectionStub> {
    private DataCollectionStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataCollectionStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataCollectionStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataCollectionStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for unary calls
     * </pre>
     */
    public void checkPlantio(grpc.unary Smart Farming.RequestPhoto request,
        io.grpc.stub.StreamObserver<grpc.unary Smart Farming.ReceivePhoto> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckPlantioMethod(), getCallOptions()), request, responseObserver);
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
  public static final class DataCollectionBlockingStub extends io.grpc.stub.AbstractStub<DataCollectionBlockingStub> {
    private DataCollectionBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataCollectionBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataCollectionBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataCollectionBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for unary calls
     * </pre>
     */
    public grpc.unary Smart Farming.ReceivePhoto checkPlantio(grpc.unary Smart Farming.RequestPhoto request) {
      return blockingUnaryCall(
          getChannel(), getCheckPlantioMethod(), getCallOptions(), request);
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
  public static final class DataCollectionFutureStub extends io.grpc.stub.AbstractStub<DataCollectionFutureStub> {
    private DataCollectionFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataCollectionFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataCollectionFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataCollectionFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc method for unary calls
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.unary Smart Farming.ReceivePhoto> checkPlantio(
        grpc.unary Smart Farming.RequestPhoto request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckPlantioMethod(), getCallOptions()), request);
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

  private static final int METHODID_CHECK_PLANTIO = 0;
  private static final int METHODID_EMPTY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataCollectionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataCollectionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK_PLANTIO:
          serviceImpl.checkPlantio((grpc.unary Smart Farming.RequestPhoto) request,
              (io.grpc.stub.StreamObserver<grpc.unary Smart Farming.ReceivePhoto>) responseObserver);
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

  private static abstract class DataCollectionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataCollectionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.unary Smart Farming.Smart Farming.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataCollection");
    }
  }

  private static final class DataCollectionFileDescriptorSupplier
      extends DataCollectionBaseDescriptorSupplier {
    DataCollectionFileDescriptorSupplier() {}
  }

  private static final class DataCollectionMethodDescriptorSupplier
      extends DataCollectionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataCollectionMethodDescriptorSupplier(String methodName) {
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
      synchronized (DataCollectionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataCollectionFileDescriptorSupplier())
              .addMethod(getCheckPlantioMethod())
              .addMethod(getEmptyMethod())
              .build();
        }
      }
    }
    return result;
  }
}

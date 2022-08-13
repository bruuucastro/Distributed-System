package grpc.bidirectional Smart Farming;

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
    comments = "Source: ProductQualityData.proto")
public final class ProductQualityDataGrpc {

  private ProductQualityDataGrpc() {}

  public static final String SERVICE_NAME = "SmartFarming.ProductQualityData";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.bidirectional Smart Farming.Request_Harvest,
      grpc.bidirectional Smart Farming.BestGrains> getDataHavestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "dataHavest",
      requestType = grpc.bidirectional Smart Farming.Request_Harvest.class,
      responseType = grpc.bidirectional Smart Farming.BestGrains.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.bidirectional Smart Farming.Request_Harvest,
      grpc.bidirectional Smart Farming.BestGrains> getDataHavestMethod() {
    io.grpc.MethodDescriptor<grpc.bidirectional Smart Farming.Request_Harvest, grpc.bidirectional Smart Farming.BestGrains> getDataHavestMethod;
    if ((getDataHavestMethod = ProductQualityDataGrpc.getDataHavestMethod) == null) {
      synchronized (ProductQualityDataGrpc.class) {
        if ((getDataHavestMethod = ProductQualityDataGrpc.getDataHavestMethod) == null) {
          ProductQualityDataGrpc.getDataHavestMethod = getDataHavestMethod = 
              io.grpc.MethodDescriptor.<grpc.bidirectional Smart Farming.Request_Harvest, grpc.bidirectional Smart Farming.BestGrains>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "SmartFarming.ProductQualityData", "dataHavest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.bidirectional Smart Farming.Request_Harvest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.bidirectional Smart Farming.BestGrains.getDefaultInstance()))
                  .setSchemaDescriptor(new ProductQualityDataMethodDescriptorSupplier("dataHavest"))
                  .build();
          }
        }
     }
     return getDataHavestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductQualityDataStub newStub(io.grpc.Channel channel) {
    return new ProductQualityDataStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductQualityDataBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProductQualityDataBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductQualityDataFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProductQualityDataFutureStub(channel);
  }

  /**
   * <pre>
   * The server's interface exports.
   * </pre>
   */
  public static abstract class ProductQualityDataImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * bidirectional streaming calls using the rpc method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.bidirectional Smart Farming.Request_Harvest> dataHavest(
        io.grpc.stub.StreamObserver<grpc.bidirectional Smart Farming.BestGrains> responseObserver) {
      return asyncUnimplementedStreamingCall(getDataHavestMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDataHavestMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.bidirectional Smart Farming.Request_Harvest,
                grpc.bidirectional Smart Farming.BestGrains>(
                  this, METHODID_DATA_HAVEST)))
          .build();
    }
  }

  /**
   * <pre>
   * The server's interface exports.
   * </pre>
   */
  public static final class ProductQualityDataStub extends io.grpc.stub.AbstractStub<ProductQualityDataStub> {
    private ProductQualityDataStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductQualityDataStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductQualityDataStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductQualityDataStub(channel, callOptions);
    }

    /**
     * <pre>
     * bidirectional streaming calls using the rpc method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.bidirectional Smart Farming.Request_Harvest> dataHavest(
        io.grpc.stub.StreamObserver<grpc.bidirectional Smart Farming.BestGrains> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getDataHavestMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * The server's interface exports.
   * </pre>
   */
  public static final class ProductQualityDataBlockingStub extends io.grpc.stub.AbstractStub<ProductQualityDataBlockingStub> {
    private ProductQualityDataBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductQualityDataBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductQualityDataBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductQualityDataBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * The server's interface exports.
   * </pre>
   */
  public static final class ProductQualityDataFutureStub extends io.grpc.stub.AbstractStub<ProductQualityDataFutureStub> {
    private ProductQualityDataFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProductQualityDataFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductQualityDataFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProductQualityDataFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_DATA_HAVEST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductQualityDataImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductQualityDataImplBase serviceImpl, int methodId) {
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
        case METHODID_DATA_HAVEST:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.dataHavest(
              (io.grpc.stub.StreamObserver<grpc.bidirectional Smart Farming.BestGrains>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProductQualityDataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductQualityDataBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.bidirectional Smart Farming.Smart Farming.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductQualityData");
    }
  }

  private static final class ProductQualityDataFileDescriptorSupplier
      extends ProductQualityDataBaseDescriptorSupplier {
    ProductQualityDataFileDescriptorSupplier() {}
  }

  private static final class ProductQualityDataMethodDescriptorSupplier
      extends ProductQualityDataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductQualityDataMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductQualityDataGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductQualityDataFileDescriptorSupplier())
              .addMethod(getDataHavestMethod())
              .build();
        }
      }
    }
    return result;
  }
}

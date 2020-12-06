package com.sevnis.grpcbootdemo;

import com.sevnis.grpcbootdemo.HelloServiceGrpc.HelloServiceBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcbootdemoClient {

  public static void main(String[] args) {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8081).usePlaintext().build();

    HelloServiceBlockingStub stub = HelloServiceGrpc.newBlockingStub(channel);
    HelloResponse helloResponse = stub.hello(HelloRequest.newBuilder().setFirstName("Irwan").setLastName("Hendra").build());
    System.out.println("Greeting: " + helloResponse.getGreeting());
  }
}

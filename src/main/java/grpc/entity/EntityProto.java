// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entity/req_res.proto

package grpc.entity;

public final class EntityProto {
  private EntityProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_cooze_grpc_entity_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_cooze_grpc_entity_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_cooze_grpc_entity_HelloReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_cooze_grpc_entity_HelloReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_cooze_grpc_entity_Account_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_cooze_grpc_entity_Account_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_cooze_grpc_entity_AccountResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_cooze_grpc_entity_AccountResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\024entity/req_res.proto\022\025org.cooze.grpc.e" +
      "ntity\"\034\n\014HelloRequest\022\014\n\004name\030\001 \001(\t\"\035\n\nH" +
      "elloReply\022\017\n\007message\030\001 \001(\t\"1\n\007Account\022\014\n" +
      "\004name\030\001 \001(\t\022\013\n\003sex\030\002 \001(\t\022\013\n\003age\030\003 \001(\005\"]\n" +
      "\017AccountResponse\022\013\n\003msg\030\001 \001(\t\022\014\n\004code\030\002 " +
      "\001(\005\022/\n\007results\030\003 \003(\0132\036.org.cooze.grpc.en" +
      "tity.AccountB&\n\025org.cooze.grpc.entityB\013E" +
      "ntityProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_org_cooze_grpc_entity_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_cooze_grpc_entity_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_cooze_grpc_entity_HelloRequest_descriptor,
        new String[] { "Name", });
    internal_static_org_cooze_grpc_entity_HelloReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_cooze_grpc_entity_HelloReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_cooze_grpc_entity_HelloReply_descriptor,
        new String[] { "Message", });
    internal_static_org_cooze_grpc_entity_Account_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_cooze_grpc_entity_Account_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_cooze_grpc_entity_Account_descriptor,
        new String[] { "Name", "Sex", "Age", });
    internal_static_org_cooze_grpc_entity_AccountResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_org_cooze_grpc_entity_AccountResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_cooze_grpc_entity_AccountResponse_descriptor,
        new String[] { "Msg", "Code", "Results", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/business/record_manage.proto

package com.volcengine.service.live.model.business;

public final class RecordManage {
  private RecordManage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Live_Models_Business_RecordTaskFile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Live_Models_Business_RecordTaskFile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Live_Models_Business_RecordHistoryInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Live_Models_Business_RecordHistoryInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n!live/business/record_manage.proto\022\037Vol" +
      "cengine.Live.Models.Business\032#live/busin" +
      "ess/snapshot_manage.proto\"\277\001\n\016RecordTask" +
      "File\022\013\n\003Vid\030\001 \001(\t\022\r\n\005Vhost\030\002 \001(\t\022\013\n\003App\030" +
      "\003 \001(\t\022\016\n\006Stream\030\004 \001(\t\022\016\n\006Bucket\030\005 \001(\t\022\014\n" +
      "\004Path\030\006 \001(\t\022\020\n\010Duration\030\007 \001(\t\022\021\n\tStartTi" +
      "me\030\010 \001(\t\022\016\n\006Format\030\t \001(\t\022\017\n\007EndTime\030\n \001(" +
      "\t\022\020\n\010FileName\030\013 \001(\t\"\223\001\n\021RecordHistoryInf" +
      "o\022=\n\004Data\030\001 \003(\0132/.Volcengine.Live.Models" +
      ".Business.RecordTaskFile\022?\n\nPagination\030\002" +
      " \001(\0132+.Volcengine.Live.Models.Business.P" +
      "aginationB\324\001\n*com.volcengine.service.liv" +
      "e.model.businessB\014RecordManageP\001ZBgithub" +
      ".com/volcengine/volc-sdk-golang/service/" +
      "live/models/business\240\001\001\330\001\001\302\002\000\312\002!Volc\\Ser" +
      "vice\\Live\\Models\\Business\342\002$Volc\\Service" +
      "\\Live\\Models\\GPBMetadatab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          SnapshotManage.getDescriptor(),
        });
    internal_static_Volcengine_Live_Models_Business_RecordTaskFile_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Volcengine_Live_Models_Business_RecordTaskFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Live_Models_Business_RecordTaskFile_descriptor,
        new String[] { "Vid", "Vhost", "App", "Stream", "Bucket", "Path", "Duration", "StartTime", "Format", "EndTime", "FileName", });
    internal_static_Volcengine_Live_Models_Business_RecordHistoryInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Volcengine_Live_Models_Business_RecordHistoryInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Live_Models_Business_RecordHistoryInfo_descriptor,
        new String[] { "Data", "Pagination", });
    SnapshotManage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
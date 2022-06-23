// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodRetrieveTranscodeResultRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodRetrieveTranscodeResultRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 视频Id
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The vid.
   */
  java.lang.String getVid();
  /**
   * <pre>
   * 视频Id
   * </pre>
   *
   * <code>string Vid = 1;</code>
   * @return The bytes for vid.
   */
  com.google.protobuf.ByteString
      getVidBytes();

  /**
   * <pre>
   * 预期获取的结果类型，可选：inspection、category_tags，支持多选，用,分隔，例如inspection,category_tags
   * </pre>
   *
   * <code>string ResultType = 2;</code>
   * @return The resultType.
   */
  java.lang.String getResultType();
  /**
   * <pre>
   * 预期获取的结果类型，可选：inspection、category_tags，支持多选，用,分隔，例如inspection,category_tags
   * </pre>
   *
   * <code>string ResultType = 2;</code>
   * @return The bytes for resultType.
   */
  com.google.protobuf.ByteString
      getResultTypeBytes();
}

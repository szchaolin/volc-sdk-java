// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodListCdnAccessLogRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodListCdnAccessLogRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 域名（当前仅支持设置一个域名） 
   * </pre>
   *
   * <code>string Domains = 1;</code>
   * @return The domains.
   */
  java.lang.String getDomains();
  /**
   * <pre>
   * 域名（当前仅支持设置一个域名） 
   * </pre>
   *
   * <code>string Domains = 1;</code>
   * @return The bytes for domains.
   */
  com.google.protobuf.ByteString
      getDomainsBytes();

  /**
   * <pre>
   * 查询起始时间戳，单位：Unix秒级时间戳 
   * </pre>
   *
   * <code>int32 StartTimestamp = 2;</code>
   * @return The startTimestamp.
   */
  int getStartTimestamp();

  /**
   * <pre>
   * 查询结束时间戳，单位：Unix秒级时间戳 
   * </pre>
   *
   * <code>int32 EndTimestamp = 3;</code>
   * @return The endTimestamp.
   */
  int getEndTimestamp();

  /**
   * <pre>
   * 空间名称 
   * </pre>
   *
   * <code>string SpaceName = 4;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <pre>
   * 空间名称 
   * </pre>
   *
   * <code>string SpaceName = 4;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();
}

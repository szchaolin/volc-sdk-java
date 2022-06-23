// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodListCdnTopAccessUrlRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodListCdnTopAccessUrlRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 域名（当前仅支持一个域名) 
   * </pre>
   *
   * <code>string Domains = 1;</code>
   * @return The domains.
   */
  java.lang.String getDomains();
  /**
   * <pre>
   * 域名（当前仅支持一个域名) 
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
   * 排序方式，默认值为pv。取值：flux - 流量, pv -访问量 
   * </pre>
   *
   * <code>string SortType = 4;</code>
   * @return The sortType.
   */
  java.lang.String getSortType();
  /**
   * <pre>
   * 排序方式，默认值为pv。取值：flux - 流量, pv -访问量 
   * </pre>
   *
   * <code>string SortType = 4;</code>
   * @return The bytes for sortType.
   */
  com.google.protobuf.ByteString
      getSortTypeBytes();
}

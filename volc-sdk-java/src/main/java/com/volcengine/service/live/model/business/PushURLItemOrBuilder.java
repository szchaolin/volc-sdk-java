// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/business/addr.proto

package com.volcengine.service.live.model.business;

public interface PushURLItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Live.Models.Business.PushURLItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *推流地址
   * </pre>
   *
   * <code>string URL = 1;</code>
   * @return The uRL.
   */
  String getURL();
  /**
   * <pre>
   *推流地址
   * </pre>
   *
   * <code>string URL = 1;</code>
   * @return The bytes for uRL.
   */
  com.google.protobuf.ByteString
      getURLBytes();

  /**
   * <pre>
   * OBS推流服务器地址
   * </pre>
   *
   * <code>string DomainApp = 2;</code>
   * @return The domainApp.
   */
  String getDomainApp();
  /**
   * <pre>
   * OBS推流服务器地址
   * </pre>
   *
   * <code>string DomainApp = 2;</code>
   * @return The bytes for domainApp.
   */
  com.google.protobuf.ByteString
      getDomainAppBytes();

  /**
   * <pre>
   * OBS串流密钥
   * </pre>
   *
   * <code>string StreamSign = 3;</code>
   * @return The streamSign.
   */
  String getStreamSign();
  /**
   * <pre>
   * OBS串流密钥
   * </pre>
   *
   * <code>string StreamSign = 3;</code>
   * @return The bytes for streamSign.
   */
  com.google.protobuf.ByteString
      getStreamSignBytes();
}

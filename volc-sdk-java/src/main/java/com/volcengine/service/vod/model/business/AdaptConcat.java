// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_workflow.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.AdaptConcat}
 */
public final class AdaptConcat extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.AdaptConcat)
    AdaptConcatOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdaptConcat.newBuilder() to construct.
  private AdaptConcat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdaptConcat() {
    concats_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdaptConcat();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AdaptConcat(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.volcengine.service.vod.model.business.AnchorSize.Builder subBuilder = null;
            if (anchorSize_ != null) {
              subBuilder = anchorSize_.toBuilder();
            }
            anchorSize_ = input.readMessage(com.volcengine.service.vod.model.business.AnchorSize.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(anchorSize_);
              anchorSize_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              concats_ = new java.util.ArrayList<com.volcengine.service.vod.model.business.ConcatDefinition>();
              mutable_bitField0_ |= 0x00000001;
            }
            concats_.add(
                input.readMessage(com.volcengine.service.vod.model.business.ConcatDefinition.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        concats_ = java.util.Collections.unmodifiableList(concats_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_AdaptConcat_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_AdaptConcat_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.AdaptConcat.class, com.volcengine.service.vod.model.business.AdaptConcat.Builder.class);
  }

  public static final int ANCHORSIZE_FIELD_NUMBER = 1;
  private com.volcengine.service.vod.model.business.AnchorSize anchorSize_;
  /**
   * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
   * @return Whether the anchorSize field is set.
   */
  @java.lang.Override
  public boolean hasAnchorSize() {
    return anchorSize_ != null;
  }
  /**
   * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
   * @return The anchorSize.
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.AnchorSize getAnchorSize() {
    return anchorSize_ == null ? com.volcengine.service.vod.model.business.AnchorSize.getDefaultInstance() : anchorSize_;
  }
  /**
   * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.AnchorSizeOrBuilder getAnchorSizeOrBuilder() {
    return getAnchorSize();
  }

  public static final int CONCATS_FIELD_NUMBER = 2;
  private java.util.List<com.volcengine.service.vod.model.business.ConcatDefinition> concats_;
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.ConcatDefinition Concats = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.volcengine.service.vod.model.business.ConcatDefinition> getConcatsList() {
    return concats_;
  }
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.ConcatDefinition Concats = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.volcengine.service.vod.model.business.ConcatDefinitionOrBuilder> 
      getConcatsOrBuilderList() {
    return concats_;
  }
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.ConcatDefinition Concats = 2;</code>
   */
  @java.lang.Override
  public int getConcatsCount() {
    return concats_.size();
  }
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.ConcatDefinition Concats = 2;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.ConcatDefinition getConcats(int index) {
    return concats_.get(index);
  }
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.ConcatDefinition Concats = 2;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.ConcatDefinitionOrBuilder getConcatsOrBuilder(
      int index) {
    return concats_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (anchorSize_ != null) {
      output.writeMessage(1, getAnchorSize());
    }
    for (int i = 0; i < concats_.size(); i++) {
      output.writeMessage(2, concats_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (anchorSize_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAnchorSize());
    }
    for (int i = 0; i < concats_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, concats_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.volcengine.service.vod.model.business.AdaptConcat)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.AdaptConcat other = (com.volcengine.service.vod.model.business.AdaptConcat) obj;

    if (hasAnchorSize() != other.hasAnchorSize()) return false;
    if (hasAnchorSize()) {
      if (!getAnchorSize()
          .equals(other.getAnchorSize())) return false;
    }
    if (!getConcatsList()
        .equals(other.getConcatsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasAnchorSize()) {
      hash = (37 * hash) + ANCHORSIZE_FIELD_NUMBER;
      hash = (53 * hash) + getAnchorSize().hashCode();
    }
    if (getConcatsCount() > 0) {
      hash = (37 * hash) + CONCATS_FIELD_NUMBER;
      hash = (53 * hash) + getConcatsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.AdaptConcat parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.AdaptConcat parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.AdaptConcat parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.AdaptConcat parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.AdaptConcat parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.AdaptConcat parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.AdaptConcat parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.AdaptConcat parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.AdaptConcat parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.AdaptConcat parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.AdaptConcat parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.AdaptConcat parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.volcengine.service.vod.model.business.AdaptConcat prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Volcengine.Vod.Models.Business.AdaptConcat}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.AdaptConcat)
      com.volcengine.service.vod.model.business.AdaptConcatOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_AdaptConcat_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_AdaptConcat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.AdaptConcat.class, com.volcengine.service.vod.model.business.AdaptConcat.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.AdaptConcat.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getConcatsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (anchorSizeBuilder_ == null) {
        anchorSize_ = null;
      } else {
        anchorSize_ = null;
        anchorSizeBuilder_ = null;
      }
      if (concatsBuilder_ == null) {
        concats_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        concatsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_AdaptConcat_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.AdaptConcat getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.AdaptConcat.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.AdaptConcat build() {
      com.volcengine.service.vod.model.business.AdaptConcat result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.AdaptConcat buildPartial() {
      com.volcengine.service.vod.model.business.AdaptConcat result = new com.volcengine.service.vod.model.business.AdaptConcat(this);
      int from_bitField0_ = bitField0_;
      if (anchorSizeBuilder_ == null) {
        result.anchorSize_ = anchorSize_;
      } else {
        result.anchorSize_ = anchorSizeBuilder_.build();
      }
      if (concatsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          concats_ = java.util.Collections.unmodifiableList(concats_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.concats_ = concats_;
      } else {
        result.concats_ = concatsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.volcengine.service.vod.model.business.AdaptConcat) {
        return mergeFrom((com.volcengine.service.vod.model.business.AdaptConcat)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.AdaptConcat other) {
      if (other == com.volcengine.service.vod.model.business.AdaptConcat.getDefaultInstance()) return this;
      if (other.hasAnchorSize()) {
        mergeAnchorSize(other.getAnchorSize());
      }
      if (concatsBuilder_ == null) {
        if (!other.concats_.isEmpty()) {
          if (concats_.isEmpty()) {
            concats_ = other.concats_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureConcatsIsMutable();
            concats_.addAll(other.concats_);
          }
          onChanged();
        }
      } else {
        if (!other.concats_.isEmpty()) {
          if (concatsBuilder_.isEmpty()) {
            concatsBuilder_.dispose();
            concatsBuilder_ = null;
            concats_ = other.concats_;
            bitField0_ = (bitField0_ & ~0x00000001);
            concatsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getConcatsFieldBuilder() : null;
          } else {
            concatsBuilder_.addAllMessages(other.concats_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.volcengine.service.vod.model.business.AdaptConcat parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.AdaptConcat) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.volcengine.service.vod.model.business.AnchorSize anchorSize_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.AnchorSize, com.volcengine.service.vod.model.business.AnchorSize.Builder, com.volcengine.service.vod.model.business.AnchorSizeOrBuilder> anchorSizeBuilder_;
    /**
     * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
     * @return Whether the anchorSize field is set.
     */
    public boolean hasAnchorSize() {
      return anchorSizeBuilder_ != null || anchorSize_ != null;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
     * @return The anchorSize.
     */
    public com.volcengine.service.vod.model.business.AnchorSize getAnchorSize() {
      if (anchorSizeBuilder_ == null) {
        return anchorSize_ == null ? com.volcengine.service.vod.model.business.AnchorSize.getDefaultInstance() : anchorSize_;
      } else {
        return anchorSizeBuilder_.getMessage();
      }
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
     */
    public Builder setAnchorSize(com.volcengine.service.vod.model.business.AnchorSize value) {
      if (anchorSizeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        anchorSize_ = value;
        onChanged();
      } else {
        anchorSizeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
     */
    public Builder setAnchorSize(
        com.volcengine.service.vod.model.business.AnchorSize.Builder builderForValue) {
      if (anchorSizeBuilder_ == null) {
        anchorSize_ = builderForValue.build();
        onChanged();
      } else {
        anchorSizeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
     */
    public Builder mergeAnchorSize(com.volcengine.service.vod.model.business.AnchorSize value) {
      if (anchorSizeBuilder_ == null) {
        if (anchorSize_ != null) {
          anchorSize_ =
            com.volcengine.service.vod.model.business.AnchorSize.newBuilder(anchorSize_).mergeFrom(value).buildPartial();
        } else {
          anchorSize_ = value;
        }
        onChanged();
      } else {
        anchorSizeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
     */
    public Builder clearAnchorSize() {
      if (anchorSizeBuilder_ == null) {
        anchorSize_ = null;
        onChanged();
      } else {
        anchorSize_ = null;
        anchorSizeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
     */
    public com.volcengine.service.vod.model.business.AnchorSize.Builder getAnchorSizeBuilder() {
      
      onChanged();
      return getAnchorSizeFieldBuilder().getBuilder();
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
     */
    public com.volcengine.service.vod.model.business.AnchorSizeOrBuilder getAnchorSizeOrBuilder() {
      if (anchorSizeBuilder_ != null) {
        return anchorSizeBuilder_.getMessageOrBuilder();
      } else {
        return anchorSize_ == null ?
            com.volcengine.service.vod.model.business.AnchorSize.getDefaultInstance() : anchorSize_;
      }
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.AnchorSize AnchorSize = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.AnchorSize, com.volcengine.service.vod.model.business.AnchorSize.Builder, com.volcengine.service.vod.model.business.AnchorSizeOrBuilder> 
        getAnchorSizeFieldBuilder() {
      if (anchorSizeBuilder_ == null) {
        anchorSizeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.volcengine.service.vod.model.business.AnchorSize, com.volcengine.service.vod.model.business.AnchorSize.Builder, com.volcengine.service.vod.model.business.AnchorSizeOrBuilder>(
                getAnchorSize(),
                getParentForChildren(),
                isClean());
        anchorSize_ = null;
      }
      return anchorSizeBuilder_;
    }

    private java.util.List<com.volcengine.service.vod.model.business.ConcatDefinition> concats_ =
      java.util.Collections.emptyList();
    private void ensureConcatsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        concats_ = new java.util.ArrayList<com.volcengine.service.vod.model.business.ConcatDefinition>(concats_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.vod.model.business.ConcatDefinition, com.volcengine.service.vod.model.business.ConcatDefinition.Builder, com.volcengine.service.vod.model.business.ConcatDefinitionOrBuilder> concatsBuilder_;

    /**
     * <code>repeated .Volcengine.Vod.Models.Business.ConcatDefinition Concats = 2;</code>
     */
    public java.util.List<com.volcengine.service.vod.model.business.ConcatDefinition> getConcatsList() {
      if (concatsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(concats_);
      } else {
        return concatsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.ConcatDefinition Concats = 2;</code>
     */
    public int getConcatsCount() {
      if (concatsBuilder_ == null) {
        return concats_.size();
      } else {
        return concatsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.ConcatDefinition Concats = 2;</code>
     */
    public com.volcengine.service.vod.model.business.ConcatDefinition getConcats(int index) {
      if (concatsBuilder_ == null) {
        return concats_.get(index);
      } else {
        return concatsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.ConcatDefinition Concats = 2;</code>
     */
    public Builder setConcats(
        int index, com.volcengine.service.vod.model.business.ConcatDefinition value) {
      if (concatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConcatsIsMutable();
        concats_.set(index, value);
        onChanged();
      } else {
        concatsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.ConcatDefinition Concats = 2;</code>
     */
    public Builder setConcats(
        int index, com.volcengine.service.vod.model.business.ConcatDefinition.Builder builderForValue) {
      if (concatsBuilder_ == null) {
        ensureConcatsIsMutable();
        concats_.set(index, builderForValue.build());
        onChanged();
      } else {
        concatsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.ConcatDefinition Concats = 2;</code>
     */
    public Builder addConcats(com.volcengine.service.vod.model.business.ConcatDefinition value) {
      if (concatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConcatsIsMutable();
        concats_.add(value);
        onChanged();
      } else {
        concatsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.ConcatDefinition Concats = 2;</code>
     */
    public Builder addConcats(
        int index, com.volcengine.service.vod.model.business.ConcatDefinition value) {
      if (concatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureConcatsIsMutable();
        concats_.add(index, value);
        onChanged();
      } else {
        concatsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.ConcatDefinition Concats = 2;</code>
     */
    public Builder addConcats(
        com.volcengine.service.vod.model.business.ConcatDefinition.Builder builderForValue) {
      if (concatsBuilder_ == null) {
        ensureConcatsIsMutable();
        concats_.add(builderForValue.build());
        onChanged();
      } else {
        concatsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.ConcatDefinition Concats = 2;</code>
     */
    public Builder addConcats(
        int index, com.volcengine.service.vod.model.business.ConcatDefinition.Builder builderForValue) {
      if (concatsBuilder_ == null) {
        ensureConcatsIsMutable();
        concats_.add(index, builderForValue.build());
        onChanged();
      } else {
        concatsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.ConcatDefinition Concats = 2;</code>
     */
    public Builder addAllConcats(
        java.lang.Iterable<? extends com.volcengine.service.vod.model.business.ConcatDefinition> values) {
      if (concatsBuilder_ == null) {
        ensureConcatsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, concats_);
        onChanged();
      } else {
        concatsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.ConcatDefinition Concats = 2;</code>
     */
    public Builder clearConcats() {
      if (concatsBuilder_ == null) {
        concats_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        concatsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.ConcatDefinition Concats = 2;</code>
     */
    public Builder removeConcats(int index) {
      if (concatsBuilder_ == null) {
        ensureConcatsIsMutable();
        concats_.remove(index);
        onChanged();
      } else {
        concatsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.ConcatDefinition Concats = 2;</code>
     */
    public com.volcengine.service.vod.model.business.ConcatDefinition.Builder getConcatsBuilder(
        int index) {
      return getConcatsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.ConcatDefinition Concats = 2;</code>
     */
    public com.volcengine.service.vod.model.business.ConcatDefinitionOrBuilder getConcatsOrBuilder(
        int index) {
      if (concatsBuilder_ == null) {
        return concats_.get(index);  } else {
        return concatsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.ConcatDefinition Concats = 2;</code>
     */
    public java.util.List<? extends com.volcengine.service.vod.model.business.ConcatDefinitionOrBuilder> 
         getConcatsOrBuilderList() {
      if (concatsBuilder_ != null) {
        return concatsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(concats_);
      }
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.ConcatDefinition Concats = 2;</code>
     */
    public com.volcengine.service.vod.model.business.ConcatDefinition.Builder addConcatsBuilder() {
      return getConcatsFieldBuilder().addBuilder(
          com.volcengine.service.vod.model.business.ConcatDefinition.getDefaultInstance());
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.ConcatDefinition Concats = 2;</code>
     */
    public com.volcengine.service.vod.model.business.ConcatDefinition.Builder addConcatsBuilder(
        int index) {
      return getConcatsFieldBuilder().addBuilder(
          index, com.volcengine.service.vod.model.business.ConcatDefinition.getDefaultInstance());
    }
    /**
     * <code>repeated .Volcengine.Vod.Models.Business.ConcatDefinition Concats = 2;</code>
     */
    public java.util.List<com.volcengine.service.vod.model.business.ConcatDefinition.Builder> 
         getConcatsBuilderList() {
      return getConcatsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.vod.model.business.ConcatDefinition, com.volcengine.service.vod.model.business.ConcatDefinition.Builder, com.volcengine.service.vod.model.business.ConcatDefinitionOrBuilder> 
        getConcatsFieldBuilder() {
      if (concatsBuilder_ == null) {
        concatsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.volcengine.service.vod.model.business.ConcatDefinition, com.volcengine.service.vod.model.business.ConcatDefinition.Builder, com.volcengine.service.vod.model.business.ConcatDefinitionOrBuilder>(
                concats_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        concats_ = null;
      }
      return concatsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.AdaptConcat)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.AdaptConcat)
  private static final com.volcengine.service.vod.model.business.AdaptConcat DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.AdaptConcat();
  }

  public static com.volcengine.service.vod.model.business.AdaptConcat getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdaptConcat>
      PARSER = new com.google.protobuf.AbstractParser<AdaptConcat>() {
    @java.lang.Override
    public AdaptConcat parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AdaptConcat(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AdaptConcat> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdaptConcat> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.AdaptConcat getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

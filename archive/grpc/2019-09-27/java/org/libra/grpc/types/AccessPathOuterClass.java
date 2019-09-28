// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: access_path.proto

package org.libra.grpc.types;

public final class AccessPathOuterClass {
  private AccessPathOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AccessPathOrBuilder extends
      // @@protoc_insertion_point(interface_extends:types.AccessPath)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes address = 1;</code>
     */
    com.google.protobuf.ByteString getAddress();

    /**
     * <code>bytes path = 2;</code>
     */
    com.google.protobuf.ByteString getPath();
  }
  /**
   * Protobuf type {@code types.AccessPath}
   */
  public  static final class AccessPath extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:types.AccessPath)
      AccessPathOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AccessPath.newBuilder() to construct.
    private AccessPath(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AccessPath() {
      address_ = com.google.protobuf.ByteString.EMPTY;
      path_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AccessPath(
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

              address_ = input.readBytes();
              break;
            }
            case 18: {

              path_ = input.readBytes();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.libra.grpc.types.AccessPathOuterClass.internal_static_types_AccessPath_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.libra.grpc.types.AccessPathOuterClass.internal_static_types_AccessPath_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.libra.grpc.types.AccessPathOuterClass.AccessPath.class, org.libra.grpc.types.AccessPathOuterClass.AccessPath.Builder.class);
    }

    public static final int ADDRESS_FIELD_NUMBER = 1;
    private com.google.protobuf.ByteString address_;
    /**
     * <code>bytes address = 1;</code>
     */
    public com.google.protobuf.ByteString getAddress() {
      return address_;
    }

    public static final int PATH_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString path_;
    /**
     * <code>bytes path = 2;</code>
     */
    public com.google.protobuf.ByteString getPath() {
      return path_;
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
      if (!address_.isEmpty()) {
        output.writeBytes(1, address_);
      }
      if (!path_.isEmpty()) {
        output.writeBytes(2, path_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!address_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, address_);
      }
      if (!path_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, path_);
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
      if (!(obj instanceof org.libra.grpc.types.AccessPathOuterClass.AccessPath)) {
        return super.equals(obj);
      }
      org.libra.grpc.types.AccessPathOuterClass.AccessPath other = (org.libra.grpc.types.AccessPathOuterClass.AccessPath) obj;

      if (!getAddress()
          .equals(other.getAddress())) return false;
      if (!getPath()
          .equals(other.getPath())) return false;
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
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
      hash = (37 * hash) + PATH_FIELD_NUMBER;
      hash = (53 * hash) + getPath().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.libra.grpc.types.AccessPathOuterClass.AccessPath parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.libra.grpc.types.AccessPathOuterClass.AccessPath parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.libra.grpc.types.AccessPathOuterClass.AccessPath parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.libra.grpc.types.AccessPathOuterClass.AccessPath parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.libra.grpc.types.AccessPathOuterClass.AccessPath parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.libra.grpc.types.AccessPathOuterClass.AccessPath parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.libra.grpc.types.AccessPathOuterClass.AccessPath parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.libra.grpc.types.AccessPathOuterClass.AccessPath parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.libra.grpc.types.AccessPathOuterClass.AccessPath parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.libra.grpc.types.AccessPathOuterClass.AccessPath parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.libra.grpc.types.AccessPathOuterClass.AccessPath parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.libra.grpc.types.AccessPathOuterClass.AccessPath parseFrom(
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
    public static Builder newBuilder(org.libra.grpc.types.AccessPathOuterClass.AccessPath prototype) {
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
     * Protobuf type {@code types.AccessPath}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:types.AccessPath)
        org.libra.grpc.types.AccessPathOuterClass.AccessPathOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.libra.grpc.types.AccessPathOuterClass.internal_static_types_AccessPath_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.libra.grpc.types.AccessPathOuterClass.internal_static_types_AccessPath_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.libra.grpc.types.AccessPathOuterClass.AccessPath.class, org.libra.grpc.types.AccessPathOuterClass.AccessPath.Builder.class);
      }

      // Construct using org.libra.grpc.types.AccessPathOuterClass.AccessPath.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        address_ = com.google.protobuf.ByteString.EMPTY;

        path_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.libra.grpc.types.AccessPathOuterClass.internal_static_types_AccessPath_descriptor;
      }

      @java.lang.Override
      public org.libra.grpc.types.AccessPathOuterClass.AccessPath getDefaultInstanceForType() {
        return org.libra.grpc.types.AccessPathOuterClass.AccessPath.getDefaultInstance();
      }

      @java.lang.Override
      public org.libra.grpc.types.AccessPathOuterClass.AccessPath build() {
        org.libra.grpc.types.AccessPathOuterClass.AccessPath result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.libra.grpc.types.AccessPathOuterClass.AccessPath buildPartial() {
        org.libra.grpc.types.AccessPathOuterClass.AccessPath result = new org.libra.grpc.types.AccessPathOuterClass.AccessPath(this);
        result.address_ = address_;
        result.path_ = path_;
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
        if (other instanceof org.libra.grpc.types.AccessPathOuterClass.AccessPath) {
          return mergeFrom((org.libra.grpc.types.AccessPathOuterClass.AccessPath)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.libra.grpc.types.AccessPathOuterClass.AccessPath other) {
        if (other == org.libra.grpc.types.AccessPathOuterClass.AccessPath.getDefaultInstance()) return this;
        if (other.getAddress() != com.google.protobuf.ByteString.EMPTY) {
          setAddress(other.getAddress());
        }
        if (other.getPath() != com.google.protobuf.ByteString.EMPTY) {
          setPath(other.getPath());
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
        org.libra.grpc.types.AccessPathOuterClass.AccessPath parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (org.libra.grpc.types.AccessPathOuterClass.AccessPath) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.ByteString address_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes address = 1;</code>
       */
      public com.google.protobuf.ByteString getAddress() {
        return address_;
      }
      /**
       * <code>bytes address = 1;</code>
       */
      public Builder setAddress(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        address_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes address = 1;</code>
       */
      public Builder clearAddress() {
        
        address_ = getDefaultInstance().getAddress();
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString path_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes path = 2;</code>
       */
      public com.google.protobuf.ByteString getPath() {
        return path_;
      }
      /**
       * <code>bytes path = 2;</code>
       */
      public Builder setPath(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        path_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes path = 2;</code>
       */
      public Builder clearPath() {
        
        path_ = getDefaultInstance().getPath();
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:types.AccessPath)
    }

    // @@protoc_insertion_point(class_scope:types.AccessPath)
    private static final org.libra.grpc.types.AccessPathOuterClass.AccessPath DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.libra.grpc.types.AccessPathOuterClass.AccessPath();
    }

    public static org.libra.grpc.types.AccessPathOuterClass.AccessPath getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AccessPath>
        PARSER = new com.google.protobuf.AbstractParser<AccessPath>() {
      @java.lang.Override
      public AccessPath parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AccessPath(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AccessPath> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AccessPath> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.libra.grpc.types.AccessPathOuterClass.AccessPath getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_types_AccessPath_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_types_AccessPath_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021access_path.proto\022\005types\"+\n\nAccessPath" +
      "\022\017\n\007address\030\001 \001(\014\022\014\n\004path\030\002 \001(\014B\026\n\024org.l" +
      "ibra.grpc.typesb\006proto3"
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
    internal_static_types_AccessPath_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_types_AccessPath_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_types_AccessPath_descriptor,
        new java.lang.String[] { "Address", "Path", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

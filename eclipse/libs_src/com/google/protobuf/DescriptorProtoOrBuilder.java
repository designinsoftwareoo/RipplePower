// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: descriptor.proto

package com.google.protobuf;

public interface DescriptorProtoOrBuilder
    extends com.google.protobuf.MessageOrBuilder {

  // optional string name = 1;
  /**
   * <code>optional string name = 1;</code>
   */
  boolean hasName();
  /**
   * <code>optional string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  // repeated .google.protobuf.FieldDescriptorProto field = 2;
  /**
   * <code>repeated .google.protobuf.FieldDescriptorProto field = 2;</code>
   */
  java.util.List<com.google.protobuf.FieldDescriptorProto> 
      getFieldList();
  /**
   * <code>repeated .google.protobuf.FieldDescriptorProto field = 2;</code>
   */
  com.google.protobuf.FieldDescriptorProto getField(int index);
  /**
   * <code>repeated .google.protobuf.FieldDescriptorProto field = 2;</code>
   */
  int getFieldCount();
  /**
   * <code>repeated .google.protobuf.FieldDescriptorProto field = 2;</code>
   */
  java.util.List<? extends com.google.protobuf.FieldDescriptorProtoOrBuilder> 
      getFieldOrBuilderList();
  /**
   * <code>repeated .google.protobuf.FieldDescriptorProto field = 2;</code>
   */
  com.google.protobuf.FieldDescriptorProtoOrBuilder getFieldOrBuilder(
      int index);

  // repeated .google.protobuf.FieldDescriptorProto extension = 6;
  /**
   * <code>repeated .google.protobuf.FieldDescriptorProto extension = 6;</code>
   */
  java.util.List<com.google.protobuf.FieldDescriptorProto> 
      getExtensionList();
  /**
   * <code>repeated .google.protobuf.FieldDescriptorProto extension = 6;</code>
   */
  com.google.protobuf.FieldDescriptorProto getExtension(int index);
  /**
   * <code>repeated .google.protobuf.FieldDescriptorProto extension = 6;</code>
   */
  int getExtensionCount();
  /**
   * <code>repeated .google.protobuf.FieldDescriptorProto extension = 6;</code>
   */
  java.util.List<? extends com.google.protobuf.FieldDescriptorProtoOrBuilder> 
      getExtensionOrBuilderList();
  /**
   * <code>repeated .google.protobuf.FieldDescriptorProto extension = 6;</code>
   */
  com.google.protobuf.FieldDescriptorProtoOrBuilder getExtensionOrBuilder(
      int index);

  // repeated .google.protobuf.DescriptorProto nested_type = 3;
  /**
   * <code>repeated .google.protobuf.DescriptorProto nested_type = 3;</code>
   */
  java.util.List<com.google.protobuf.DescriptorProto> 
      getNestedTypeList();
  /**
   * <code>repeated .google.protobuf.DescriptorProto nested_type = 3;</code>
   */
  com.google.protobuf.DescriptorProto getNestedType(int index);
  /**
   * <code>repeated .google.protobuf.DescriptorProto nested_type = 3;</code>
   */
  int getNestedTypeCount();
  /**
   * <code>repeated .google.protobuf.DescriptorProto nested_type = 3;</code>
   */
  java.util.List<? extends com.google.protobuf.DescriptorProtoOrBuilder> 
      getNestedTypeOrBuilderList();
  /**
   * <code>repeated .google.protobuf.DescriptorProto nested_type = 3;</code>
   */
  com.google.protobuf.DescriptorProtoOrBuilder getNestedTypeOrBuilder(
      int index);

  // repeated .google.protobuf.EnumDescriptorProto enum_type = 4;
  /**
   * <code>repeated .google.protobuf.EnumDescriptorProto enum_type = 4;</code>
   */
  java.util.List<com.google.protobuf.EnumDescriptorProto> 
      getEnumTypeList();
  /**
   * <code>repeated .google.protobuf.EnumDescriptorProto enum_type = 4;</code>
   */
  com.google.protobuf.EnumDescriptorProto getEnumType(int index);
  /**
   * <code>repeated .google.protobuf.EnumDescriptorProto enum_type = 4;</code>
   */
  int getEnumTypeCount();
  /**
   * <code>repeated .google.protobuf.EnumDescriptorProto enum_type = 4;</code>
   */
  java.util.List<? extends com.google.protobuf.EnumDescriptorProtoOrBuilder> 
      getEnumTypeOrBuilderList();
  /**
   * <code>repeated .google.protobuf.EnumDescriptorProto enum_type = 4;</code>
   */
  com.google.protobuf.EnumDescriptorProtoOrBuilder getEnumTypeOrBuilder(
      int index);

  // repeated .google.protobuf.DescriptorProto.ExtensionRange extension_range = 5;
  /**
   * <code>repeated .google.protobuf.DescriptorProto.ExtensionRange extension_range = 5;</code>
   */
  java.util.List<com.google.protobuf.DescriptorProto.ExtensionRange> 
      getExtensionRangeList();
  /**
   * <code>repeated .google.protobuf.DescriptorProto.ExtensionRange extension_range = 5;</code>
   */
  com.google.protobuf.DescriptorProto.ExtensionRange getExtensionRange(int index);
  /**
   * <code>repeated .google.protobuf.DescriptorProto.ExtensionRange extension_range = 5;</code>
   */
  int getExtensionRangeCount();
  /**
   * <code>repeated .google.protobuf.DescriptorProto.ExtensionRange extension_range = 5;</code>
   */
  java.util.List<? extends com.google.protobuf.DescriptorProto.ExtensionRangeOrBuilder> 
      getExtensionRangeOrBuilderList();
  /**
   * <code>repeated .google.protobuf.DescriptorProto.ExtensionRange extension_range = 5;</code>
   */
  com.google.protobuf.DescriptorProto.ExtensionRangeOrBuilder getExtensionRangeOrBuilder(
      int index);

  // optional .google.protobuf.MessageOptions options = 7;
  /**
   * <code>optional .google.protobuf.MessageOptions options = 7;</code>
   */
  boolean hasOptions();
  /**
   * <code>optional .google.protobuf.MessageOptions options = 7;</code>
   */
  com.google.protobuf.MessageOptions getOptions();
  /**
   * <code>optional .google.protobuf.MessageOptions options = 7;</code>
   */
  com.google.protobuf.MessageOptionsOrBuilder getOptionsOrBuilder();
}

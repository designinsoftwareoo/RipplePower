// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: descriptor.proto

package com.google.protobuf;

public interface FileOptionsOrBuilder extends
    com.google.protobuf.GeneratedMessage.
        ExtendableMessageOrBuilder<FileOptions> {

  // optional string java_package = 1;
  /**
   * <code>optional string java_package = 1;</code>
   *
   * <pre>
   * Sets the Java package where classes generated from this .proto will be
   * placed.  By default, the proto package is used, but this is often
   * inappropriate because proto packages do not normally start with backwards
   * domain names.
   * </pre>
   */
  boolean hasJavaPackage();
  /**
   * <code>optional string java_package = 1;</code>
   *
   * <pre>
   * Sets the Java package where classes generated from this .proto will be
   * placed.  By default, the proto package is used, but this is often
   * inappropriate because proto packages do not normally start with backwards
   * domain names.
   * </pre>
   */
  java.lang.String getJavaPackage();
  /**
   * <code>optional string java_package = 1;</code>
   *
   * <pre>
   * Sets the Java package where classes generated from this .proto will be
   * placed.  By default, the proto package is used, but this is often
   * inappropriate because proto packages do not normally start with backwards
   * domain names.
   * </pre>
   */
  com.google.protobuf.ByteString
      getJavaPackageBytes();

  // optional string java_outer_classname = 8;
  /**
   * <code>optional string java_outer_classname = 8;</code>
   *
   * <pre>
   * If set, all the classes from the .proto file are wrapped in a single
   * outer class with the given name.  This applies to both Proto1
   * (equivalent to the old "--one_java_file" option) and Proto2 (where
   * a .proto always translates to a single class, but you may want to
   * explicitly choose the class name).
   * </pre>
   */
  boolean hasJavaOuterClassname();
  /**
   * <code>optional string java_outer_classname = 8;</code>
   *
   * <pre>
   * If set, all the classes from the .proto file are wrapped in a single
   * outer class with the given name.  This applies to both Proto1
   * (equivalent to the old "--one_java_file" option) and Proto2 (where
   * a .proto always translates to a single class, but you may want to
   * explicitly choose the class name).
   * </pre>
   */
  java.lang.String getJavaOuterClassname();
  /**
   * <code>optional string java_outer_classname = 8;</code>
   *
   * <pre>
   * If set, all the classes from the .proto file are wrapped in a single
   * outer class with the given name.  This applies to both Proto1
   * (equivalent to the old "--one_java_file" option) and Proto2 (where
   * a .proto always translates to a single class, but you may want to
   * explicitly choose the class name).
   * </pre>
   */
  com.google.protobuf.ByteString
      getJavaOuterClassnameBytes();

  // optional bool java_multiple_files = 10 [default = false];
  /**
   * <code>optional bool java_multiple_files = 10 [default = false];</code>
   *
   * <pre>
   * If set true, then the Java code generator will generate a separate .java
   * file for each top-level message, enum, and service defined in the .proto
   * file.  Thus, these types will *not* be nested inside the outer class
   * named by java_outer_classname.  However, the outer class will still be
   * generated to contain the file's getDescriptor() method as well as any
   * top-level extensions defined in the file.
   * </pre>
   */
  boolean hasJavaMultipleFiles();
  /**
   * <code>optional bool java_multiple_files = 10 [default = false];</code>
   *
   * <pre>
   * If set true, then the Java code generator will generate a separate .java
   * file for each top-level message, enum, and service defined in the .proto
   * file.  Thus, these types will *not* be nested inside the outer class
   * named by java_outer_classname.  However, the outer class will still be
   * generated to contain the file's getDescriptor() method as well as any
   * top-level extensions defined in the file.
   * </pre>
   */
  boolean getJavaMultipleFiles();

  // optional bool java_generate_equals_and_hash = 20 [default = false];
  /**
   * <code>optional bool java_generate_equals_and_hash = 20 [default = false];</code>
   *
   * <pre>
   * If set true, then the Java code generator will generate equals() and
   * hashCode() methods for all messages defined in the .proto file. This is
   * purely a speed optimization, as the AbstractMessage base class includes
   * reflection-based implementations of these methods.
   * </pre>
   */
  boolean hasJavaGenerateEqualsAndHash();
  /**
   * <code>optional bool java_generate_equals_and_hash = 20 [default = false];</code>
   *
   * <pre>
   * If set true, then the Java code generator will generate equals() and
   * hashCode() methods for all messages defined in the .proto file. This is
   * purely a speed optimization, as the AbstractMessage base class includes
   * reflection-based implementations of these methods.
   * </pre>
   */
  boolean getJavaGenerateEqualsAndHash();

  // optional .google.protobuf.FileOptions.OptimizeMode optimize_for = 9 [default = SPEED];
  /**
   * <code>optional .google.protobuf.FileOptions.OptimizeMode optimize_for = 9 [default = SPEED];</code>
   */
  boolean hasOptimizeFor();
  /**
   * <code>optional .google.protobuf.FileOptions.OptimizeMode optimize_for = 9 [default = SPEED];</code>
   */
  com.google.protobuf.FileOptions.OptimizeMode getOptimizeFor();

  // optional string go_package = 11;
  /**
   * <code>optional string go_package = 11;</code>
   *
   * <pre>
   * Sets the Go package where structs generated from this .proto will be
   * placed.  There is no default.
   * </pre>
   */
  boolean hasGoPackage();
  /**
   * <code>optional string go_package = 11;</code>
   *
   * <pre>
   * Sets the Go package where structs generated from this .proto will be
   * placed.  There is no default.
   * </pre>
   */
  java.lang.String getGoPackage();
  /**
   * <code>optional string go_package = 11;</code>
   *
   * <pre>
   * Sets the Go package where structs generated from this .proto will be
   * placed.  There is no default.
   * </pre>
   */
  com.google.protobuf.ByteString
      getGoPackageBytes();

  // optional bool cc_generic_services = 16 [default = false];
  /**
   * <code>optional bool cc_generic_services = 16 [default = false];</code>
   *
   * <pre>
   * Should generic services be generated in each language?  "Generic" services
   * are not specific to any particular RPC system.  They are generated by the
   * main code generators in each language (without additional plugins).
   * Generic services were the only kind of service generation supported by
   * early versions of proto2.
   *
   * Generic services are now considered deprecated in favor of using plugins
   * that generate code specific to your particular RPC system.  Therefore,
   * these default to false.  Old code which depends on generic services should
   * explicitly set them to true.
   * </pre>
   */
  boolean hasCcGenericServices();
  /**
   * <code>optional bool cc_generic_services = 16 [default = false];</code>
   *
   * <pre>
   * Should generic services be generated in each language?  "Generic" services
   * are not specific to any particular RPC system.  They are generated by the
   * main code generators in each language (without additional plugins).
   * Generic services were the only kind of service generation supported by
   * early versions of proto2.
   *
   * Generic services are now considered deprecated in favor of using plugins
   * that generate code specific to your particular RPC system.  Therefore,
   * these default to false.  Old code which depends on generic services should
   * explicitly set them to true.
   * </pre>
   */
  boolean getCcGenericServices();

  // optional bool java_generic_services = 17 [default = false];
  /**
   * <code>optional bool java_generic_services = 17 [default = false];</code>
   */
  boolean hasJavaGenericServices();
  /**
   * <code>optional bool java_generic_services = 17 [default = false];</code>
   */
  boolean getJavaGenericServices();

  // optional bool py_generic_services = 18 [default = false];
  /**
   * <code>optional bool py_generic_services = 18 [default = false];</code>
   */
  boolean hasPyGenericServices();
  /**
   * <code>optional bool py_generic_services = 18 [default = false];</code>
   */
  boolean getPyGenericServices();

  // repeated .google.protobuf.UninterpretedOption uninterpreted_option = 999;
  /**
   * <code>repeated .google.protobuf.UninterpretedOption uninterpreted_option = 999;</code>
   *
   * <pre>
   * The parser stores options it doesn't recognize here. See above.
   * </pre>
   */
  java.util.List<com.google.protobuf.UninterpretedOption> 
      getUninterpretedOptionList();
  /**
   * <code>repeated .google.protobuf.UninterpretedOption uninterpreted_option = 999;</code>
   *
   * <pre>
   * The parser stores options it doesn't recognize here. See above.
   * </pre>
   */
  com.google.protobuf.UninterpretedOption getUninterpretedOption(int index);
  /**
   * <code>repeated .google.protobuf.UninterpretedOption uninterpreted_option = 999;</code>
   *
   * <pre>
   * The parser stores options it doesn't recognize here. See above.
   * </pre>
   */
  int getUninterpretedOptionCount();
  /**
   * <code>repeated .google.protobuf.UninterpretedOption uninterpreted_option = 999;</code>
   *
   * <pre>
   * The parser stores options it doesn't recognize here. See above.
   * </pre>
   */
  java.util.List<? extends com.google.protobuf.UninterpretedOptionOrBuilder> 
      getUninterpretedOptionOrBuilderList();
  /**
   * <code>repeated .google.protobuf.UninterpretedOption uninterpreted_option = 999;</code>
   *
   * <pre>
   * The parser stores options it doesn't recognize here. See above.
   * </pre>
   */
  com.google.protobuf.UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(
      int index);
}

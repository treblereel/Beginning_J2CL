package org.treblereel.j2cl.helloworld;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

import static jsinterop.annotations.JsPackage.GLOBAL;

@JsType(isNative = true, namespace = GLOBAL, name = "jQuery")
public abstract class JQuery {

  @JsMethod(namespace = GLOBAL, name = "jQuery")
  public static native JQuery $(String selector);

  public native void modal(String opt);

}

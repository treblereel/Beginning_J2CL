package org.treblereel.j2cl.helloworld;

import elemental2.dom.DomGlobal;
import elemental2.promise.Promise;
import jsinterop.annotations.JsFunction;
import jsinterop.base.Js;
import org.treblereel.gwt.xml.mapper.api.AbstractObjectMapper;
import org.treblereel.j2cl.processors.annotations.GWT3Export;

public class App {

  private AbstractObjectMapper mapper = User_XMLMapperImpl.INSTANCE;

  @GWT3Export
  public Promise<String> toXml(User user) {
    String xml = null;
    try {
      xml = mapper.write(user);
    } catch (Exception e) {
      DomGlobal.alert("Exception " + e.getMessage());
    }

    return Promise.resolve(xml);
  }
}

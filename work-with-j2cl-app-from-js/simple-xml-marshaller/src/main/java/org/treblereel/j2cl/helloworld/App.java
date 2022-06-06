package org.treblereel.j2cl.helloworld;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLButtonElement;
import elemental2.dom.HTMLDivElement;
import elemental2.dom.HTMLInputElement;
import org.treblereel.gwt.xml.mapper.api.AbstractObjectMapper;

import static org.treblereel.j2cl.helloworld.JQuery.$;

public class App {

  private AbstractObjectMapper mapper = User_XMLMapperImpl.INSTANCE;

  public void onModuleLoad() {

    HTMLDivElement xmlDivElement = (HTMLDivElement) DomGlobal.document.getElementById("xml");

    HTMLButtonElement submit = (HTMLButtonElement) DomGlobal.document.getElementById("submit");
    HTMLInputElement firstName = (HTMLInputElement) DomGlobal.document.getElementById("firstName");
    HTMLInputElement secondName =
        (HTMLInputElement) DomGlobal.document.getElementById("secondName");
    HTMLInputElement age = (HTMLInputElement) DomGlobal.document.getElementById("age");

    submit.addEventListener(
        "click",
        evt -> {
          try {
            User user = new User();
            user.setFirstName(firstName.textContent);
            user.setSecondName(secondName.textContent);

            String _age = age.textContent.trim();
            user.setAge(Integer.parseInt(age.value.trim()));

            String xml = mapper.write(user);
            xmlDivElement.textContent = xml;

            $("#exampleModal").modal("show");

          } catch (Exception e) {
            DomGlobal.alert("Exception " + e.getMessage());
          }
        });
  }
}

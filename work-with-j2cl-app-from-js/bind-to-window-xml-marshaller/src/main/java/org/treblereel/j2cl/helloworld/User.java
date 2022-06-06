package org.treblereel.j2cl.helloworld;


import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import org.treblereel.gwt.xml.mapper.api.annotation.XMLMapper;

@XMLMapper
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "User")
public class User {

    private String firstName;
    private String secondName;
    private int age;

    @JsOverlay
    public final String getFirstName() {
        return firstName;
    }

    @JsOverlay
    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsOverlay
    public final String getSecondName() {
        return secondName;
    }

    @JsOverlay
    public final void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @JsOverlay
    public final int getAge() {
        return age;
    }

    @JsOverlay
    public final void setAge(int age) {
        this.age = age;
    }
}

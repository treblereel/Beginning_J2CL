package org.treblereel.j2cl.helloworld;

import org.treblereel.gwt.xml.mapper.api.annotation.XMLMapper;

@XMLMapper
public class User {

    private String firstName;
    private String secondName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

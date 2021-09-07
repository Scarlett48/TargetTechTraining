package com.aique.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name="notification")
public class Notification {

//    @XmlElement
    private Integer id;
//    @XmlElement
    private String name;
//    @XmlElement
    private String message;

    public Notification(){}

    public Notification(Integer id, String name, String message) {
        this.id = id;
        this.name = name;
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

package com.example.arduinopinout.Annotation;

import java.io.Serializable;

public class Annotation implements Serializable {

    private Long Id;
    private String name;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNameAnnotation() {
        return name;
    }

    public void setNameAnnotation(String nameAnnotation) {
        this.name = nameAnnotation;
    }
}

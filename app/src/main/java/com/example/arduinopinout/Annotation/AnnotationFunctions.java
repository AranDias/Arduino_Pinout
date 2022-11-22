package com.example.arduinopinout.Annotation;

import java.io.Serializable;

public class AnnotationFunctions implements Serializable {

    private Long Id;
    private String name;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getAnnotationName() {
        return name;
    }

    public void setAnnotationName(String annotationName) {
        this.name = annotationName;
    }
}

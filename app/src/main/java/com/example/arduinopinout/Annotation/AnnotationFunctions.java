package com.example.arduinopinout.Annotation;

import java.io.Serializable;

public class AnnotationFunctions implements Serializable {

    private Long Id;
    private String annotationName;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getAnnotationName() {
        return annotationName;
    }

    public void setAnnotationName(String nomeTarefa) {
        this.annotationName = nomeTarefa;
    }
}

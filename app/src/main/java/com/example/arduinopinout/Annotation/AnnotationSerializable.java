package com.example.arduinopinout.Annotation;
//aula 1 (lista de anotações)
import java.io.Serializable;

public class AnnotationSerializable implements Serializable {//serializable para informações de uma activity para outra

    private Long Id;
    private String name; //

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


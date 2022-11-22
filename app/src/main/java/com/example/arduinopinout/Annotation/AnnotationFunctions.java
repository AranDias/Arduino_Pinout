package com.example.arduinopinout.Annotation;

import java.io.Serializable;

public class AnnotationFunctions implements Serializable {

    private Long Id;
    private String nomeTarefa;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getAnnotationName() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }
}

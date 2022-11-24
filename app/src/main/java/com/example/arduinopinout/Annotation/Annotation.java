package com.example.arduinopinout.Annotation;
//aula 1 (lista de tarefas)
import java.io.Serializable;

public class Annotation implements Serializable {//serializable para informações de uma activity para outra

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


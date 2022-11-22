package com.example.arduinopinout.Annotation;

import java.util.List;

public interface AnnotationDAOInterface {

    public boolean salvar(AnnotationFunctions tarefa);
    public boolean atualizar(AnnotationFunctions tarefa);
    public boolean deletar(AnnotationFunctions tarefa);
    public List<AnnotationFunctions> listar();

}

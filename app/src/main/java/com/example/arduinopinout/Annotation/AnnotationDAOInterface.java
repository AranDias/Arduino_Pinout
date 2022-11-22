package com.example.arduinopinout.Annotation;

import java.util.List;

public interface AnnotationDAOInterface {

    public boolean salvar(AnnotationFunctions annotation);
    public boolean atualizar(AnnotationFunctions annotation);
    public boolean deletar(AnnotationFunctions annotation);
    public List<AnnotationFunctions> listar();

}

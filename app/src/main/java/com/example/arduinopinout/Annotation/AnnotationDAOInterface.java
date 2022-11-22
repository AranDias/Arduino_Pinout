package com.example.arduinopinout.Annotation;

import java.util.List;

public interface AnnotationDAOInterface {

    public boolean salvar(AnnotationBridge annotation);
    public boolean atualizar(AnnotationBridge annotation);
    public boolean deletar(AnnotationBridge annotation);
    public List<AnnotationBridge> listar();

}

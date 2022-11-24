package com.example.arduinopinout.Annotation;

import java.util.List;
//metodos para salvar, atualizar, deletar as anotações (vai ser puxado pelo annotationDAO = )
public interface AnnotationDAOInterface {

    public boolean salvar(AnnotationBridge annotation);
    public boolean atualizar(AnnotationBridge annotation);
    public boolean deletar(AnnotationBridge annotation);
    public List<AnnotationBridge> listar();

}

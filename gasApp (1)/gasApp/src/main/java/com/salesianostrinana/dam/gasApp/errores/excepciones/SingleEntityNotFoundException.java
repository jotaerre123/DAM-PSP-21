package com.salesianostrinana.dam.gasApp.errores.excepciones;

public class SingleEntityNotFoundException extends EntityNotFoundException{

    public SingleEntityNotFoundException(String id, Class clase) {
        super(String.format("No se puede encontrar una entidad del tipo %s con ID: %s", clase.getName(), id));
    }
}

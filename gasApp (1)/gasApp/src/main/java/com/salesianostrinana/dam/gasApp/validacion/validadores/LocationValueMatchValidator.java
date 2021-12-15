package com.salesianostrinana.dam.gasApp.validacion.validadores;


import com.salesianostrinana.dam.gasApp.validacion.anotaciones.LocationValueMatch;
import org.springframework.beans.PropertyAccessorFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class LocationValueMatchValidator implements ConstraintValidator<LocationValueMatch, Object> {

    String ubicacion;

    @Override
    public void initialize(LocationValueMatch constraintAnnotation) {
        this.ubicacion = constraintAnnotation.ubicacion();
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        Object fieldValue =PropertyAccessorFactory.forBeanPropertyAccess(o).getPropertyValue(ubicacion);

        if (fieldValue != null){
            return Pattern.matches("^([-+]?\\d{1,2}[.]\\d+),\\s*([-+]?\\d{1,3}[.]\\d+)$", (CharSequence) fieldValue);
        } else {

            return fieldValue == null;

        }
    }
}

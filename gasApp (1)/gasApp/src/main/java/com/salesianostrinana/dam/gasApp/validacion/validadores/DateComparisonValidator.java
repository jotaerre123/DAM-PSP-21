package com.salesianostrinana.dam.gasApp.validacion.validadores;

import com.salesianostrinana.dam.gasApp.validacion.anotaciones.DateComparison;
import org.springframework.beans.PropertyAccessorFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDateTime;


public class DateComparisonValidator implements ConstraintValidator<DateComparison, Object> {

    private String fechaApertura;
    private String fechaRegistro;



    @Override
    public void initialize(DateComparison constraintAnnotation) {
        fechaApertura = constraintAnnotation.fechaApertura();
        fechaRegistro = constraintAnnotation.fechaRegistro();
    }



    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {

        LocalDateTime fechaAperturaValue = (LocalDateTime) PropertyAccessorFactory.forBeanPropertyAccess(o).getPropertyValue(fechaApertura);
        LocalDateTime fechaRegistroValue = (LocalDateTime) PropertyAccessorFactory.forBeanPropertyAccess(o).getPropertyValue(fechaRegistro);


        int comparacion = fechaApertura.compareTo(fechaRegistro);

        if (comparacion >= 0){
            return false;
        }else{
            return true;
        }


    }



}

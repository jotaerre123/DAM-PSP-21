package com.salesianostrinana.dam.gasApp.validacion.anotaciones;

import com.salesianostrinana.dam.gasApp.validacion.validadores.UniqueNameValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = UniqueNameValidator.class)
@Documented
public @interface UniqueName {

    String message() default "No puede haber dos estaciones con el mismo nombre.";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}

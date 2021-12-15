package com.salesianostrinana.dam.gasApp.validacion.anotaciones;

import com.salesianostrinana.dam.gasApp.validacion.validadores.DateComparisonValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Constraint(validatedBy = DateComparisonValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DateComparison {

    String message() default "Error con la fecha, compruebe de nuevo";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String fechaApertura();

    String fechaRegistro();


}

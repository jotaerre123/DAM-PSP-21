package com.salesianostriana.dam.validacion.simple.anotaciones;

import com.salesianostriana.dam.validacion.simple.validadores.StrongPasswordValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Constraint(validatedBy = StrongPasswordValidator.class)
@Target({ElementType.FIELD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface StrongPassword {

    String message() default "la contraseña no cumple con los requisitos de validación especificados";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

     int charMax() default 60;
     int charMin() default 1;
     boolean hasUpper() default false;
     boolean hasNumber() default false;
     boolean hasLower () default false;
     boolean hasAlpha () default false;
     boolean hasOthers () default false;

}

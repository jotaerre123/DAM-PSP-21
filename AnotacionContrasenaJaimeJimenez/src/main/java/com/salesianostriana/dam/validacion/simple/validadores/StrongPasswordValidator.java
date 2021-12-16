package com.salesianostriana.dam.validacion.simple.validadores;

import com.salesianostriana.dam.validacion.simple.anotaciones.StrongPassword;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StrongPasswordValidator implements ConstraintValidator<StrongPassword, String> {

    private int charMax, charMin;
    private boolean hasUpper, hasNumber, hasLower, hasAlpha, hasOthers;



    @Override
    public void initialize(StrongPassword constraintAnnotation) {
        charMax = constraintAnnotation.charMax();
        charMin = constraintAnnotation.charMin();
        hasUpper = constraintAnnotation.hasUpper();
        hasLower = constraintAnnotation.hasLower();
        hasNumber = constraintAnnotation.hasNumber();
        hasAlpha = constraintAnnotation.hasAlpha();
        hasOthers = constraintAnnotation.hasOthers();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s.length()>charMax|| s.length()<charMin) {
            return false;
        }
        if(hasUpper){
            if(s.equals(s.toLowerCase())){
                return false;
            };
        }
        if(hasLower){
            if(s.equals(s.toUpperCase())){
                return false;
            }
        }
        if(hasNumber){
            if(!s.matches(".*\\d.*"))
                return false;
        }
        if(hasAlpha){
            if(!s.matches(".*[a-z].*")){
                return false;
            }
        }
        if(hasOthers){
            if(!(s.contains(".") || s.contains(",") || s.contains("$")
                    || s.contains("-") || s.contains("@") || s.contains("_"))){
                return false;
            }
        }
        return true;
    }
}

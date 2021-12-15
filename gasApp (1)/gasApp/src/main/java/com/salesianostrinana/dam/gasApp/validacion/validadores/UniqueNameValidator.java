package com.salesianostrinana.dam.gasApp.validacion.validadores;

import com.salesianostrinana.dam.gasApp.repos.EstacionRepository;
import com.salesianostrinana.dam.gasApp.validacion.anotaciones.UniqueName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueNameValidator implements ConstraintValidator<UniqueName, String> {

    @Autowired
    private EstacionRepository estacionRepository;

    @Override
    public void initialize(UniqueName constraintAnnotation){}
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return StringUtils.hasText(s) && !estacionRepository.existsByNombre(s);
    }
}

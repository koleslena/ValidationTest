package ru.koleslena.springapp.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.koleslena.springapp.service.DictionaryService;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by elenko on 14.03.15.
 */
@Component
@Scope(value = "prototype")
public class DictionaryValueValidator implements ConstraintValidator<DictionaryValue, Object> {

    @Autowired
    private DictionaryService dictionaryService;

    private String dictionaryName;
    private String fieldName;

    @Override
    public void initialize(DictionaryValue constraintAnnotation) {
        this.dictionaryName = constraintAnnotation.dictionaryName();
        this.fieldName = constraintAnnotation.fieldName();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {
        if(dictionaryService.findValue(dictionaryName, fieldName, value) == null) {
            return false;
        }
        return true;
    }
}

package ru.koleslena.springapp.validation;

import javax.validation.Constraint;
import java.lang.annotation.*;

/**
 * Created by elenko on 14.03.15.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.FIELD,ElementType.CONSTRUCTOR,ElementType.PARAMETER,ElementType.ANNOTATION_TYPE})
@Constraint(validatedBy = DictionaryValueValidator.class)
public @interface DictionaryValue {

    String message() default "validation.constraint.message.NotFound";

    String dictionaryName();

    String fieldName();

    Class[] groups() default {};

    Class[] payload() default {};
}

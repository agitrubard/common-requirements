package com.agitrubard.common_requirements.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = URLValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidURL {
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String message() default "Must Be URL Format";
}

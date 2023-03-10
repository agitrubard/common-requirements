package com.agitrubard.common_requirements.validation;

import org.apache.commons.validator.routines.UrlValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

class URLValidator implements ConstraintValidator<ValidURL, Object> {

    public boolean isValid(final Object value, final ConstraintValidatorContext context) {
        if (value == null) return true;

        final String[] schemes = {"http", "https"};
        final UrlValidator urlValidator = new UrlValidator(schemes);

        return urlValidator.isValid(value.toString());
    }
}

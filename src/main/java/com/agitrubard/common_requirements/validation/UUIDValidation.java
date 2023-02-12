package com.agitrubard.common_requirements.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

class UUIDValidation implements ConstraintValidator<UUID, String> {

    private static final Pattern UUID_REGEX_PATTERN = Pattern.compile("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$");

    public boolean isValid(String uuid, final ConstraintValidatorContext context) {
        if (uuid == null) {
            return true;
        }

        return UUID_REGEX_PATTERN.matcher(uuid).matches();
    }
}

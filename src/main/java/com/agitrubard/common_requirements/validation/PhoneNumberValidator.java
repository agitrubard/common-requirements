package com.agitrubard.common_requirements.validation;

import com.agitrubard.common_requirements.model.PhoneNumber;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

class PhoneNumberValidator implements ConstraintValidator<ValidPhoneNumber, PhoneNumber> {

    @Override
    public boolean isValid(PhoneNumber phoneNumber, ConstraintValidatorContext context) {
        if (phoneNumber.isNull()) {
            return true;
        }

        return phoneNumber.isValid();
    }
}

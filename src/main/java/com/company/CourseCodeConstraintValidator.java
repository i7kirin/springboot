package com.company;

import com.company.annotation.CourseCode;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String suffix;

    public void initialize(CourseCode courseCode) {
        this.suffix = courseCode.value();
    }

    public boolean isValid(String theCode,
                           ConstraintValidatorContext constraintValidatorContext) {
        boolean result;
        if (theCode != null) {
            result = theCode.startsWith(suffix);
        } else {
            return true;
        }
        return result;
    }
}

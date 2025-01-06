package com.fillumina.krasa.jaxbtoolsexample.test;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class JavaxBeanValidationHelper {

    private Validator validator;

    private synchronized String validate(Object bean) {
        if (validator == null) {
            ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
            this.validator = factory.getValidator();
        }
        Set<ConstraintViolation<Object>> errors = validator.validate(bean);
        if (!errors.isEmpty()) {
            return errors.stream()
                    .map(e -> e.getMessage())
                    .collect(Collectors.joining(", "));
        }
        return null;
    }

    public void assertValid(Object bean) {
		String errorMsg = validate(bean);

        if (errorMsg != null) {
            throw new AssertionError("bean not valid: " + errorMsg);
        }
    }

    public void assertNotValid(Object bean) {
		String errorMsg = validate(bean);

        if (errorMsg == null) {
            throw new AssertionError("bean is valid while expecting it being not valid");
        }
    }

}

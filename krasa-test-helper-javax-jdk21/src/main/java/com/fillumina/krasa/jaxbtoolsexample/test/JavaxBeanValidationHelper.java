package com.fillumina.krasa.jaxbtoolsexample.test;

import java.util.Set;
import java.util.stream.Collectors;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

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

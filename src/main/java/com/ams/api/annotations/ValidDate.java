package com.ams.api.annotations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DateValidator.class)

public @interface ValidDate {
    String message() default "Invalid Date format";
    String format();
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

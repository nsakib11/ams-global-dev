package com.ams.api.annotations;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Documented
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = TxnDateValidator.class)
public @interface ValidTxnDate {
    String message() default "Invalid txnDate format";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

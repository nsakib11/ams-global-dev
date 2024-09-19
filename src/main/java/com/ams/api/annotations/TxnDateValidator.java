package com.ams.api.annotations;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TxnDateValidator implements ConstraintValidator<ValidTxnDate, String> {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

    @Override
    public void initialize(ValidTxnDate constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isEmpty()) {
            return true; // Null values are considered valid; you can change this behavior if needed
        }

        try {
            LocalDateTime.parse(value, FORMATTER);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

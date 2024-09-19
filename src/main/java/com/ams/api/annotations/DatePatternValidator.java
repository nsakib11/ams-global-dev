/**
 * Project Name: Ngi-Microservices
 * File: DateFormatValidator$
 * Author: Koushik Chandra Sarker
 * Date: 7/20/2023$ (MM/DD/YYYY)
 * Description: .
 * History:
 * - 7/20/2023$: Koushik Chandra Sarker - Initial version
 * - [Date]: [Author's Name] - [Modification description]
 */
package com.ams.api.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatePatternValidator implements ConstraintValidator<DatePattern, String> {
    private String pattern;

    @Override
    public void initialize(DatePattern constraintAnnotation) {
        this.pattern = constraintAnnotation.pattern();

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true; // Null values are handled by @NotNull annotation or similar constraints.
        }

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
            LocalDateTime.parse(value, formatter);
            return true;
        } catch (Exception e) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(
                    context.getDefaultConstraintMessageTemplate()
                            .replace("{field}", context.getDefaultConstraintMessageTemplate())
                            .replace("{pattern}", pattern)
            ).addConstraintViolation();
            return false;
        }
    }
}

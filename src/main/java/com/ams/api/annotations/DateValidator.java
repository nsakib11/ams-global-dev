package com.ams.api.annotations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateValidator implements ConstraintValidator<ValidDate, String> {

    @Override
    public void initialize(ValidDate validDate) {
        this.format = validDate.format();
    }

    private String format;
    private static final Logger LOGGER = LoggerFactory.getLogger(DateValidator.class);


    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        return isValidFormat(this.format, value);
    }

    private static boolean isValidFormat(String format, String value) {
        Date date = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            if (value != null) {
                date = sdf.parse(value);
                if (!value.equals(sdf.format(date))) {
                    date = null;
                }
            }

        } catch (ParseException ex) {
            LOGGER.error("Unable to parse the date, while validating the field", ex);
        }
        return date != null;
    }
}

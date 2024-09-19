/**
 * Project Name: Ngi-Microservices
 * File: DateFormat$
 * Author: Koushik Chandra Sarker
 * Date: 7/20/2023$ (MM/DD/YYYY)
 * Description: .
 * History:
 * - 7/20/2023$: Koushik Chandra Sarker - Initial version
 * - [Date]: [Author's Name] - [Modification description]
 */
package com.ams.api.annotations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DatePatternValidator.class)
public @interface DatePattern {
    String message() default "Invalid format. Use '{pattern}' format.";

    String pattern(); //  mandatory parameter.

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

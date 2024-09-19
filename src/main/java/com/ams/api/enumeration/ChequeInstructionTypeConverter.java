/**
 * Project Name: Ngi-Microservices
 * File: ChequeInstructionType$
 * Author: Koushik Chandra Sarker
 * Date: 10/12/2023$ (MM/DD/YYYY)
 * Description: .
 * History:
 * - 10/12/2023$: Koushik Chandra Sarker - Initial version
 * - [Date]: [Author's Name] - [Modification description]
 */

package com.ams.api.enumeration;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.util.stream.Stream;
@Converter(autoApply = true)
public class ChequeInstructionTypeConverter implements AttributeConverter<ChequeInstructionType, String> {

    @Override
    public String convertToDatabaseColumn(ChequeInstructionType chequeInstructionType) {
        if (chequeInstructionType == null) {
            return null;
        }
        return chequeInstructionType.getValue();
    }

    @Override
    public ChequeInstructionType convertToEntityAttribute(String value) {
        if (value == null) {
            return null;
        }
        return Stream.of(ChequeInstructionType.values())
                .filter(c -> c.getValue().equals(value))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}

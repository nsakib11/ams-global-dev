package com.ams.api.enumeration;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class MaintenanceTypeConverter implements AttributeConverter<MaintenanceType, String> {

    @Override
    public String convertToDatabaseColumn(MaintenanceType maintenanceType) {
        if (maintenanceType == null) {
            return null;
        }
        return maintenanceType.getValue();
    }

    @Override
    public MaintenanceType convertToEntityAttribute(String value) {
        if (value == null) {
            return null;
        }
        return Stream.of(MaintenanceType.values())
                .filter(c -> c.getValue().equals(value))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}

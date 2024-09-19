package com.ams.api.util;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class YesNoBooleanDeserializer extends JsonDeserializer<Boolean> {

    @Override
    public Boolean deserialize(JsonParser parser, DeserializationContext context)
            throws IOException {
        String value = parser.getText().toLowerCase();
        if (value.equals("y") || value.equals("yes") || value.equals("true") || value.equals("1")) {
            return Boolean.TRUE;
        } else if (value.equals("n") || value.equals("no") || value.equals("false") || value.equals("0")) {
            return Boolean.FALSE;
        }
        throw new JsonParseException(parser, "Invalid value for boolean field: " + value);
    }
}
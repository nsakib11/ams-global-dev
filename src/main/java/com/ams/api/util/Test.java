package com.ams.api.util;

import java.text.ParseException;

public class Test {
    public static void main(String[] args) throws ParseException {
        System.out.println(DateTimeUtils.getDateFromString("120223", DateTimeUtils.DATE_FORMAT_DDMMYY));
    }
}

package com.ams.api.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtils {
    public static final String DATE_FORMAT_DDMMYY = "ddMMyy";
    public static final String DATE_FORMAT_YYYYMM = "yyyyMM";
    public static final java.sql.Date getDateFromString(String dateString, String format) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Date parsedDate =  dateFormat.parse(dateString);
        return new java.sql.Date(parsedDate.getTime());
    }

    public static String formatDate(Date dateString, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(dateString);
    }
}

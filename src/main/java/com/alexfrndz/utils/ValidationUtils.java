package com.alexfrndz.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

/**
 * Created by afernandez on 17/04/2017.
 */
public class ValidationUtils {

    public static Boolean isValidDateFormatOrEmpty(String dateInput) {
        boolean isEmpty = StringUtils.isEmpty(dateInput);
        if (isEmpty) {
            return true;
        }
        return Pattern.matches("((19|20)\\d\\d)-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01]) ([2][0-3]|[0-1][0-9]|[1-9]):[0-5][0-9]:([0-5][0-9]|[6][0])$",
                dateInput);
    }
}

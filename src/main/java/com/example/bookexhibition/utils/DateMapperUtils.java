package com.example.bookexhibition.utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DateMapperUtils {

    public static LocalDate integerToDate(int integerDate) {
        String integerDatePattern = "MMddyyyy";
        DateTimeFormatter integerDateFormatter = DateTimeFormatter.ofPattern(integerDatePattern);

        return LocalDate.parse(String.valueOf(integerDate), integerDateFormatter);
    }
}

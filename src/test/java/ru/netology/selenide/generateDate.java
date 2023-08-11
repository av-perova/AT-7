package ru.netology.selenide;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class generateDate {
    public String generateDate(long addDays, String pattern) {
        return LocalDate.now().plusDays(addDays).format(DateTimeFormatter.ofPattern(pattern));
    }
}
package com.karateext.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateUtils {

    // Date arithmetic
    public static LocalDate addDays(LocalDate date, long days) {
        return date.plusDays(days);
    }

    public static LocalDate subtractDays(LocalDate date, long days) {
        return date.minusDays(days);
    }

    public static LocalDate addMonths(LocalDate date, long months) {
        return date.plusMonths(months);
    }

    public static LocalDate subtractMonths(LocalDate date, long months) {
        return date.minusMonths(months);
    }

    public static LocalDate addYears(LocalDate date, long years) {
        return date.plusYears(years);
    }

    public static LocalDate subtractYears(LocalDate date, long years) {
        return date.minusYears(years);
    }

    // Time zone operations
    public static ZonedDateTime convertTimeZone(ZonedDateTime dateTime, String targetZone) {
        return dateTime.withZoneSameInstant(ZoneId.of(targetZone));
    }

    public static ZonedDateTime convertTimeZone(LocalDateTime dateTime, String sourceZone, String targetZone) {
        ZonedDateTime zonedDateTime = dateTime.atZone(ZoneId.of(sourceZone));
        return zonedDateTime.withZoneSameInstant(ZoneId.of(targetZone));
    }

    // Custom date formatting
    public static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }

    public static String formatDateTime(LocalDateTime dateTime, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return dateTime.format(formatter);
    }

    public static String formatZonedDateTime(ZonedDateTime zonedDateTime, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return zonedDateTime.format(formatter);
    }

    // Parsing dates
    public static LocalDate parseDate(String dateString, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(dateString, formatter);
    }

    public static LocalDateTime parseDateTime(String dateTimeString, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.parse(dateTimeString, formatter);
    }

    public static ZonedDateTime parseZonedDateTime(String zonedDateTimeString, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return ZonedDateTime.parse(zonedDateTimeString, formatter);
    }

    // Date comparisons
    public static boolean isAfter(LocalDate date1, LocalDate date2) {
        return date1.isAfter(date2);
    }

    public static boolean isBefore(LocalDate date1, LocalDate date2) {
        return date1.isBefore(date2);
    }

    public static boolean isEqual(LocalDate date1, LocalDate date2) {
        return date1.isEqual(date2);
    }

    // Date differences
    public static long daysBetween(LocalDate date1, LocalDate date2) {
        return ChronoUnit.DAYS.between(date1, date2);
    }

    public static long monthsBetween(LocalDate date1, LocalDate date2) {
        return ChronoUnit.MONTHS.between(date1, date2);
    }

    public static long yearsBetween(LocalDate date1, LocalDate date2) {
        return ChronoUnit.YEARS.between(date1, date2);
    }

    // Utility methods
    public static LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    public static LocalDateTime getCurrentDateTime() {
        return LocalDateTime.now();
    }

    public static ZonedDateTime getCurrentZonedDateTime(String zone) {
        return ZonedDateTime.now(ZoneId.of(zone));
    }

    // Conversion between java.util.Date and java.time classes
    public static Date toDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public static Date toDate(LocalDateTime localDateTime) {
        return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static LocalDate toLocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    public static LocalDateTime toLocalDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}
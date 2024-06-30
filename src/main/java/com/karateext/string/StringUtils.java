package com.karateext.string;

import java.util.*;
import java.util.regex.*;

public class StringUtils {

    // Simple text extraction methods
    public String extractEmail(String text) {
        return extractFirstMatch(text, "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b");
    }

    public String extractPhoneNumber(String text) {
        return extractFirstMatch(text, "\\b\\d{3}[-.]?\\d{3}[-.]?\\d{4}\\b");
    }

    public String extractDate(String text) {
        return extractFirstMatch(text, "\\b\\d{1,4}[-/]\\d{1,2}[-/]\\d{1,4}\\b");
    }

    public static String extractUrl(String text) {
        return extractFirstMatch(text, "https?://\\S+");
    }

    // Word operations
    public static List<String> extractWords(String text) {
        return Arrays.asList(text.split("\\s+"));
    }

    public static List<String> extractWordsOfLength(String text, int length) {
        return extractAllMatches(text, "\\b\\w{" + length + "}\\b");
    }

    public static int countWords(String text) {
        return extractWords(text).size();
    }

    // Number operations
    public static List<String> extractNumbers(String text) {
        return extractAllMatches(text, "\\b\\d+(\\.\\d+)?\\b");
    }

    // String manipulation
    public static String removeWhitespace(String text) {
        return text.replaceAll("\\s+", "");
    }

    public static String keepOnlyAlphanumeric(String text) {
        return text.replaceAll("[^a-zA-Z0-9]", "");
    }

    public static String keepOnlyDigits(String text) {
        return text.replaceAll("\\D", "");
    }

    public static String keepOnlyLetters(String text) {
        return text.replaceAll("[^a-zA-Z]", "");
    }

    // Advanced regex methods (kept for power users)
    public static List<String> extractAllMatches(String text, String regex) {
        List<String> matches = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            matches.add(matcher.group());
        }
        return matches;
    }

    public static String extractFirstMatch(String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    public static Map<String, String> extractNamedGroups(String text, String regex) {
        Map<String, String> namedGroups = new HashMap<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            Set<String> groupNames = getGroupNames(pattern);
            for (String groupName : groupNames) {
                try {
                    String groupValue = matcher.group(groupName);
                    if (groupValue != null) {
                        namedGroups.put(groupName, groupValue);
                    }
                } catch (IllegalArgumentException e) {
                    // Group name not found, skip it
                }
            }
        }
        return namedGroups;
    }

    private static Set<String> getGroupNames(Pattern pattern) {
        Set<String> groupNames = new HashSet<>();
        String patternString = pattern.toString();
        Matcher groupMatcher = Pattern.compile("\\(\\?<([a-zA-Z][a-zA-Z0-9]*)>").matcher(patternString);
        while (groupMatcher.find()) {
            groupNames.add(groupMatcher.group(1));
        }
        return groupNames;
    }

    public static String replaceAll(String text, String target, String replacement) {
        return text.replace(target, replacement);
    }

    public static String[] split(String text, String delimiter) {
        return text.split(Pattern.quote(delimiter));
    }
}
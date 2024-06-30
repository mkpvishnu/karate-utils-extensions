package com.karateext.string;

public class StringUtils {
    public String extractEmail(String text) {
        // Simple implementation for demo purposes
        int atIndex = text.indexOf('@');
        if (atIndex == -1) return null;
        int startIndex = text.lastIndexOf(' ', atIndex);
        int endIndex = text.indexOf(' ', atIndex);
        if (endIndex == -1) endIndex = text.length();
        return text.substring(startIndex + 1, endIndex);
    }
}
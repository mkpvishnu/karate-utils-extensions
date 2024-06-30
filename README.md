# StringUtils Documentation

This document provides a comprehensive guide to the methods available in the `StringUtils` class, including both existing and newly added methods. Each method is explained with examples of its usage in testing scenarios.

## Table of Contents
1. [Text Extraction Methods](#text-extraction-methods)
2. [Word Operations](#word-operations)
3. [Number Operations](#number-operations)
4. [String Manipulation](#string-manipulation)
5. [Advanced Regex Methods](#advanced-regex-methods)
6. [Testing Utility Methods](#testing-utility-methods)

## Text Extraction Methods

### extractEmail(String text)
Extracts the first email address from the given text.

Example:
```java
String text = "Contact us at support@example.com or info@example.com";
String email = StringUtils.extractEmail(text);
// email = "support@example.com"
```

### extractPhoneNumber(String text)
Extracts the first phone number from the given text.

Example:
```java
String text = "Call us at 123-456-7890 or 987-654-3210";
String phone = StringUtils.extractPhoneNumber(text);
// phone = "123-456-7890"
```

### extractDate(String text)
Extracts the first date from the given text.

Example:
```java
String text = "The event is on 2023-06-30 and ends on 2023-07-01";
String date = StringUtils.extractDate(text);
// date = "2023-06-30"
```

### extractUrl(String text)
Extracts the first URL from the given text.

Example:
```java
String text = "Visit our website at https://www.example.com for more information";
String url = StringUtils.extractUrl(text);
// url = "https://www.example.com"
```

## Word Operations

### extractWords(String text)
Splits the text into words.

Example:
```java
String text = "The quick brown fox";
List<String> words = StringUtils.extractWords(text);
// words = ["The", "quick", "brown", "fox"]
```

### extractWordsOfLength(String text, int length)
Extracts words of a specific length from the text.

Example:
```java
String text = "The quick brown fox jumps over the lazy dog";
List<String> threeLetterWords = StringUtils.extractWordsOfLength(text, 3);
// threeLetterWords = ["The", "fox", "the", "dog"]
```

### countWords(String text)
Counts the number of words in the text.

Example:
```java
String text = "The quick brown fox";
int wordCount = StringUtils.countWords(text);
// wordCount = 4
```

## Number Operations

### extractNumbers(String text)
Extracts all numbers from the text.

Example:
```java
String text = "There are 3 apples and 4.5 oranges";
List<String> numbers = StringUtils.extractNumbers(text);
// numbers = ["3", "4.5"]
```

## String Manipulation

### removeWhitespace(String text)
Removes all whitespace from the text.

Example:
```java
String text = "  Hello   World  ";
String result = StringUtils.removeWhitespace(text);
// result = "HelloWorld"
```

### keepOnlyAlphanumeric(String text)
Removes all non-alphanumeric characters from the text.

Example:
```java
String text = "Hello, World! 123";
String result = StringUtils.keepOnlyAlphanumeric(text);
// result = "HelloWorld123"
```

### keepOnlyDigits(String text)
Removes all non-digit characters from the text.

Example:
```java
String text = "Phone: 123-456-7890";
String result = StringUtils.keepOnlyDigits(text);
// result = "1234567890"
```

### keepOnlyLetters(String text)
Removes all non-letter characters from the text.

Example:
```java
String text = "Hello, World! 123";
String result = StringUtils.keepOnlyLetters(text);
// result = "HelloWorld"
```

## Advanced Regex Methods

### extractAllMatches(String text, String regex)
Extracts all matches of a regex pattern from the text.

Example:
```java
String text = "The prices are $10, $20, and $30";
List<String> prices = StringUtils.extractAllMatches(text, "\\$\\d+");
// prices = ["$10", "$20", "$30"]
```

### extractFirstMatch(String text, String regex)
Extracts the first match of a regex pattern from the text.

Example:
```java
String text = "The prices are $10, $20, and $30";
String firstPrice = StringUtils.extractFirstMatch(text, "\\$\\d+");
// firstPrice = "$10"
```

### extractNamedGroups(String text, String regex)
Extracts named groups from a regex pattern match.

Example:
```java
String text = "John Doe (age: 30)";
String regex = "(?<name>\\w+ \\w+) \\(age: (?<age>\\d+)\\)";
Map<String, String> groups = StringUtils.extractNamedGroups(text, regex);
// groups = {"name": "John Doe", "age": "30"}
```

## Testing Utility Methods

### generateRandomString(int length)
Generates a random alphanumeric string of the specified length.

Example:
```java
String randomString = StringUtils.generateRandomString(10);
// randomString might be "a3Xb8cK9m2"
```

### isValidJson(String json)
Checks if a string is valid JSON.

Example:
```java
String validJson = "{\"name\": \"John\", \"age\": 30}";
String invalidJson = "{name: John, age: 30}";
boolean isValid1 = StringUtils.isValidJson(validJson);    // true
boolean isValid2 = StringUtils.isValidJson(invalidJson);  // false
```

### extractBetweenDelimiters(String text, String start, String end)
Extracts all occurrences of text between specified delimiters.

Example:
```java
String html = "<p>First paragraph</p><p>Second paragraph</p>";
List<String> paragraphs = StringUtils.extractBetweenDelimiters(html, "<p>", "</p>");
// paragraphs = ["First paragraph", "Second paragraph"]
```

### getDifference(String str1, String str2)
Compares two strings and returns the differences.

Example:
```java
String expected = "Hello, World!";
String actual = "Hello, Universe!";
String diff = StringUtils.getDifference(expected, actual);
// diff = "Difference at index 7: W vs U
//         Difference at index 8: o vs n
//         Difference at index 9: r vs i
//         Difference at index 10: l vs v
//         Difference at index 11: d vs e"
```

### maskSensitiveInfo(String text, int start, int end)
Masks sensitive information in a string.

Example:
```java
String creditCard = "1234567890123456";
String masked = StringUtils.maskSensitiveInfo(creditCard, 4, 4);
// masked = "1234********3456"
```

### normalizeWhitespace(String text)
Normalizes whitespace in a string.

Example:
```java
String text = "  This   has    irregular    spacing   ";
String normalized = StringUtils.normalizeWhitespace(text);
// normalized = "This has irregular spacing"
```

These methods provide a comprehensive toolkit for string manipulation and extraction, which can be particularly useful in various testing scenarios for both API and UI testing.

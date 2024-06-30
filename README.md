# FileUtils Documentation

This document provides a comprehensive guide to the methods available in the `FileUtils` class, including examples of how to use them in Karate tests.

## Table of Contents
1. [CSV Operations](#csv-operations)
2. [Excel Operations](#excel-operations)
3. [Generic File Operations](#generic-file-operations)
4. [File Searching](#file-searching)
5. [File Compression and Decompression](#file-compression-and-decompression)
6. [CSV to Excel and Reverse](#csv-to-excel-and-reverse)
7. [File Splitting](#file-splitting)
8. [File Generation](#file-generation)
9. [Additional Utility Methods](#additional-utility-methods)

## CSV Operations

### readCsv(String filePath)
Reads a CSV file and returns its content as a List of Maps.

Karate Example:
```gherkin
* def FileUtils = Java.type('com.karateext.file.FileUtils')
* def csvData = FileUtils.readCsv('path/to/your/file.csv')
* print 'CSV Data:', csvData
```

### writeCsv(String filePath, List<Map<String, String>> data)
Writes data to a CSV file.

Karate Example:
```gherkin
* def FileUtils = Java.type('com.karateext.file.FileUtils')
* def data = [{name: 'John', age: '30'}, {name: 'Alice', age: '25'}]
* FileUtils.writeCsv('path/to/output.csv', data)
```

## Excel Operations

### readExcel(String filePath)
Reads an Excel file and returns its content as a List of Maps.

Karate Example:
```gherkin
* def FileUtils = Java.type('com.karateext.file.FileUtils')
* def excelData = FileUtils.readExcel('path/to/your/file.xlsx')
* print 'Excel Data:', excelData
```

### writeExcel(String filePath, List<Map<String, String>> data)
Writes data to an Excel file.

Karate Example:
```gherkin
* def FileUtils = Java.type('com.karateext.file.FileUtils')
* def data = [{name: 'John', age: '30'}, {name: 'Alice', age: '25'}]
* FileUtils.writeExcel('path/to/output.xlsx', data)
```

## Generic File Operations

### readFile(String filePath)
Reads the content of a file as a string.

Karate Example:
```gherkin
* def FileUtils = Java.type('com.karateext.file.FileUtils')
* def fileContent = FileUtils.readFile('path/to/your/file.txt')
* print 'File Content:', fileContent
```

### writeFile(String filePath, String content)
Writes a string to a file.

Karate Example:
```gherkin
* def FileUtils = Java.type('com.karateext.file.FileUtils')
* def content = 'Hello, World!'
* FileUtils.writeFile('path/to/output.txt', content)
```

## File Searching

### searchFilesByExtension(String directory, String extension)
Searches for files with a specific extension in a directory and its subdirectories.

Karate Example:
```gherkin
* def FileUtils = Java.type('com.karateext.file.FileUtils')
* def pdfFiles = FileUtils.searchFilesByExtension('/path/to/directory', 'pdf')
* print 'PDF Files:', pdfFiles
```

## File Compression and Decompression

### compressFile(String sourceFile, String zipFile)
Compresses a file into a ZIP archive.

Karate Example:
```gherkin
* def FileUtils = Java.type('com.karateext.file.FileUtils')
* FileUtils.compressFile('path/to/source.txt', 'path/to/archive.zip')
```

### decompressFile(String zipFile, String destDirectory)
Decompresses a ZIP archive into a destination directory.

Karate Example:
```gherkin
* def FileUtils = Java.type('com.karateext.file.FileUtils')
* FileUtils.decompressFile('path/to/archive.zip', 'path/to/extract')
```

## CSV to Excel and Reverse

### csvToExcel(String csvFile, String excelFile)
Converts a CSV file to an Excel file.

Karate Example:
```gherkin
* def FileUtils = Java.type('com.karateext.file.FileUtils')
* FileUtils.csvToExcel('path/to/source.csv', 'path/to/output.xlsx')
```

### excelToCsv(String excelFile, String csvFile)
Converts an Excel file to a CSV file.

Karate Example:
```gherkin
* def FileUtils = Java.type('com.karateext.file.FileUtils')
* FileUtils.excelToCsv('path/to/source.xlsx', 'path/to/output.csv')
```

## File Splitting

### splitFile(String sourceFile, String destDirectory, int parts)
Splits a file into multiple parts.

Karate Example:
```gherkin
* def FileUtils = Java.type('com.karateext.file.FileUtils')
* FileUtils.splitFile('path/to/largefile.dat', 'path/to/output', 5)
```

## File Generation

### generateFile(String filePath, long sizeInBytes)
Generates a file of a specified size.

Karate Example:
```gherkin
* def FileUtils = Java.type('com.karateext.file.FileUtils')
* FileUtils.generateFile('path/to/newfile.dat', 1024 * 1024) // 1MB file
```

## Additional Utility Methods

### createDirectory(String path)
Creates a new directory.

Karate Example:
```gherkin
* def FileUtils = Java.type('com.karateext.file.FileUtils')
* def created = FileUtils.createDirectory('path/to/new/directory')
* print 'Directory created:', created
```

### getFileSize(String filePath)
Gets the size of a file in bytes.

Karate Example:
```gherkin
* def FileUtils = Java.type('com.karateext.file.FileUtils')
* def fileSize = FileUtils.getFileSize('path/to/your/file.txt')
* print 'File size:', fileSize
```

### getFileExtension(String filePath)
Gets the extension of a file.

Karate Example:
```gherkin
* def FileUtils = Java.type('com.karateext.file.FileUtils')
* def extension = FileUtils.getFileExtension('path/to/your/file.txt')
* print 'File extension:', extension
```

### isFileEmpty(String filePath)
Checks if a file is empty.

Karate Example:
```gherkin
* def FileUtils = Java.type('com.karateext.file.FileUtils')
* def isEmpty = FileUtils.isFileEmpty('path/to/your/file.txt')
* print 'Is file empty:', isEmpty
```

### copyFile(String sourcePath, String destPath)
Copies a file from one location to another.

Karate Example:
```gherkin
* def FileUtils = Java.type('com.karateext.file.FileUtils')
* FileUtils.copyFile('path/to/source.txt', 'path/to/destination.txt')
```

### moveFile(String sourcePath, String destPath)
Moves a file from one location to another.

Karate Example:
```gherkin
* def FileUtils = Java.type('com.karateext.file.FileUtils')
* FileUtils.moveFile('path/to/source.txt', 'path/to/new/location.txt')
```

### deleteFile(String filePath)
Deletes a file.

Karate Example:
```gherkin
* def FileUtils = Java.type('com.karateext.file.FileUtils')
* FileUtils.deleteFile('path/to/unwanted.txt')
```

### listFiles(String directory)
Lists all files in a directory.

Karate Example:
```gherkin
* def FileUtils = Java.type('com.karateext.file.FileUtils')
* def files = FileUtils.listFiles('path/to/directory')
* print 'Files in directory:', files
```

### getMd5Checksum(String filePath)
Calculates the MD5 checksum of a file.

Karate Example:
```gherkin
* def FileUtils = Java.type('com.karateext.file.FileUtils')
* def md5 = FileUtils.getMd5Checksum('path/to/your/file.txt')
* print 'MD5 Checksum:', md5
```

## Best Practices for Using FileUtils in Karate

1. **Error Handling**: Always wrap FileUtils calls in a `try-catch` block to handle potential IOExceptions:

```gherkin
* def FileUtils = Java.type('com.karateext.file.FileUtils')
* try
  * def csvData = FileUtils.readCsv('path/to/your/file.csv')
* catch e
  * print 'Error reading CSV:', e
```

2. **Path Management**: Use `karate.properties['user.dir']` to get the project root directory for constructing file paths:

```gherkin
* def projectRoot = karate.properties['user.dir']
* def filePath = projectRoot + '/src/test/resources/testdata.csv'
* def csvData = FileUtils.readCsv(filePath)
```

3. **Data Verification**: After reading or writing files, always verify the data:

```gherkin
* def csvData = FileUtils.readCsv('path/to/your/file.csv')
* match csvData[0] contains { name: '#string', age: '#number' }
```

4. **Cleanup**: In your teardown steps, make sure to delete any temporary files created during the test:

```gherkin
* def tempFile = 'path/to/temp.txt'
* FileUtils.writeFile(tempFile, 'Test Data')
# ... perform your test ...
* FileUtils.deleteFile(tempFile)
```

By following these best practices and utilizing the FileUtils methods, you can effectively manage file operations in your Karate tests, making them more robust and maintainable.
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

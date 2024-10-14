package edu.alvernia.cs220.util;

public class StringUtilities {

    /**
     * Will count the number of times a letter (letterToCount) in a given
     * String (stringToSearch). To do this, you will need the charAt function
     * that is accessible on the string, and a for loop that will loop for
     * each character on the string. Lastly, an if statement that will do the
     * actual match of the character.
     *
     * Hint: You will need the static methods "Character.toUpperCase(c)" and
     *       "Character.toLowerCase(c)" to find the character regardless of
     *       case.
     *
     * @param stringToSearch
     * @param letterToCount
     * @return
     */
    public static int countLetters(String stringToSearch, char letterToCount) {
        int count = 0;
        char letterToCountUpper = Character.toUpperCase(letterToCount);
        char letterToCountLower = Character.toLowerCase(letterToCount);

        for (int i = 0; i < stringToSearch.length(); i++) {
            char currentChar = stringToSearch.charAt(i);
            if (currentChar == letterToCountUpper || currentChar == letterToCountLower) {
                count++;
            }
        }
        return count;
    }
        // TODO: Implement method per the comment above.

    /**
     * The reverse method will take in a String type, and then it will
     * reverse the order of all characters in the string, and return
     * the original string in reverse.
     *
     * Hint: A for loop should be used, and the "stringToReverse.charAt(i)"
     *       method used to access each character.
     *
     * @param stringToReverse
     * @return the reversed string
     */
    public static String reverse(String stringToReverse) {
        String reversedString = "";

        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            reversedString += stringToReverse.charAt(i);
        }
        return reversedString;
    }

    /**
     * Take in characters, and make them UpperCase if Lower Case,
     * and Lower Case if Upper Case.
     *
     * Hint: A for loop should be used, and the "stringToInvert.charAt(i)"
     *       method used to access the character. Additionally, the following
     *       static methods may need to be used for the char primitive:
     *       Character.isUpperCase(c) - Check if a character is upper case
     *       Character.isLowerCase(c) - Check if a character is lower case
     *       Character.toUpperCase(c) - Make a character upper case
     *       Character.toLowerCase(c) - Make a character lower case
     */
    public static String invertCase(String stringToInvert) {
        String invertedString = "";

        for (int i = 0; i < stringToInvert.length(); i++) {
            char currentChar = stringToInvert.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                invertedString += Character.toLowerCase(currentChar);
            } else if (Character.isLowerCase(currentChar)) {
                invertedString += Character.toUpperCase(currentChar);
            } else {
                invertedString += currentChar;
            }
        }
        return invertedString;
    }

    /**
     * The trim method will take a String, and then remove any 'spaces'
     * from the beginning and ending of the string.
     *
     * Hint: A 'while' loop should be used to check if a character in
     *       the string is a space, as well as the str.charAt(x) method.
     *       The str.substring() method can be used to return the final
     *       string.
     *
     * @param str
     * @return
     */
    public static String trim(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return str.substring(start, end + 1);
    }

    /**
     * A palindrome is a word that is the same forwards and backwards.
     * For example, 'rotator' when revered is 'rotator'.
     *
     * @param str
     * @return true if the inputted string is a palindrome
     */
    public static boolean isPalindrome(String s) {
        String lowerCase = s.toLowerCase();
        int left = 0;
        int right = lowerCase.length() - 1;
        while (left < right) {
            if (lowerCase.charAt(left) != lowerCase.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * The padLeft function will take in a String (str), and then
     * add a number (numberToPad) of characters (toPadWith) to the
     * beginning of the string.
     *
     * Example: padLeft("hello", 'o', 3) will yield "ooohello"
     *
     * @param str the string to pad
     * @param toPadWith the character that the string should be padded with
     * @param numberToPad the number of the pad character to prefix
     * @return the newely padded string
     */
    public static String padLeft(String str, char toPadWith, int numberToPad) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numberToPad; i++) {

            sb.append(toPadWith);
        }
        sb.append(str);

        return sb.toString();
    }

    /**
     * The padRight function will take in a String (str), and then
     * add a number (numberToPad) of characters (toPadWith) to the
     * end of the string.
     *
     * Example: padRight("hello", 's', 4) will yield "hellossss"
     *
     * @param str the string to pad
     * @param toPadWith the character that the string should be padded with
     * @param numberToPad the number of the pad character to prefix
     * @return the newely padded string
     */
    public static String padRight(String str, char toPadWith, int numberToPad) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for (int i = 0; i < numberToPad; i++) {
            sb.append(toPadWith);
        }
        return sb.toString();
    }

    /**
     * Checks if the String (str) passed to this method is also a
     * number. A number will be defined as a string composed of the
     * standard numerical digits (0,1,2,3,4,5,6,7,8,9) as well as a
     * decimal point (.).
     *
     * Hint: A switch statement can be used in conjunction with a for
     *       loop, as well as the str.char(c) method.
     *
     * @param str string to evaluate
     * @return returns true of the string is composed of a number
     */
    public static boolean isNumber(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        boolean decimalSeen = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '.') {
                if (decimalSeen || i == str.length() - 1) {
                    return false;
                }
                decimalSeen = true;
            } else if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    /**
     * The end function will be passed a String (str), and an integer (numberOfCharacters),
     * and will then return the last numberOfCharacters of the string.
     *
     * Example: end("Hello World", 4) will yield "orld"
     *
     * @param str
     * @param numberOfCharacters
     * @return the end portion of str
     */
    public static String end(String str, int numberOfCharacters) {
        if (str == null || numberOfCharacters <= 0 || str.length() < numberOfCharacters) {
            return "";
        }
        return str.substring(str.length() - numberOfCharacters);
    }

    /**
     * The start function will be passed a String (str), and an integer (numberOfCharacters),
     * and will then return the first numberOfCharacters of the string.
     *
     * Example: start("Hello World", 7) will yield "Hello W"
     *
     * @param str
     * @param numberOfCharacters
     * @return the first portion of str
     */
    public static String start(String str, int numberOfCharacters) {
        if (str == null || numberOfCharacters <= 0) {
            return "";
        }
        return str.substring(0, Math.min(str.length(), numberOfCharacters));
    }
}

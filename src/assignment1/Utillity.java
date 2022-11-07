/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 * @author pgn
 */
public class Utillity {

    /**
     * Return true if the parameter 'input' ends with the string referenced by the parameter 'end'.
     * Example if input => "Hello world" and end => "world" then the method should return true.
     * But if input => "Hello world" and end => "Borat" then the method should return false.
     *
     * @param input The string to examine.
     * @param end   The ending we are looking for.
     * @return True if 'input' ends with 'end'.
     */
    public boolean doesInputEndWithEnd(String input, String end) {

        // Find the substring with same length as "end" in the end of input
        String substr = input.substring(input.length() - end.length());

        // If our substring matches with input, it is in the end
        return substr.equals(end);
    }

    /**
     * Return the parameter aString in a version where it is all upper case and no
     * space chars at the beginning or end of the return value.
     *
     * @param aString could be "  hello world  "
     * @return should return something like "HELLO WORLD" for the example parameter above
     */
    public String allCapitalsAndNoWhiteSpace(String aString) {

        return aString.toUpperCase().trim();

        /*
        // Left side checks
        int leftIndex = -1;
        for (int i = 0; i < aString.length() - 1; i++) {
            // Check if we have an empty
            if (aString.charAt(i) == ' ')
                leftIndex = i;
            else
                break;
        }
        if (leftIndex != -1 )
            aString = aString.substring(leftIndex + 1);

        // Right side checks
        int rightIndex = -1;
        for (int i = aString.length() - 1; i > 0; i--) {
            if (aString.charAt(i) == ' ') {
                rightIndex = i;
            }
            else
                break;
        }
        if (rightIndex != -1 )
            aString = aString.substring(0,rightIndex);

        return aString.toUpperCase();
        */
    }
}

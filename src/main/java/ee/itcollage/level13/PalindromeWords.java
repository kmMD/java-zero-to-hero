package ee.itcollage.level13;

import java.util.List;

public class PalindromeWords {

    // write a program to analyze palindrome words
    // main method shows how to reverse a string
    // write tests for your code

    /**
     * palindrome is a word that is equal to itself reversed.
     * For example: radar (reversed radar) is a palindrome
     * cow (reversed woc) is not a palindrome
     */
    public static AnalysisResult analyzePalindromes(List<String> strings){
        AnalysisResult result = new AnalysisResult();
        for(String string : strings) {
            if (string.equals(new StringBuilder(string).reverse().toString())) {
                result.addPalindrome(string);
            }
            else {
                result.addOther(string);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String palidrome = "radar";
        String reversedPalidrome = new StringBuilder(palidrome).reverse().toString();
        String other = "other";
        String otherReversed = new StringBuilder(other).reverse().toString();

        System.out.println(String.format("%s %s", palidrome, reversedPalidrome));
        System.out.println(String.format("%s %s", other, otherReversed));
    }
}
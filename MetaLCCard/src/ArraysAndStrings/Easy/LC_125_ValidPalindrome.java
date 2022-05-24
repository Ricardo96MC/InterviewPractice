package ArraysAndStrings.Easy;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 */
public class LC_125_ValidPalindrome {

    String s =  "A man, a plan, a canal: Panama";

    public void driver() {
        System.out.println("Is: '" + s + "' a palindrome?");
        System.out.println(isPalindrome(s));

    }

    /**
     *  The thought process here is to compare both the last ans first characters
     *  together and return false if they are not the same, pretty simple and runs in
     *  (O)n time
     */

    private boolean isPalindrome(String s) {
        //for loop with two variables, at the ends and start
        for(int i = 0,j = s.length() - 1; i < j; i++, j--) {

            //These next to clauses skips any characters that are not letters or numbers
            //from both the start and end, and then adjusting the bounds if so
            while (i < j && !Character.isLetterOrDigit(s.charAt(i)))
                i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j)))
                j--;
            //Now we actually compare the characters and return false if they are not the sames
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
                return false;
        }
        //If all goes well we go thru the entire string and return true if we never hit a false
        return true;
    }
}

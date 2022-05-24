package ArraysAndStrings.Easy;

/**
 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
 *
 * Input: s = "abca"
 * Output: true
 * Explanation: You could delete the character 'c'.
 */
public class LC_680_ValidPalindrom2 {

    String s = "abca";

    public void driver(){
        validPalindrome(s);
    }
    private boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }

            i++;
            j--;
        }
        return true;
    }

    private boolean isPalindrome(String s, int i, int j) {
        while(i < j){
            if(s.charAt(i++) != s.charAt(j--))
                return false;
        }

        return true;
    }

}

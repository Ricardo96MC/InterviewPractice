package ArraysAndStrings.Medium;

/**
 * Given a string 's' find the longest substring without repeating characters
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 */

/***********************************************************/

import java.util.HashSet;

/**
 *  We can use the twoPointer approach, where one advances down the string until a repeated character
 *  is found. We can track characters wit a hashset amd return the current counter or set size depending whichever
 *  is larger
 */
public class LC_3_LongestSubstringWithoutRepeatingCharacters {

    private String s = "abcabcbb";

    public void driver() {
        System.out.println("The longest substring count is: " + lengthOfLongestSubstring(s));
    }

    private int lengthOfLongestSubstring(String s) {
        int aPointer = 0;
        int bPointer = 0;
        int max = 0;

        HashSet<Character> hashSet = new HashSet<>();
        System.out.println("The current string is: " + s);
        while(bPointer < s.length()){
            char currentChar = s.charAt(bPointer);
            if(!hashSet.contains(currentChar)) {
                bPointer++;
                hashSet.add(currentChar);
                max = Math.max(max, hashSet.size());
            } else {
                hashSet.remove(s.charAt(aPointer));
                aPointer++;
            }
        }
        return max;
    }
}

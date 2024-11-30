import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths are different, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Compare sorted arrays
        return Arrays.equals(sArray, tArray);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.isAnagram("anagram", "nagaram")); // Output: true
        System.out.println(solution.isAnagram("rat", "car"));         // Output: false
        System.out.println(solution.isAnagram("listen", "silent"));   // Output: true
        System.out.println(solution.isAnagram("hello", "world"));     // Output: false
    }
}

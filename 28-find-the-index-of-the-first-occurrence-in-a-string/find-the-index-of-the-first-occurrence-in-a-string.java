class Solution {
    public int strStr(String haystack, String needle) {
        // Check if needle is empty
        if (needle.isEmpty()) {
            return 0;
        }

        // Iterate through haystack to find the first occurrence of needle
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            // Check if the substring matches the needle
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }

        // Return -1 if needle is not found
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        System.out.println(solution.strStr(haystack1, needle1)); // Output: 0

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println(solution.strStr(haystack2, needle2)); // Output: -1
    }
}

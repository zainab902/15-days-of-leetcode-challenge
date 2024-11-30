class Solution {
    public int lengthOfLastWord(String s) {
        // Remove trailing spaces and split the string into words
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(' ');
        // Length of the last word
        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.lengthOfLastWord("Hello World")); // Output: 5
        System.out.println(solution.lengthOfLastWord("   fly me   to   the moon  ")); // Output: 4
        System.out.println(solution.lengthOfLastWord("luffy is still joyboy")); // Output: 6
        System.out.println(solution.lengthOfLastWord("a")); // Output: 1
    }
}

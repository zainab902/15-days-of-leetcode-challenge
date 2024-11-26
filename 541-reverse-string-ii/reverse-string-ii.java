    class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n; i += 2 * k) {
            // Reverse the first k characters in the current 2k segment
            int start = i;
            int end = Math.min(i + k - 1, n - 1); // Ensure we don't go out of bounds
            reverse(arr, start, end);
        }

        return new String(arr);
    }

    // Helper function to reverse a segment of the array
    private void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "abcdefg";
        int k1 = 2;
        System.out.println(solution.reverseStr(s1, k1)); // Output: "bacdfeg"

        String s2 = "abcd";
        int k2 = 2;
        System.out.println(solution.reverseStr(s2, k2)); // Output: "bacd"
    }
}


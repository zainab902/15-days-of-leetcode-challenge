class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0; // Pointer for the last non-zero element

        // Move non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroIndex] = nums[i];
                lastNonZeroIndex++;
            }
        }

        // Fill the remaining positions with zeroes
        for (int i = lastNonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums1);
        System.out.println(java.util.Arrays.toString(nums1)); // Output: [1, 3, 12, 0, 0]

        int[] nums2 = {0};
        solution.moveZeroes(nums2);
        System.out.println(java.util.Arrays.toString(nums2)); // Output: [0]

        int[] nums3 = {1, 0, 2, 0, 3, 4};
        solution.moveZeroes(nums3);
        System.out.println(java.util.Arrays.toString(nums3)); // Output: [1, 2, 3, 4, 0, 0]
    }
}

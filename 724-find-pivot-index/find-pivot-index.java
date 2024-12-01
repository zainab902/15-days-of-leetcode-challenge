class Solution {
    public int pivotIndex(int[] nums) {
        // Calculate the total sum of the array
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        // Initialize leftSum to 0
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            // Check if the left sum equals the right sum
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i; // Return the pivot index
            }
            // Update leftSum to include the current element
            leftSum += nums[i];
        }
        
        // If no pivot index is found, return -1
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.pivotIndex(new int[] {1, 7, 3, 6, 5, 6})); // Output: 3
        System.out.println(solution.pivotIndex(new int[] {1, 2, 3}));          // Output: -1
        System.out.println(solution.pivotIndex(new int[] {2, 1, -1}));        // Output: 0
    }
}

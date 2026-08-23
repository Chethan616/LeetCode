class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = 0;
        double currentSum = 0;
        double maxSum = -Double.MAX_VALUE; // Handles negative numbers correctly

        while (right < nums.length) {
            // Expand the window by adding the right element
            currentSum += nums[right];

            // When the window size reaches k, check max and contract
            if (right - left + 1 == k) {
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
                // Shrink the window from the left for the next iteration
                currentSum -= nums[left];
                left++;
            }
            
            right++; // Move the right pointer forward
        }

        return maxSum / k;
    }
}

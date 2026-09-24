class Solution {
    public int missingNumber(int[] nums) {
        int arrSum = 0;
        int n = nums.length;
        for(int i =0; i<n; i++){
            arrSum += nums[i];
        }
        int total = (n * (n+1))/2;
        int missing = total - arrSum;

        return missing;
    }
}
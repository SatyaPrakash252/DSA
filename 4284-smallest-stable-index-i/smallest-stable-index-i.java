class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        for(int i =0; i<n; i++){
           int maxEle = Integer.MIN_VALUE;
           int minEle = Integer.MAX_VALUE;
            for(int j =0; j<=i; j++){
                maxEle = Math.max(maxEle,nums[j]);
            }
            for(int j =i; j<=n-1; j++){
                minEle = Math.min(minEle,nums[j]);
            }
            if(maxEle - minEle <= k){
                return i;
            }
        }
        return -1;
    }
}
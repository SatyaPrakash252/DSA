class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxi_area =0;
        while(right > left){
            int mini_height = Math.min(height[left], height[right]);
            int dist = right - left;
            int area = mini_height * dist;
            maxi_area = Math.max(maxi_area , area);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxi_area;
    }
}
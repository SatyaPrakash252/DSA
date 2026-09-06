class Solution {
    public int maximumWealth(int[][] accounts) {
        int[]res = new int[accounts.length];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<accounts.length;i++){
            int sum = 0;
            for(int j =0;j<accounts[i].length; j++){
                sum += accounts[i][j];
            }
            res[i] = sum;
        }
        for(int i =0;i<res.length; i++){
            max = Math.max(max,res[i]);
        }
        return max;
    }
}
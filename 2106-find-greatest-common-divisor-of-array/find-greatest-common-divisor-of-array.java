import java.math.BigInteger;
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n1 = nums[0];
        int n2 = nums[nums.length-1];
        BigInteger b1 = BigInteger.valueOf(n1);
        BigInteger b2 = BigInteger.valueOf(n2);
        
        BigInteger gcd = b1.gcd(b2);

        return gcd.intValue();

    }
}
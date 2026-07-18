// import java.math.BigInteger;
// class Solution {
//     public int findGCD(int[] nums) {
//         Arrays.sort(nums);
//         int n1 = nums[0];
//         int n2 = nums[nums.length-1];
//         BigInteger b1 = BigInteger.valueOf(n1);
//         BigInteger b2 = BigInteger.valueOf(n2);
        
//         BigInteger gcd = b1.gcd(b2);

//         return gcd.intValue();

//     }
// }

class Solution {

    public int findGCD(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return gcd(min, max);
    }

    public int gcd(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
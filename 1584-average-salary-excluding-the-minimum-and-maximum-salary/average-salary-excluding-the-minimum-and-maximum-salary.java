class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int sum =0;
        int k =0;
        for(int i = 1; i<= salary.length - 2; i++){
            sum += salary[i];
            k++;
        }
        return (double)sum/k;
    }
}
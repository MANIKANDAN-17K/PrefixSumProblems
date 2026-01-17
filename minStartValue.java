class Solution {
    public int minStartValue(int[] nums) {
        int minPreSum =0;
        int sum = 0;
        for(int num : nums){
            sum+=num;
            minPreSum = Math.min(minPreSum,sum);
        }
        return 1-minPreSum;
    }
}

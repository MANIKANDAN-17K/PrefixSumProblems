class Solution {
    public int pivotIndex(int[] nums) {
        int wholeSum = 0;
        for(int i = 0;i<nums.length;i++){
            wholeSum += nums[i];
        }
        int lTotal = 0;
        for(int i =0;i<nums.length;i++){
            int rTot = wholeSum - lTotal - nums[i];
            if(rTot == lTotal){
                return i;
            }
            lTotal += nums[i];
        }
        return -1;
    }
}

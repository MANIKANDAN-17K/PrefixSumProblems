class Solution {
    public int largestAltitude(int[] gain) {
        int At = 0;
        int Cu = 0;
        for(int i = 0;i< gain.length;i++){
            Cu += gain[i];
            At = Math.max(At,Cu);
        }
        return At;
    }
}

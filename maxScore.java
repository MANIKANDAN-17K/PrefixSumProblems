class Solution {
    public int maxScore(String s) {
        int tot = 0;
        int zero = 0;
        int ones = 0;
        int score = Integer.MIN_VALUE;
        for(char c : s.toCharArray()){
            if(c == '1') tot++;
        }
        for(int i = 0;i<s.length() - 1 ;i++){
            if(s.charAt(i) == '0') zero++;
            else ones++;
            int cur = zero + (tot - ones);
            score = Math.max(score,cur);
        }
        return score;
        
    }
}

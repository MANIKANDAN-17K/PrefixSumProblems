class Solution {
    public int maximumPopulation(int[][] logs) {
        int arr[] = new int[101];
        for(int i = 0;i<logs.length;i++){
            int a = logs[i][0];
            int b = logs[i][1];
            arr[a - 1950]++;
            arr[b - 1950]--;
        }
        int pop = 0;
        int year = 0;
        int max = 0;
        for(int i = 0;i<100;i++){
            pop += arr[i];
            if(pop > max){
                max = pop;
                year = i + 1950;
            }
        }
        return year;
    }
}

class Solution {
    public int maximumPopulation(int[][] logs) {
    int [] population = new int[101];
    int max = 0;
    for(int i =0; i <logs.length; i++){
        population[logs[i][0] - 1950]++;
        population[logs[i][1] - 1950]--;
    }
    int current = 0;
    int answer = 1950;
    for(int i =0; i<101; i++){
        current = current + population[i];

        if(current>max){
            max = current;
            answer = i+1950;
        }
    }return answer;    
    }
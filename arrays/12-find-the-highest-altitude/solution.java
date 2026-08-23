class Solution {
    public int largestAltitude(int[] gain) {
    int [] ans = new int[gain.length+1];
    for(int i =0; i<gain.length; i ++){
        ans[i+1] = gain[i]+ ans[i];
    }
    int max = ans[0];
    for(int i =0; i<gain.length; i ++){
        if(ans[i]>max){
            max = ans[i];
        }
    }return max;   
    }
}
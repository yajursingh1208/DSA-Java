class Solution {
    public int minEatingSpeed(int[] piles, int h) {
    int max = 0;
    for(int i = 0; i < piles.length; i++){
        if(piles[i] > max){
            max = piles[i];
        }
    }
    int start = 1;
    int end = max;
    int ans = max;
    while(start <= end){
        int mid = start + (end - start)/2;
        int hours = 0;

        for(int k = 0; k < piles.length; k++){
            hours = hours + (piles[k]+mid-1)/mid;
        }

        if(hours<= h){
            ans = mid;
            end = mid - 1;
        }
        else{
            start = mid + 1;
        }
    }    
    return ans;
    }
}
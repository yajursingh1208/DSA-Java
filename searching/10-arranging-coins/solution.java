class Solution {
    public int arrangeCoins(int n) {
    int start = 0;
    int end = n;
    int ans = 0;
    while(start <= end){
        int mid = start + (end - start)/2;
        long coinsNeeded = (long) mid*(mid+1)/2;
        if(coinsNeeded<=n){
            ans = mid;
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
    }    
    return ans;
    }
}
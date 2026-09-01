class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
    int sumA = 0;
    for(int i = 0; i < aliceSizes.length; i++){
        sumA = sumA + aliceSizes[i];
    }
    int sumB = 0;
    for(int i = 0; i < bobSizes.length; i++){
        sumB = sumB + bobSizes[i];
    }
    Arrays.sort(aliceSizes);
    for(int i = 0; i < bobSizes.length; i++){
        int start = 0;
        int end = aliceSizes.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            int target = bobSizes[i] + (sumA-sumB)/2;
            if(aliceSizes[mid] == target){
                return new int[]{target, bobSizes[i]};
            }
            else if(aliceSizes[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
    }
    return new int[0];    
    }
}
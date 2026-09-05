class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
    int count = 0;
    for(int i = 0; i < arr1.length; i++){
        boolean valid = true;
        for(int j = 0; j < arr2.length; j++){
            if(Math.abs(arr1[i] - arr2[j]) <= d){
                valid = false;
                break;
            }
        }
        if(valid){
            count++;
        }
    }    
    return count;
    }
}

//approach 2
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
    Arrays.sort(arr2);
    int count = 0;
    for(int i = 0; i< arr1.length; i++){
        int low = arr1[i] - d;
        int high = arr1[i] + d;
        int start = 0;
        int end = arr2.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr2[mid] < low){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        if(start == arr2.length || arr2[start] > high){
            count++;
        }
    } 
    return count; 
    }
}
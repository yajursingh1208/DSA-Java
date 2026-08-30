class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int ans [] = new int[2];
    for(int i = 0; i<numbers.length; i++){
        for(int j = i+1; j<numbers.length; j++){
            if(numbers[j] == target - numbers[i]){
                ans[0] = i+1;
                ans[1] = j+1;
                return ans;
            }   
        }
    }   
    return ans;  
    }
}

// approach 2: 2 pointer method
class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length-1;
    int ans [] = new int [2];
    while(left<right){
        if(numbers[left]+numbers[right]==target){
            ans[0] = left + 1;
            ans[1] = right + 1;
            return ans;
        }
        else if(numbers[left]+numbers[right]<target){
            left++;
        }
        else{
            right--;
        }
    } return ans; 
    }
}
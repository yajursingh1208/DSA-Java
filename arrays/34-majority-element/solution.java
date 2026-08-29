class Solution {
    public int majorityElement(int[] nums) {
    int candidiate = nums[0];
    int count = 0;    
    for(int i =0; i<nums.length; i++){
        if(count == 0){
            candidiate = nums[i];
        }
        if(nums[i] == candidiate){
            count++;
        }
        else{
            count--;
        }
    }return candidiate;
    }
}
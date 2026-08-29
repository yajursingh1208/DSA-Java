class Solution {
    public void rotate(int[] nums, int k) {
    int n = nums.length;
    k = k%nums.length;
    reverse(nums, 0, n-1);
    reverse(nums, 0, k-1);
    reverse(nums, k, n-1);    
    }
    public void reverse(int[] nums, int left, int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            right--;
            left++;
        }
    }
}

# APPROACH-2

class Solution {
    public void rotate(int[] nums, int k) {
    int n = nums.length;
    k = k%n;  
    int[] ans = new int [n];
    for(int i =0; i<n; i++){
        int newindex = (i+k)%n;
        ans[newindex] = nums[i];
    }
    for(int i =0; i<n; i++){
        nums[i] = ans[i];
    }
    }
    }
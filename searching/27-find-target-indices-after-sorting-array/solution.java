class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
    ArrayList<Integer> list = new ArrayList<>();
    Arrays.sort(nums);
    int start = 0;
    int end = nums.length - 1;
    while(start <= end){
        int mid = start + (end - start)/2;
        if(nums[mid] == target){
            end = mid - 1;
        }
        else if(nums[mid] < target){
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
    }
    while(start < nums.length && nums[start] == target){
        list.add(start);
        start++;
    }  
    return list; 
    }
}
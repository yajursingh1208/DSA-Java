import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Set<Integer> set = new HashSet <>();
    for(int i = 0; i < nums2.length; i++){
        int target = nums2[i];
        int start = 0;
        int end = nums1.length - 1;
        while(start <= end){
        int mid = start + (end - start)/2;
        if(nums1[mid] == target){
            set.add(target);
            break;
        }
        else if(nums1[mid] < target){
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }}
    }
    int[] ans = new int[set.size()];
    int index = 0;
    for(int x: set){
        ans[index] = x;
        index++;
    }    
    return ans;
    }
}
import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    ArrayList<Integer> remaining = new ArrayList<>();
    for(int i = 0; i<nums1.length; i++){
        remaining.add(nums1[i]);
    }
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 0; i < nums2.length; i++){
        int target = nums2[i];
        int start = 0;
        int end = remaining.size() - 1;
        while(start <= end){
        int mid = start + (end - start)/2;
        if(remaining.get(mid) == target){
            list.add(target);
            remaining.remove(mid);
            break;
        }
        else if(remaining.get(mid) < target){
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }}
    }
    int[] ans = new int[list.size()];
    int index = 0;
    for(int x: list){
        ans[index] = x;
        index++;
    }    
    return ans;
    }
}
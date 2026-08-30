class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
    int start = 0;
    int end = letters.length -1;
    while(start<= end){
        int mid = start + (end - start)/2;
        if(letters[mid] <= target){
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
        
    }   
    return letters[start%letters.length];    
    }
}

// approach 2 linear search
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
    for(int i =0; i<letters.length; i++){
        if(letters[i]> target){
            return letters[i];
        }   
    }   
    return letters[0]; 
    }
}
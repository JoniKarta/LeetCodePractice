/*
	Problem: https://leetcode.com/problems/longest-consecutive-sequence/
*/
class Solution {
    public int longestConsecutive(int[] nums) {
        int seqLen = 0;
        Map<Integer,Boolean> map = new HashMap<>();
        int left, right;
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],true);
        }
        

        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) == false)  // Which means i visted the number already
                continue;
            
            
            map.put(nums[i], false); // Dont vistid anymore
            
            int currentLeft = nums[i] - 1;
            left = nums[i];
            while(map.containsKey(currentLeft)){
                left = currentLeft;
                map.put(currentLeft,false);
                currentLeft -= 1;
                
            }
            
            int currentRight = nums[i] + 1;
            right = nums[i];
            while(map.containsKey(currentRight)){
                right = currentRight;
                map.put(currentRight,false);
                currentRight += 1;
            }
            
            seqLen = Math.max(seqLen, right - left + 1);
        }
        
        return seqLen;
        
    }
}

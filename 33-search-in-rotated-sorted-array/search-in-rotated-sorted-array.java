class Solution {
    public int search(int[] nums, int target) {

        int length = nums.length;
        for(int i=0;i<length;i++){
            if(nums[i]==target)
            return i;
        }
        return -1;
        
    }
}
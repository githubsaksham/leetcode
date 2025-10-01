class Solution {
    public int findMin(int[] nums) {
        int length= nums.length;
        int left=0;
        int right=length-1;
        

        while(left<right){
            int mid=(right+left)/2;
            

            if(nums[right]<nums[mid]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return nums[left];
        
    }
}
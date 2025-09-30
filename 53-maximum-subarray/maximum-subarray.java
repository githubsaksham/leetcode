class Solution {
    public int maxSubArray(int[] nums) {
        int length= nums.length;
        int max= nums[0];
        int currentsum = 0;
        for(int i=0;i< length;i++){
            currentsum += nums[i];
            if(currentsum>max){
                max=currentsum;
            }
            if(currentsum<0){
                currentsum=0;
            }


        }
        return max;
        
    }
}
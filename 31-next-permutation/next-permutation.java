class Solution {
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }

    public void reverse(int[] nums, int start, int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    
    }
    public void nextPermutation(int[] nums) {
        int length = nums.length ;
        if(length==1) return ;
        int i=length -2;

        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }

        if(i>=0){
            int j=length-1;
            while(j>=0 && nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }

        
        reverse(nums,i+1,length-1);



        
    }
}
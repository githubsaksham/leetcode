class Solution {
    public boolean isPalindrome(int x) {
        int number=0;
        int m=x;
        if(x<0)
         return false;
        while(m!=0){
            int v=m%10;
            number=(number*10)+v;
            m=m/10;
        }
        return number==x;
           
    }
}
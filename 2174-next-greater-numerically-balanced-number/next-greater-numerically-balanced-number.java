class Solution {
    public int nextBeautifulNumber(int n) {
        for(int i=n+1; i<=666666; i++) {
            if(isBeautiful(i)) {
                return i;
            }
        }
        return 1224444;
    }

    boolean isBeautiful(int inp) {
        String num = Integer.toString(inp);
        if(num.indexOf('0')!=-1)
            return false;

        int arr[] = new int[10];
        for(char ch : num.toCharArray()) {
            arr[ch-'0']++;
        }
        for(int i=1; i<arr.length; i++) {
            if(arr[i]>0 && arr[i]!=i)
                return false;
        }

        return true;
    }
}
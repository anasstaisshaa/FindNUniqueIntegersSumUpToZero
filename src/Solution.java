class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];

        if(n % 2 != 0 ){
            for(int i = 1; i < n; i+=2 ){
                ans[i-1] = i;
                ans[i] = i - i*2;
            }
            ans[n-1] = 0;
        } else {
            for(int i = 1; i < n; i+=2 ){
                ans[i-1] = i;
                ans[i] = i - i*2;
            }
        }

        return ans;
    }
}
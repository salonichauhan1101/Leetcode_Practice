class Solution {
    public int reverse(int x) {
        int rev=0;
        int temp=0;

        while(x!=0){
            temp=x%10;

            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10){
                return 0;
                
            }
            rev=temp+rev*10;
            x=x/10;
        }
        return rev;
    }
}

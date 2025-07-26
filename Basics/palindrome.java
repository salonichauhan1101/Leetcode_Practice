class Solution {
    public boolean isPalindrome(int x) {
        int dup=x;
        int rev=0;
        int temp=0;

        while(x>0){
            temp=x%10;
            rev=rev*10+temp;
            x=x/10;
        }

        if(rev==dup){
            return true;
        }
        else{
            return false;
        }
    }
}

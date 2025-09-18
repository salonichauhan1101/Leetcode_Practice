class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;

        Arrays.sort(nums);
        int cnt=0;
        int max=1;
        int smallerNum=Integer.MIN_VALUE;
        

        for(int i=0;i<n;i++){
            if(nums[i]-1 == smallerNum){
                cnt++;
                smallerNum=nums[i];
            }
            else if(nums[i]!=smallerNum){
            cnt=1;
            smallerNum=nums[i];
            }
            max=Math.max(max,cnt);

        }
        return max;
    }
}

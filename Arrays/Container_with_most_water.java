class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int maxArea=0;

        
        while(left<right){
            maxArea=Math.max(maxArea,(right-left)* Math.min(height[left],height[right]));
            if(height[left]>height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return maxArea;
    }
}

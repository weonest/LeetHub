class Solution {
    public int maxArea(int[] height) {
        
        int max = 0;
        
        int left = 0, right = height.length-1;
        
        while (left < right) {
            
            int x = right - left;
            int y = Math.min(height[left], height[right]);
            max = Math.max(max, x * y);
            
            if (height[left] <= height[right]){
                left++;
            }else {
                right--;
            }
            
        }
        
        return max;
    }
}
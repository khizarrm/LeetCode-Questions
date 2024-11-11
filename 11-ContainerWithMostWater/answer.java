class Solution {
    public int maxArea(int[] heights) {
        int l = 0; 
        int r = heights.length - 1; 
        int area = 0; 
        for (int i = 0; i < heights.length; i++){
            int temp = Math.min(heights[l], heights[r]) * Math.abs(l - r);
            if (heights[l] < heights[r]){
                l++;
            } else {
                r--;
            }
            area = Math.max(temp, area);
        }
        return area; 
    }
}


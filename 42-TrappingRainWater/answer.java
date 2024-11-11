class Solution {
    public int trap(int[] height) {
        int[] maxLefts = new int[height.length];
        int[] maxRight = new int[height.length];
        int[] minArr = new int[height.length];
        int mr = 0; 
        int ml = 0; 

        //for ml 
        for (int i = 0; i < height.length - 1; i++){
            ml = Math.max(ml, height[i]);
            maxLefts[i] = ml; 
        }

        for (int i = height.length - 1; i >= 0; i--){
            mr = Math.max(mr, height[i]);
            maxRight[i] = mr; 
        }

        for (int i = 0; i < height.length - 1; i++){
            minArr[i] = Math.min(maxLefts[i], maxRight[i]);
        }

        int output = 0; 
        for (int i = 0; i < height.length - 1; i++){
            output += Math.abs(minArr[i] - height[i]);
        }

        return output; 

    } 
}


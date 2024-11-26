class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] output = new int[nums.length - k + 1]; 
        int l = 0; 
        int r = l + k - 1; 
        while (r < nums.length){
            int maxi = nums[l]; 
            for (int i = l; i <= r; i++){
                maxi = Math.max(nums[i], maxi);
            }
            output[l] = maxi;
            r++; 
            l++; 
        }
        return output;
    }
}


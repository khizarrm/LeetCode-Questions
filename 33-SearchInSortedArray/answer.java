class Solution {
    public int search(int[] nums, int target) {
        int t = target; 
        int l = 0; 
        int m = 0; 
        int r = nums.length - 1; 
        while (l <= r){
            m = (l + r)/ 2; 
            if (nums[m] == t){return m;}
            if (nums[l] <= nums[m]){ //means window is unsorted 
                if (nums[m] < t || t < nums[l]){
                    l = m+1;
                } else {
                    r = m-1;
                }
            } else {
                if (nums[m] > t || t > nums[r]){
                    r = m-1;
                } else{
                    l = m+1;
                }
            }
        }

        if (nums[m] != target){
            return -1; 
        }

        return m; 
    }
}


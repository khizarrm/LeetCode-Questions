class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        set<vector<int>> s;
        vector<vector<int>> output;
        for (int i = 0; i < nums.size(); i++){
            if (i > 0 && nums[i] == nums[i-1]){continue;}
            int l = i + 1;
            int r = nums.size() - 1; 
            while (l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if (sum < 0){
                    l++;
                } else if (sum > 0) {
                    r--;
                } else {
                    s.insert({nums[i], nums[l], nums[r]});
                    l++;
                }
            }
        }

        for (auto triplets : s){
            output.push_back(triplets);
        }
        
        return output; 
    }
};
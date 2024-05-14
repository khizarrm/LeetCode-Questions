class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        if (numbers.size()  == 0){
            return numbers; 
        }
        int left = 0;
        int right = numbers.size()-1;
        vector<int> v; 

        for (int i = 0; i < numbers.size(); i++){
            int number = numbers[left] + numbers[right];
            if (number > target){
                right--;
            } else if (number < target){
                left++;
            } else {
                v.push_back(left+1);
                v.push_back(right+1);
                return v;
            }
        }
        
      
        return v; 
    }
};
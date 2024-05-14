class Solution {
public:
    bool isPalindrome(string s) {
 
        string lowercaseS = "";
        for (char c : s){
            if (!ispunct(c) && c != ' '){
                lowercaseS += tolower(c);
            }
        }

        int left = 0;
        int right = lowercaseS.size()-1;
        
        for (int i = 0; i < lowercaseS.size(); ++i){
            if (lowercaseS[left] != lowercaseS[right]){return false;}
            left++;
            right--;
        }

        return true;
    }
};

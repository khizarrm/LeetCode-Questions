class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>(); 
        backTrack(list, 0, 0, "", n);
        return list
    }

    public void backTrack(List<String> res, int open, int closed, String s, int n){
        if (open == closed == n){
            res.add(s); 
            return; 
        }

        if (open < n){
            backTrack(res, open + 1, closed, s + "(", n);
        }

        if (closed < open){
            backTrack(res, open, closed + 1, s + ")", n);
        }
    }
}

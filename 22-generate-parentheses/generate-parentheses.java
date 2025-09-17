class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        solve(0, 0, n, ans, str);
        return ans;
    }
    public void solve(int open, int close, int n, List<String> res, StringBuilder str) {
        if(open == n && close == n) {
            res.add(str.toString());
        }
        if(open < n) {
            str.append('(');
            solve(open + 1, close, n, res, str);
            str.deleteCharAt(str.length()-1);
        }
        if(close < open) {
            str.append(')');
            solve(open, close + 1, n, res, str);
            str.deleteCharAt(str.length()-1);
        }
    }
}
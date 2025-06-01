class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=1;i<=numRows;i++) {
            ArrayList<Integer> ans = row(i);
            res.add(ans);
        }
        return res;
    }
    public ArrayList<Integer> row(int row) {
        int ans = 1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(ans);
        for(int i=1;i<row;i++) {
            ans = ans * (row - i);
            ans = ans / i;
            list.add(ans);
        }
        return list;
    }
}
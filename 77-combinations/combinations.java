class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(ans, list, 1, n, k);
        return ans;
    }
    public void helper(List<List<Integer>> ans, List<Integer> list, int index, int n, int k) {
        if(list.size() == k) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<=n-(k-list.size()) + 1;i++) {
            list.add(i);
            helper(ans, list, i+1, n, k);
            list.remove(list.size()-1);
        }
    }
}
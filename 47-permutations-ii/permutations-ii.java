class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        helper(ans, list, used, nums);
        return ans;
    }
    public void helper(List<List<Integer>> ans, List<Integer> list, boolean[] used, int[] nums) {
        if(list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++) {
            if(used[i]) continue;
            //check for duplicate values
            if(i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;

            //used array to keep count that a same value(index) is not considered again
            used[i] = true;
            list.add(nums[i]);
            helper(ans, list, used, nums);
            list.remove(list.size()-1);
            used[i] = false;
        }
    }
}
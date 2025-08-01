class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums.length;j++) {
                if(Math.abs(i-j) <= k && nums[j] == key) {
                    set.add(i);
                    break;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}
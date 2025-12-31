class FindSumPairs {
    int[] n1;
    int[] n2;
    Map<Integer, Integer> map = new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        n1 = nums1;
        n2 = nums2;
        for(int ele : nums2) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
    }
    
    public void add(int index, int val) {
        int oldVal = n2[index];
        int newVal = n2[index] + val;
        map.put(oldVal, map.get(oldVal) - 1);
        if(map.get(oldVal) == 0) map.remove(oldVal);
        map.put(newVal, map.getOrDefault(newVal, 0) + 1);
        n2[index] += val;
    }
    
    public int count(int tot) {
        int count = 0;
        for(int i=0;i<n1.length;i++) {
            if(map.containsKey(tot - n1[i])) count += map.get(tot - n1[i]);
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */
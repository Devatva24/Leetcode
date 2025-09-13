class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int prefixSum = 0;
        int count = 0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++) {
            prefixSum += nums[i];
            if(map.containsKey(prefixSum - k)) count = count + map.get(prefixSum - k);
            if(map.containsKey(prefixSum)) {
                map.put(prefixSum,map.get(prefixSum)+1);
            } else {
                map.put(prefixSum,1);
            }
        }
        return count;
    }
}
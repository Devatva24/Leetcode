class Solution {
    public int totalFruit(int[] nums) {
        int i=0;
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int j=0;j<nums.length;j++) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            while(map.size() > 2) {
                map.put(nums[i], map.get(nums[i]) - 1);
                if(map.get(nums[i]) == 0) map.remove(nums[i]);
                i++;
            }
            max = Math.max(max, j - i + 1);
        }
        return max;
    }
}
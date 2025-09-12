class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++) {
            min = Math.min(min, arr[i] - arr[i-1]);
        }
        int l=0;
        int r=1;
        while(r<arr.length) {
            if(arr[r] - arr[l] == min) {
                List<Integer> list = new ArrayList<>();
                list.add(arr[l]);
                list.add(arr[r]);
                ans.add(list);
            }
            l++;
            r++;
        }
        return ans;
    }
}
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        //Using space optimization
        int n = triangle.size();
        List<Integer> front = new ArrayList<>();
        for (int val : triangle.get(n - 1)) {
            front.add(val);
        }
        for(int i=n-2;i>=0;i--) {
            List<Integer> curr = new ArrayList<>();
            for(int j=0;j<=i;j++) {
                int down = triangle.get(i).get(j) + front.get(j);
                int diag = triangle.get(i).get(j) + front.get(j+1);
                curr.add(Math.min(down, diag));
            }
            front = curr;
        }
        return front.get(0);
    }
}
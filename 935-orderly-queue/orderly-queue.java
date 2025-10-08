class Solution {
    public String orderlyQueue(String s, int k) {
        // trick : if k > 1 we can swap any two chars to make the string sorted; any value
        // of k will result in a sorted string which is lexicographically smallest
        if(k == 1) {
            int n = s.length();
            String ans = s;
            for(int i=1;i<=n-1;i++) {
                String rotated = s.substring(i) + s.substring(0, i);
                if(rotated.compareTo(ans) < 0) {
                    ans = rotated;
                }
            }
            return ans;
        } else {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            return new String(ch);
        }
    }
}
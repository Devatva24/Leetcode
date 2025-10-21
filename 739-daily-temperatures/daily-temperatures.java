class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--) {
            int ele = temperatures[i];
            if(stack.isEmpty()) {
                stack.push(i);
                ans[i] = 0;
                continue;
            }
            while(!stack.isEmpty() && temperatures[stack.peek()] <= ele) {
                stack.pop();
            }
            if(!stack.isEmpty()) ans[i] = stack.peek() - i;
            else ans[i] = 0;
            stack.push(i);
        }
        return ans;
    }
}
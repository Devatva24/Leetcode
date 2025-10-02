class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<tokens.length;i++) {
            String s = tokens[i];
            if(stack.isEmpty()) {
                stack.push(Integer.parseInt(s));
            } else if(!stack.isEmpty() && s.equals("+")) {
                int ele1 = stack.pop();
                int ele2 = stack.pop();
                int ans = ele1 + ele2;
                stack.push(ans);
            } else if(!stack.isEmpty() && s.equals("*")) {
                int ele1 = stack.pop();
                int ele2 = stack.pop();
                int ans = ele1 * ele2;
                stack.push(ans);
            } else if(!stack.isEmpty() && s.equals("-")) {
                int ele1 = stack.pop();
                int ele2 = stack.pop();
                int ans = ele2 - ele1;
                stack.push(ans);
            } else if(!stack.isEmpty() && s.equals("/")) {
                int ele1 = stack.pop();
                int ele2 = stack.pop();
                int ans = ele2 / ele1;
                stack.push(ans);
            } else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
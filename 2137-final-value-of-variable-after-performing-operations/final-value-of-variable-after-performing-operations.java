class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for(String op : operations) {
            sum += (op.charAt(0) == '+' || op.charAt(op.length()-1) == '+') ? 1 : -1;
        }
        return sum;
    }
}
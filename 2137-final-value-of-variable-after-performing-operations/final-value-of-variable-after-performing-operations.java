class Solution {
    public int finalValueAfterOperations(String[] operations) {
        String preIncrement = "++X";
        String preDecrement = "--X";
        String postIncrement = "X++";
        String postDecrement = "X--";
        int sum = 0;
        for(int i=0;i<operations.length;i++) {
            if(operations[i].equals(postIncrement) || operations[i].equals(preIncrement)) sum+=1;
            else sum-=1;
        }
        return sum;
    }
}
class Solution {
    public int convertTime(String current, String correct) {
        String[] curr = current.split(":");
        String[] corr = correct.split(":");
        int hour = Integer.parseInt(corr[0]) - Integer.parseInt(curr[0]);
        int min = Integer.parseInt(corr[1]) - Integer.parseInt(curr[1]);
        int total = hour*60 + min;
        int sum = 0;
        if(total >= 60) {
            sum += total/60;
            total = total%60;
        }
        if(total >= 15) {
            sum += total/15;
            total = total%15;
        }
        if(total >= 5) {
            sum += total/5;
            total = total%5;
        }
        if(total >= 1) {
            sum += total/1;
            total = total%1;
        }
        return sum;
    }
}
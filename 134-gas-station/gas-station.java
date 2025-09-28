class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // int n = gas.length;
        // for(int i=0;i<n;i++) {
        //     int spare = 0;
        //     int index = i;
        //     while(true) {
        //         spare += (gas[index] - cost[index]);
        //         if(spare < 0) break;
        //         index = (index + 1) % n;
        //         if(index == i) return i;
        //     }
        // }
        // return -1;
        int start = 0;
        int tank = 0;
        int total = 0;
        int n = gas.length;
        for(int i=0;i<n;i++) {
            int diff = gas[i] - cost[i];
            total += diff;
            tank += diff;
            if(tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        return total >= 0 ? start : -1;
    }
}
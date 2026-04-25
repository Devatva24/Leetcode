class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0;
        int y = 0;
        int dir = 0;
        HashSet<String> set = new HashSet<>();
        for(int[] ob : obstacles) {
            set.add(ob[0] + "," + ob[1]);
        }
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int maxDist = 0;
        for(int cmd : commands) {
            if(cmd == -1) {
                dir = (dir + 1) % 4;
            } else if(cmd == -2) {
                dir = (dir + 3) % 4;
            } else {
                for(int step=0;step<cmd;step++) {
                    int nx = x + dirs[dir][0];
                    int ny = y + dirs[dir][1];
                    if(set.contains(nx + "," + ny)) break;
                    x = nx;
                    y = ny;
                    maxDist = Math.max(maxDist, x*x + y*y);
                }
            }
        }
        return maxDist;
    }
}
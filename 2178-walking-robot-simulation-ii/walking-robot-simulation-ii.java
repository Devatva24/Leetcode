class Robot {
    int w, h;
    int x, y;
    int dir;
    int perimeter;
    int[][] dirs = {
        {0, 1},
        {1, 0},
        {0, -1},
        {-1, 0}
    };
    public Robot(int width, int height) {
        w = width;
        h = height;
        x = 0;
        y = 0;
        dir = 1;
        perimeter = 2 * (w + h) - 4;
    }
    
    public void step(int num) {
        if (perimeter == 0) return;
        num %= perimeter;

        if (num == 0 && (x == 0 && y == 0)) {
        dir = 2; // South
        return;
        }

        for(int i=0;i<num;i++) {
            int nx = x + dirs[dir][0];
            int ny = y + dirs[dir][1];
            if(nx >= w || ny >= h || nx < 0 || ny < 0) {
                dir = (dir + 3 ) % 4;
                nx = x + dirs[dir][0];
                ny = y + dirs[dir][1];
            }
            x = nx;
            y = ny;
        }
    }
    
    public int[] getPos() {
        return new int[]{x, y};
    }
    
    public String getDir() {
        if(dir == 0) return "North";
        else if(dir == 1) return "East";
        else if(dir == 2) return "South";
        else return "West";
    }
}

/**
 * Your Robot object will be instantiated and called as such:
 * Robot obj = new Robot(width, height);
 * obj.step(num);
 * int[] param_2 = obj.getPos();
 * String param_3 = obj.getDir();
 */
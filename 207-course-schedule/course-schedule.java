class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // look for the cycle in directed graph
        // if present return false
        // if not present return true
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] row : prerequisites) {
            adj.get(row[0]).add(row[1]);
        }
        int[] vis = new int[numCourses];
        int[] path = new int[numCourses];
        for(int i=0;i<numCourses;i++) {
            if(vis[i] == 0) {
                if(!dfs(i, vis, path, adj)) return false;
            }
        }
        return true;
    }
    public boolean dfs(int node, int[] vis, int[] path, ArrayList<ArrayList<Integer>> adj) {
        vis[node] = 1;
        path[node] = 1;
        for(int ele : adj.get(node)) {
            if(vis[ele] == 0) {
                if(dfs(ele, vis, path, adj) == false) return false;
            } else if(path[ele] == 1) return false;
        }
        path[node] = 0;
        return true;
    }
}
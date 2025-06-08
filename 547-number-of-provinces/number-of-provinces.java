class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(isConnected.length);
        //to change adjacency matrix to list
        for(int i=0;i<isConnected.length;i++) {
            ArrayList<Integer> sublist = new ArrayList<>();
            list.add(sublist);
        }
        for(int i=0;i<isConnected.length;i++) {
            for(int j=0;j<isConnected.length;j++) {
                if(isConnected[i][j] == 1 && i!=j) {
                    list.get(i).add(j);
                    list.get(j).add(i);
                }
            }
        }
        boolean[] visited = new boolean[list.size()+1];
        int count = 0;
        for(int i=0;i<list.size();i++) {
            if(visited[i] == false) {
                count++; // count the visited
                depth(i, visited, list);
            }
        }
        return count;
    }
    public void depth(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj) {
        vis[node] = true;
        for(Integer it : adj.get(node)) {
            if(vis[it] == false) {
                depth(it, vis, adj);
            }
        }
    }
}
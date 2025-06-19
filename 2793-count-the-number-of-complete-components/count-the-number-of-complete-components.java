class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] row : edges) {
            adj.get(row[0]).add(row[1]);
            adj.get(row[1]).add(row[0]);
        }
        int count = 0;
        int[] vis = new int[n];
        for(int i=0;i<n;i++) {
            if(vis[i] == 0) {
                int[] node = new int[1]; // if we pass the integer here it would be pass by value hence the value won't get updated eventually therefore we need to pass the values in the array so that changes are reflected back
                int[] edge = new int[1];
                dfs(i, adj, vis, node, edge);
                edge[0] = edge[0]/2;
                if(edge[0] == (node[0]*(node[0]-1))/2) count++; // edges = (nodes)*(nodes-1)/2
            }
        }
        return count;
    }
    public void dfs(int ele, ArrayList<ArrayList<Integer>> adj, int[] vis, int[] node, int[] edges) {
        vis[ele] = 1;
        node[0]++;
        edges[0] += adj.get(ele).size();
        for(int element : adj.get(ele)) {
            if(vis[element] == 0) {
                dfs(element, adj, vis, node, edges);
            }
        }
    }
}
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V = graph.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<graph.length;i++) {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<graph.length;i++) {
            for(int j=0;j<graph[i].length;j++) {
                adj.get(i).add(graph[i][j]);
            }
        }
        ArrayList<ArrayList<Integer>> revAdj = new ArrayList<>(); // to store the reversed node of the graph
        for(int i=0;i<graph.length;i++) {
            revAdj.add(new ArrayList<>());
        }
        int[] indegree = new int[V]; // indegree calculation of the reversed graph = outdegree of the original graph
        for(int i=0;i<V;i++) {
            for(int ele : adj.get(i)) {
                revAdj.get(ele).add(i);
                indegree[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<V;i++) {
            if(indegree[i] == 0) q.add(i);
        }
        while(!q.isEmpty()) {
            int node = q.peek();
            q.poll();
            ans.add(node);
            for(int ele : revAdj.get(node)) {
                indegree[ele]--;
                if(indegree[ele] == 0) q.add(ele);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // Kahn Algorithm (DAG) topo sort using bfs
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++) adj.add(new ArrayList<>());
        for(int[] row : prerequisites) {
            adj.get(row[1]).add(row[0]);
        }
        int[] indegree = new int[numCourses];
        for(int i=0;i<numCourses;i++) {
            for(int ele : adj.get(i)) {
                indegree[ele]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++) {
            if(indegree[i] == 0) q.add(i);
        }
        int[] topo = new int[numCourses];
        int i=0;
        while(!q.isEmpty()) {
            int node = q.peek();
            q.poll();
            topo[i++] = node; // add the element to the answer
            for(int ele : adj.get(node)) {
                indegree[ele]--; // reduce the indegree after finding the element
                if(indegree[ele] == 0) q.add(ele);
            }
        }
        if(i != numCourses) return new int[0]; // if not all courses were processed; cycle detected return empty array
        return topo;
    }
}
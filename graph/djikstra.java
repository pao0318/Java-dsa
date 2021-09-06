import java.util.*;

class Solution {
    private static class VertexNode {
        private int node;
        private int dist;
        public VertexNode(int i, int d) {
            this.node = i;
            this.dist = d;
        }
    }
    private Map<Integer, List<int[]>> graph = new HashMap();
    private Set<Integer> visited = new HashSet();
    private PriorityQueue<VertexNode> minHeap =
        new PriorityQueue<>(Comparator.comparingInt(a -> a.dist));
    private int nodes;
    private static final int MAX_DIST = Integer.MAX_VALUE;
    public int solve(int[][] edges, int start, int end) {
        if (edges == null || edges.length == 0)
            return -1;
        if (start == end)
            return 0;
        Set<Integer> nodeSet = new HashSet<>();

        for (int[] edge : edges) {
            nodeSet.add(edge[0]);
            nodeSet.add(edge[1]);
            addEdge(edge[0], new int[] {edge[1], edge[2]});
        }
        nodes = nodeSet.size();
        int dist[] = new int[nodes + 1];
        Arrays.fill(dist, MAX_DIST);

        // init dijkstra
        minHeap.add(new VertexNode(start, 0));
        dist[start] = 0;

        // run dijkstra
        while (!minHeap.isEmpty()) {
            VertexNode vertexNode = minHeap.poll();
            int node = vertexNode.node;
            if (visited.contains(node))
                continue;
            ;

            visited.add(node);
            if (graph.containsKey(node)) {
                for (int[] adj : graph.get(node)) {
                    int adjVertex = adj[0];
                    int weight = adj[1];
                    if (!visited.contains(adjVertex) && dist[node] + weight < dist[adjVertex]) {
                        dist[adjVertex] = dist[node] + weight;
                        minHeap.offer(new VertexNode(adjVertex, dist[adjVertex]));
                    }
                }
            }
        }
        if (!visited.contains(end))
            return -1;
        return dist[end];
    }

    private void addEdge(int u, int[] adj) {
        List<int[]> adjList = graph.getOrDefault(u, new ArrayList());
        adjList.add(adj);
        graph.put(u, adjList);
    }
}

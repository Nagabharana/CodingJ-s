import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    private int V; // number of vertices
    private LinkedList<Integer> adj[]; // adjacency list

    // constructor
    BFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }

    // function to add an edge to the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // BFS traversal
    void BFS(int s) {
        // mark all vertices as not visited
        boolean visited[] = new boolean[V];

        // create a queue for BFS
        Queue<Integer> queue = new LinkedList<Integer>();

        // mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            // dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s + " ");

            // get all adjacent vertices of the dequeued vertex
            // if a adjacent has not been visited, then mark it visited and enqueue it
            for (Integer n : adj[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        BFS g = new BFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal (starting from vertex 2)");

        g.BFS(2);
    }
}

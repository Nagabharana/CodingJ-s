import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS {
    private List<List<Integer>> adjList;
    private boolean[] visited;

    public DFS(int numNodes) {
        adjList = new ArrayList<>();
        for (int i = 0; i < numNodes; i++) {
            adjList.add(new ArrayList<>());
        }
        visited = new boolean[numNodes];
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void dfs(int startNode) {
        Stack<Integer> stack = new Stack<>();
        stack.push(startNode);

        while (!stack.isEmpty()) {
            int currentNode = stack.pop();
            if (!visited[currentNode]) {
                System.out.print(currentNode + " ");
                visited[currentNode] = true;
                for (int neighbor : adjList.get(currentNode)) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        DFS dfs = new DFS(5);
        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);
        dfs.addEdge(1, 2);
        dfs.addEdge(2, 3);
        dfs.addEdge(3, 4);

        System.out.print("DFS starting from node 2: ");
        dfs.dfs(2);
    }
}

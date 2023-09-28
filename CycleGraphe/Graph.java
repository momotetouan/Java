import java.util.*;

class Graph {
    private int V;
    private List<List<Integer>> adj;

    public Graph(int V) {
        this.V = V;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; ++i)
            adj.add(new LinkedList<>());
    }

    public void addEdge(int v, int w) {
        adj.get(v).add(w);
        adj.get(w).add(v);
    }

    private boolean isCyclicUtil(int v, boolean[] visited, int parent) {
        visited[v] = true;
        for (Integer i : adj.get(v)) {
            if (!visited[i]) {
                if (isCyclicUtil(i, visited, v))
                    return true;
            } else if (i != parent) {
                return true;
            }
        }
        return false;
    }

    public boolean isCyclic() {
        boolean[] visited = new boolean[V];
        Arrays.fill(visited, false);

        for (int i = 0; i < V; ++i) {
            if (!visited[i]) {
                if (isCyclicUtil(i, visited, -1))
                    return true;
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(3, 4);

        if (g.isCyclic())
            System.out.println("Le graphe contient un cycle.");
        else
            System.out.println("Le graphe ne contient pas de cycle.");
    }
}

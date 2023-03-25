import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class TraversalTechnique {
    public static void main(String[] args) {
        adjecencyList();

    }

    private static List<Integer> BFS(int V, List<List<Integer>> adj) {
        List<Integer> bfs = new ArrayList<>();
        boolean visited[] = new boolean[V + 1];

        Queue<Integer> q = new LinkedList<>();

        q.add(1);

        // visited[1] = true;

        while (!q.isEmpty()) {
            int ele = q.poll();

            for (Integer x : adj.get(ele)) {
                if (!visited[x]) {
                    visited[x] = true;
                    q.add(x);
                    bfs.add(x);

                }

            }
        }
        return bfs;
    }

    private static void DFS(int V, List<List<Integer>> adj, boolean visited[], List<Integer> dfsEle) {
        visited[V] = true;
        dfsEle.add(V);

        for (Integer ele : adj.get(V)) {
            if (!visited[ele])
                DFS(ele, adj, visited, dfsEle);
        }
        return;
    }

    private static List<Integer> calledDFSTraversal(int V, List<List<Integer>> adj) {
        boolean visited[] = new boolean[V + 1];

        List<Integer> dfsEle = new ArrayList<>();

        DFS(1, adj, visited, dfsEle);

        return dfsEle;
    }

    public static void adjL(List<List<Integer>> e, int u, int v) {
        e.get(u).add(v);
        e.get(v).add(u);
    }

    public static void adjecencyList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list");
        int x = sc.nextInt();
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 1; i <= x + 1; i++) {
            adjList.add(new ArrayList<>());
        }
        adjL(adjList, 1, 2);
        adjL(adjList, 1, 3);
        adjL(adjList, 2, 4);
        adjL(adjList, 2, 5);
        adjL(adjList, 4, 8);
        adjL(adjList, 3, 6);
        adjL(adjList, 3, 7);
        sc.close();

        System.out.print("Element of BFS Traversal: ");
        List<Integer> bfs = BFS(x, adjList);

        for (Integer ele : bfs) {
            System.out.print(ele + " ");
        }
        System.out.println();

        System.out.print("Element of DFS Traversal: ");
        List<Integer> dfs = calledDFSTraversal(x, adjList);

        for (Integer ele : dfs) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

}

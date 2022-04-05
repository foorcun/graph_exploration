package org.example;

import org.example.entities.GraphGFG;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


        // Driver method to
//        public static void main(String args[])
//        {
        GraphGFG g = new GraphGFG(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal " +
                "(starting from vertex 2)");

        g.BFS(2);
//        }
    }
}

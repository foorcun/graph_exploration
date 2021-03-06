package org.example.entities;
// Java program to print BFS traversal from a given source vertex.
// BFS(int s) traverses vertices reachable from s.

import java.io.*;
import java.util.*;

// This class represents a directed graph using adjacency list
// representation

//link : https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
    //link : https://www.youtube.com/watch?v=0u78hx-66Xk&list=PLqM7alHXFySEaZgcg7uRYJFBnYMLti-nh&index=2
// GFG - geeks for geeks
// G = ( V, E )
public class GraphGFG { // G.
    public int V; // V. //Quantity of nodes
    public LinkedList<Integer> adj[]; // E. //Adjacency Lists (array of Linked List ) // aslinda bu Edge list olarak dusunulebilir

    // Constructor
    public GraphGFG(int v) {
        V = v; // vertex amount of the graph
        adj = new LinkedList[v]; // graph = array of linked list. burda node sayisi kadar linked list olusturuyor.
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    public void addEdge(int v, int w) { // linked list add i yapiyor
        adj[v].add(w);
    }

    // prints BFS traversal from a given source s
    public void BFS(int s) {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[V];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s + " ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

//        // Driver method to
//        public static void main(String args[])
//        {
//            GraphGFG g = new GraphGFG(4);
//
//            g.addEdge(0, 1);
//            g.addEdge(0, 2);
//            g.addEdge(1, 2);
//            g.addEdge(2, 0);
//            g.addEdge(2, 3);
//            g.addEdge(3, 3);
//
//            System.out.println("Following is Breadth First Traversal "+
//                    "(starting from vertex 2)");
//
//            g.BFS(2);
//        }
}
// This code is contributed by Aakash Hasija



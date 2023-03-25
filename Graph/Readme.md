# Souce-to-Destination-Path-Existed

This is a Java program that determines whether a path exists between a source node and a destination node in an undirected graph.

## Input

The program takes the following inputs:

- Integer `n`: the number of nodes in the graph.
- Two-dimensional `edges` array: represents the edges between the nodes in the graph.
- Integer `source`: the source node.
- Integer `destination`: the destination node.

## Output

The program returns a boolean value indicating whether a path exists between the source and destination nodes.

## Implementation

The program works by creating an adjacency list of the graph, and then performing a Breadth-First Search (BFS) on the graph starting from the source node. During the BFS, if the destination node is reached, the program returns true, indicating that a path exists. If the BFS is completed without reaching the destination node, the program returns false.

## Example Usage

```java
int n = 4;
int[][] edges = {{0,1},{1,2},{2,3}};
int source = 0;
int destination = 3;

Souce_to_Destination_Path_Existed pathExisted = new Souce_to_Destination_Path_Existed();
boolean isPathExisted = pathExisted.validPath(n, edges, source, destination);

if (isPathExisted) {
    System.out.println("A path exists between source and destination!");
} else {
    System.out.println("No path exists between source and destination.");
}
```

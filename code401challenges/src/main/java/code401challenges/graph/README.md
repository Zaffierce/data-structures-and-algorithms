# Graphs

### This package contains the following methods
* addNode(T value) - Adds a single node to your graph.
* addEdge(Node T node1, Node T node2, int weight) - Connects two nodes together inside your graph.
* getNeighbors(Node T node) - Returns all of the connected nodes in your graph.

---

# BreadthFirst Traversal on a Graph

### Challenge
Traverse through a graph using breadthFirst

### API
breadthFirst(Node T) - Traverses through a graph using a breadthFirst approach.  Node can be any chosen node.

Input:
```
        3 ----- 5
       / \-4-6-/ \-42
      1   |        |
          12-------10 
```

Output:  4,5,6,42,10,12,3,1

### Approach
Approach was to add to a Queue & Set at the same time, provided that the Set does not contain the current value.  Repeat until the node is empty.

### Solution
![](../../../../../../assets/breadthFirstGraph.jpg)
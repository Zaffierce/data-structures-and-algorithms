package code401challenges.tree;

//Used the source from Baeldung implementing a BST.
//https://www.baeldung.com/java-binary-tree

public class BinarySearchTree {
    Node root;

    public void add(int value){
        root = addRecursive(root, value);
    }

    public Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    public boolean containsRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        if (value < current.value) {
           return containsRecursive(current.left, value);
        } else {
            return containsRecursive(current.right, value);
        }
    }

    public boolean contains(int value) {
       return containsRecursive(root, value);
    }

}

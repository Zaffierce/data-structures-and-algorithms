package code401challenges.tree;

public class Tree {
    /*
    TODO:  Convert these from voids to return arrays and implement tests.
     */

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println(" "+node.value);
            inOrder(node.right);
        }
    }

    public void preOrder(Node node) {
        if (node != null) {
            System.out.println(" "+node.value);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(" "+node.value);
        }
    }

//    public int[] inOrderArr(Node node) {
//        int[] orderedArr = new int[]
//        if (node != null) {
//            inOrder(node.left);
//            System.out.println(" "+node.value);
//            inOrder(node.right);
//        }
//        return
//    }
}

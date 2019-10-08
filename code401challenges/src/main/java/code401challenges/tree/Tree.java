package code401challenges.tree;

import java.util.LinkedList;
import java.util.List;

public class Tree {
    Node root;

    //other people can call tree.inOrder() to inorder traverse the tree
    public Integer[] inOrder() {
        // we secretly translate that to our nice recursive method
        return this.inOrder(this.root).toArray(new Integer[0]);
    }

    public Integer[] preOrder() {
        return this.preOrder(this.root).toArray(new Integer[0]);
    }

    public Integer[] postOrder() {
        return this.postOrder(this.root).toArray(new Integer[0]);
    }

    private List<Integer> inOrder(Node node) {
        List<Integer> answer = new LinkedList<>();
        if (node != null) {
            answer.addAll(inOrder(node.left));
            answer.add(node.value);
            answer.addAll(inOrder(node.right));
        }
        return answer;
    }

    private List<Integer> preOrder(Node node) {
        List<Integer> answer = new LinkedList<>();
        if (node != null) {
            answer.add(node.value);
            answer.addAll(preOrder(node.left));
            answer.addAll(preOrder(node.right));
        }
        return answer;
    }

    private List<Integer> postOrder(Node node) {
        List<Integer> answer = new LinkedList<>();
        if (node != null) {
            answer.addAll(postOrder(node.left));
            answer.addAll(postOrder(node.right));
            answer.add(node.value);
        }
        return answer;
    }

}

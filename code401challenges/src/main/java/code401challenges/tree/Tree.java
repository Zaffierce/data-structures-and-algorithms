package code401challenges.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tree {
    public Node root;

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

    public List<Integer> breadthFirst() { return this.breadthFirst(this.root); }

    public int findMaximumValue() { return this.findMaximumValue(this.root); }

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

    public List<Integer> breadthFirst(Node node) {
        Queue<Node> queue = new LinkedList<>();
        List<Integer> answer = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            Node temp = queue.poll();
            answer.add(temp.value);
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
        return answer;
    }

//    public void breadthFirst() {
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(root);
//        while(!queue.isEmpty()) {
//            Node temp = queue.poll();
//            System.out.println(temp.value);
//            if (temp.left != null) {
//                queue.add(temp.left);
//            }
//            if (temp.right != null) {
//                queue.add(temp.right);
//            }
//        }
//    }

//

    private static int findMaximumValue(Node root) {
        int max = Integer.MIN_VALUE;
        int value = 0;
        int left, right;

        if (root != null) {
            value = root.value;
            left = findMaximumValue(root.left);
            right = findMaximumValue(root.right);

            if (left > right) {
                max = left;
            } else {
                max = right;
            }
            if (max < value) {
                max = value;
            }
        }
        return max;
    }

}

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

//    public int findMaximumValue() { return this.findMaximumValue(this.root); }

    public Integer findMaxWeird() { return this.findMax_weird(this.root); }

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

    public Boolean compare(Node root1, Node root2) {
        if (countLeaves(root1) != countLeaves(root2)) {
            return false;
        } else {
            return true;
        }
    }

    public int countLeaves(Node root) {
        if (root == null) {
            return 0;
        }
        else if (root.left == null && root.right == null) {
            return 1;
        } else {
            return countLeaves(root.left) + countLeaves(root.right);
        }
    }

//    public int sum(Node<Integer> root) {
//        if (root == null) {
//            return 0;
//        }
//        return sum(root.left) + sum(root.right) + root.value;
//    }





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

    public int findMax_weird(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.value, Math.max(findMax_weird(root.left), findMax_weird(root.right)));
    }

//    public int findMax(Node<Integer> root) {
//        int answer = root.value;
//        if (root.left != null) {
////            Math.max finds
////            answer = Math.max(answer, findMax(root.left));
//            int leftSubtreeMax = findMax(root.left);
//            if (leftSubtreeMax > answer) {
//                answer = leftSubtreeMax;
//            }
//        }
//        if (root.right != null) {
//            int rightSubtreeMax = findMax(root.right);
//            if (rightSubtreeMax > answer) {
////            Math.max finds the largest value?
////            answer = Math.max(answer, findMax(root.right));
//                answer = rightSubtreeMax;
//            }
//        }
//        return answer;
//    }

//    private static int findMaximumValue(Node root) {
//        int max = Integer.MIN_VALUE;
//        int value = 0;
//        int left, right;
//
//        if (root != null) {
//            value = root.value;
//            left = findMaximumValue(root.left);
//            right = findMaximumValue(root.right);
//
//            if (left > right) {
//                max = left;
//            } else {
//                max = right;
//            }
//            if (max < value) {
//                max = value;
//            }
//        }
//        return max;
//    }

//    public int findMax(Node<Integer> root) {
//        if (root == null) {
//            throw new IllegalArgumentException("Empty Node");
//        }
//        Queue<Node<Integer>> nodesToProcess = new LinkedList<>();
//        int max = root.value;
//        nodesToProcess.add(root);
//        while(!nodesToProcess.isEmpty()) {
//            Node<Integer> currentNode = nodesToProcess.remove();
//            if (currentNode.value > max) {
//                max = currentNode.value;
//            }
//            if (currentNode.left != null) {
//                nodesToProcess.add(currentNode.left);
//            }
//            if (currentNode.right != null) {
//                nodesToProcess.add(currentNode.right);
//            }
//        }
//        return max;
//    }

}

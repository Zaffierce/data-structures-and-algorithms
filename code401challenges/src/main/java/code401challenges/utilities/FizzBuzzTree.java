package code401challenges.utilities;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzzTree {


    static class Node {
        String value;
        Node left;
        Node right;

        public Node(String value) {
            this.value = value;
            left = null;
            right = null;
        }

        public Node(String value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    Node root;

    public void add(String value){
        root = addRecursive(root, value);
    }

    public Node addRecursive(Node current, String value) {
//        if (current == null) {
//            return new Node(value);
//        } else {
            int result = Integer.parseInt(value);
            if (result % 3 == 0 && result % 5 == 0) {
                current.value = "FizzBuzz";
//                System.out.println("3 & 5");
            } else if (result % 5 == 0) {
                current.value = "Buzz";
//                System.out.println("5");
            } else if (result % 3 == 0) {
                current.value = "Fizz";
//                System.out.println("3");
            }
                return current;

//        }
//        return current;
    }

    public String[] preOrder() { return this.preOrder(this.root).toArray(new String[0]);}

    private List<String> preOrder(Node node) {
        List<String> answer = new LinkedList<>();
        if (node != null) {
            answer.add(node.value);
            answer.addAll(preOrder(node.left));
            answer.addAll(preOrder(node.right));
        }
        return answer;
    }
}

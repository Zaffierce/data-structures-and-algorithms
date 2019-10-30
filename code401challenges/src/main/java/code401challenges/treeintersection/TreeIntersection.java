//package code401challenges.treeintersection;
//
//import code401challenges.stacksandqueues.Stack;
//import code401challenges.tree.Node;
//import code401challenges.tree.Tree;
//
//public class TreeIntersection {
//
//    public Stack<Node> TreeIntersection(Node tree1, Node tree2) throws Exception {
//
//    Stack<Node> stack1 = new Stack<>();
//    Stack<Node> stack2 = new Stack<>();
//    Stack<Node> stack3 = new Stack<>();
//
//    while (tree1 != null && tree2 != null) {
//        if (tree1 != null) {
//            stack1.push(tree1.left);
//            stack1.push(tree1.right);
//            tree1 = tree1.left;
//        }
//        if (tree2 != null) {
//            stack2.push(tree2.left);
//            stack2.push(tree2.right);
//            tree2 = tree2.left;
//        }
//    }
//    Node key = stack1.peek();
//        System.out.println(key);
//
//    return stack3;
//    }
//
//    public static void main(String[] args) throws Exception {
//        Tree tree1 = new Tree();
//        Node tree1childTwo = new Node(5, new Node(2), null);
//        Node tree1childOne = new Node(3, new Node(9), new Node(12));
//        Node tree1rootNode = new Node(1, tree1childOne, tree1childTwo);
//        tree1.root = tree1rootNode;
//
//
//        Tree tree2 = new Tree();
//        Node tree2childTwo = new Node(7, new Node(2), null);
//        Node tree2childOne = new Node(10, new Node(9), new Node(12));
//        Node tree2rootNode = new Node(20, tree2childOne, tree2childTwo);
//        tree2.root = tree2rootNode;
//
//        TreeIntersection treeIntersection = new TreeIntersection();
//
//        //Hmm.
//        treeIntersection.TreeIntersection(tree1, tree2);
//    }
//}

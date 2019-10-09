//package code401challenges.utilities;
//
//import code401challenges.tree.Node;
//import code401challenges.tree.Tree;
//
////Set Node and Tree to string.... or genetic things.
////Import our tree
//public class FizzBuzzTree2 {
//
//    public static Tree fizzbuzzer (Tree oldTree) {
//        changer(oldTree.root);
//        return oldTree;
//    }
//
//    private static void changer(Node node) {
//        if (node == null) return;
//
//        //in order pre order post order
//        //in order;  lowest to highest or left middle right
//
//        //write your traversal before you write the dynamic part, the challenge you are trying to solve
//        changer(node.left);
//        //do something
//        int num = Integer.parseInt(node.getData());
//        if (num % 5 == 0 && num % 3 == 0) {
//            node.setData("FizzBuzz");
//        } else if (num % 5 == 0) {
//            node.setData("Buzz");
//        } else if (num % 3 == 0) {
//            node.setData("Fizz");
//        }
//        changer(node.right);
//    }
//
//}

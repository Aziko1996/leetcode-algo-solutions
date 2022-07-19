package datastructures.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

    /*public static void main( String[] args ) {
        Node<Character> a = new Node<>('a');
        Node<Character> b = new Node<>('b');
        Node<Character> c = new Node<>('c');
        Node<Character> d = new Node<>('d');
        Node<Character> e = new Node<>('e');
        Node<Character> f = new Node<>('f');
        Node<Character> n = new Node<>('n');
        a.leftNode = b;
        a.rightNode = c;
        b.leftNode = d;
        b.rightNode = e;
        c.rightNode = f;

        // depthFirstTraversal(a);
        // recursiveTraversal(a);
        // breathFirstTraversal(a);
        System.out.println();
        System.out.println(findElementUsingRecursiveTraversal(a, e));
        //System.out.println(findElementUsingBreathFirstTraversal(a,f));
        //System.out.println(findElementUsingDepthFirstTraversal(a,f));
        System.out.println();

        Node<Integer> one = new Node<>(1);
        Node<Integer> two = new Node<>(2);
        Node<Integer> three = new Node<>(3);
        Node<Integer> four = new Node<>(4);
        Node<Integer> five = new Node<>(5);
        Node<Integer> six = new Node<>(6);
        Node<Integer> seven = new Node<>(7);
        Node<Integer> zero = new Node<>(0);
        one.leftNode = two;
        one.rightNode = three;
        three.leftNode = four;
        three.rightNode = five;
        five.leftNode = six;
        five.rightNode = seven;
        seven.leftNode = zero;

        System.out.println(sumAllNodesUsingDepthFirstTraversal(one));
        System.out.println(sumAllNodesUsingRecursion(one));
        System.out.println(sumAllNodesUsingBreathFirstTraversal(one));
        System.out.println(minimumValueUsingDepthFirstTraversal(one));
        System.out.println(minimumValueUsingBreathFirstTraversal(one));

        System.out.println(maxPathSum(one));
    } */

    public static void depthFirstTraversal(Node<Character> root) {
        if (root == null) return;
        Stack<Node<Character>> stack = new Stack<>();
        stack.push(root);
        while (stack.size() > 0) {
            Node<Character> currentNode = stack.pop();
            System.out.print(currentNode.value + " ");
            if (currentNode.leftNode != null) stack.push(currentNode.leftNode);
            if (currentNode.rightNode != null) stack.push(currentNode.rightNode);
        }
    }

    public static void recursiveTraversal(Node<Character> root) {
        if (root == null) return;
        System.out.print(root.value + " ");
        recursiveTraversal(root.rightNode);
        recursiveTraversal(root.leftNode);
    }

    public static void breathFirstTraversal(Node<Character> root) {
        if (root == null) return;
        Queue<Node<Character>> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() > 0) {
            Node<Character> currentNode = queue.remove();
            System.out.print(currentNode.value + " ");
            if (currentNode.leftNode != null) queue.add(currentNode.leftNode);
            if (currentNode.rightNode != null) queue.add(currentNode.rightNode);
        }
    }

    public static boolean findElementUsingDepthFirstTraversal(Node<Character> root, Node<Character> target) {
        if (root == null) return false;
        Stack<Node<Character>> stack = new Stack<>();
        stack.push(root);
        while (stack.size() > 0) {
            Node<Character> currentNode = stack.pop();
            if (currentNode == target) return true;
            if (currentNode.leftNode != null) stack.push(currentNode.leftNode);
            if (currentNode.rightNode != null) stack.push(currentNode.rightNode);
        }
        return false;
    }

    public static boolean findElementUsingBreathFirstTraversal(Node<Character> root, Node<Character> target) {
        if (root == null) return false;
        Queue<Node<Character>> queue = new LinkedList<>();
        queue.add(root);
        while (queue.size() > 0) {
            Node<Character> currentNode = queue.remove();
            if (currentNode == target) return true;
            if (currentNode.leftNode != null) queue.add(currentNode.leftNode);
            if(currentNode.rightNode != null) queue.add(currentNode.rightNode);
        }
        return false;
    }

    public static boolean findElementUsingRecursiveTraversal(Node<Character> root, Node<Character> target) {
        if (root == null) return false;
        if (root == target) return true;
        return findElementUsingRecursiveTraversal(root.leftNode, target) || findElementUsingRecursiveTraversal(root.rightNode, target);
    }

    public static int sumAllNodesUsingDepthFirstTraversal(Node<Integer> root) {
        if (root == null) return 0;
        Stack<Node<Integer>> stack = new Stack<>();
        int result = 0;
        stack.push(root);
        while (stack.size() > 0) {
            Node<Integer> currentNode = stack.pop();
            result += currentNode.value;
            if (currentNode.leftNode != null) stack.push(currentNode.leftNode);
            if (currentNode.rightNode != null) stack.push(currentNode.rightNode);
        }
        return result;
    }

    public static int sumAllNodesUsingBreathFirstTraversal(Node<Integer> root) {
        if (root == null) return 0;
        Queue<Node<Integer>> queue = new LinkedList<>();
        int result = 0;
        queue.add(root);
        while (queue.size() > 0) {
            Node<Integer> currentNode = queue.remove();
            result += currentNode.value;
            if (currentNode.leftNode != null) queue.add(currentNode.leftNode);
            if (currentNode.rightNode != null) queue.add(currentNode.rightNode);
        }
        return result;
    }

    public static int sumAllNodesUsingRecursion(Node<Integer> root) {
        if (root == null) return 0;
        return root.value + sumAllNodesUsingRecursion(root.leftNode) + sumAllNodesUsingRecursion(root.rightNode);
    }

    public static int minimumValueUsingDepthFirstTraversal(Node<Integer> root) {
        if (root == null) return 0;
        Stack<Node<Integer>> stack = new Stack<>();
        int result = root.value;
        stack.push(root);
        while (stack.size() > 0) {
            Node<Integer> currentNode = stack.pop();
            if (currentNode.value < result) {
                result = currentNode.value;
            }
            if (currentNode.leftNode != null) stack.push(currentNode.leftNode);
            if (currentNode.rightNode != null) stack.push(currentNode.rightNode);
        }
        return result;
    }

    public static int minimumValueUsingBreathFirstTraversal(Node<Integer> root) {
        if (root == null) return 0;
        Queue<Node<Integer>> queue = new LinkedList<>();
        int result = root.value;
        queue.add(root);
        while (queue.size() > 0) {
            Node<Integer> currentNode = queue.remove();
            if (currentNode.value < result) {
                result = currentNode.value;
            }
            if (currentNode.leftNode != null) queue.add(currentNode.leftNode);
            if (currentNode.rightNode != null) queue.add(currentNode.rightNode);
        }
        return result;
    }

    public static int maxPathSum(Node<Integer> root) {
        if (root == null) return 0;
        if (root.leftNode == null && root.rightNode == null) return root.value;
        int result =  Math.max(maxPathSum(root.leftNode), maxPathSum(root.rightNode));
        return root.value + result;
    }




}

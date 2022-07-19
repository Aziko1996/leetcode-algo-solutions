package datastructures.linkedlist;

public class LinkedList {

    /*public static void main(String[] args) {
        Node<Character> a = new Node<>('A');
        Node<Character> b = new Node<>('B');
        Node<Character> c = new Node<>('C');
        Node<Character> d = new Node<>('D');

        a.nextNode = b;
        b.nextNode = c;
        c.nextNode = d;

        iterateLinkedList(a);
        System.out.println();
        printLinkedListRecursively(a);
        System.out.println();

        Node<Integer> one = new Node<>(1);
        Node<Integer> two = new Node<>(2);
        Node<Integer> three = new Node<>(3);
        Node<Integer> four = new Node<>(4);
        Node<Integer> five = new Node<>(5);

        one.nextNode = two;
        two.nextNode = three;
        three.nextNode = four;

        System.out.println(sumLinkedListNodeElements(one));
        System.out.println(sumLinkedListNodeElementsRecursively(one));
        System.out.println(findElementInLinkedList(one, five));
        System.out.println(findElementInLinkedListRecursively(one, five));
        System.out.println(getNodeElementAtSpecifiedIndex(a, 1));
        System.out.println(getNodeElementAtSpecifiedIndexRecursively(a,1));
        reverseLinkedList(a);
        iterateLinkedList(d);
        System.out.println();
    }*/

    public static void iterateLinkedList(Node<Character> head) {
        Node<Character> currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.nextNode;
        }
    }

    public static void printLinkedListRecursively(Node<Character> head) {
        if (head == null) return;
        System.out.print(head.value + " ");
        printLinkedListRecursively(head.nextNode);
    }

    public static int sumLinkedListNodeElements(Node<Integer> head) {
        Node<Integer> currentNode = head;
        int result = 0;
        while (currentNode != null) {
            result += currentNode.value;
            currentNode = currentNode.nextNode;
        }
        return result;
    }

    public static int sumLinkedListNodeElementsRecursively(Node<Integer> head) {
        if (head == null) return 0;
        return head.value + sumLinkedListNodeElementsRecursively( head.nextNode);
    }

    public static boolean findElementInLinkedList(Node<Integer> head, Node<Integer> target) {
        Node<Integer> currentNode = head;
        if (currentNode == null) return false;
        while (currentNode != null) {
            if (currentNode == target) return true;
            currentNode = currentNode.nextNode;
        }
        return false;
    }

    public static boolean findElementInLinkedListRecursively(Node<Integer> head, Node<Integer> target) {
        if (head == null) return false;
        if (head == target) return true;
        return findElementInLinkedListRecursively(head.nextNode, target);
    }

    public static Character getNodeElementAtSpecifiedIndex(Node<Character> head, int index) {
        int counter = 0;
        Node<Character> currentNode = head;
        if (currentNode == null) return null;
        if (index == 0) return currentNode.value;
        while (currentNode != null) {
            currentNode = currentNode.nextNode;
            counter++;
            if (counter == index) return currentNode.value;
        }
        return null;
    }

    public static Character getNodeElementAtSpecifiedIndexRecursively(Node<Character> head, int index) {
        if (head == null) return null;
        if (index == 0) return head.value;
        return getNodeElementAtSpecifiedIndexRecursively(head.nextNode, index - 1);
    }

    public static void reverseLinkedList(Node<Character> head) {
        if (head == null) return;
        Node<Character> currentNode = head;
        Node<Character> previousNode = null;
        while (currentNode != null) {
           Node<Character> next = currentNode.nextNode;
           currentNode.nextNode = previousNode;
           previousNode = currentNode;
           currentNode = next;
        }
    }
}

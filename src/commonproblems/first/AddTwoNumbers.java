package commonproblems.first;

public class AddTwoNumbers {

    /*public static void main(String[] args) {
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        ListNode seven = new ListNode(9);

        ListNode eight = new ListNode(8);
        ListNode nine = new ListNode(9);
        ListNode four = new ListNode(4);

        five.next = six;
        six.next = seven;

        eight.next = nine;
        nine.next = four;

        ListNode resultHeadNode = addTwoNumbers(five, eight);

        while (resultHeadNode != null) {
            System.out.print(resultHeadNode.value + " ");
            resultHeadNode = resultHeadNode.next;
        }
        System.out.println();
    }*/

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode firstHead = l1;
        ListNode secondHead = l2;
        int carrier = 0;
        ListNode dummyNode = new ListNode(-1);
        ListNode tempNode = dummyNode;

        while (firstHead != null || secondHead != null) {
            int firstHeadValue, secondHeadValue;
            if (firstHead == null) firstHeadValue = 0;
            else firstHeadValue = firstHead.value;
            if (secondHead == null) secondHeadValue = 0;
            else secondHeadValue = secondHead.value;
            ListNode currentNode = new ListNode((firstHeadValue + secondHeadValue + carrier) % 10);
            carrier = (firstHeadValue + secondHeadValue + carrier) / 10;
            tempNode.next = currentNode;
            tempNode = tempNode.next;
            if (firstHead != null) firstHead = firstHead.next;
            if (secondHead != null) secondHead = secondHead.next;
        }

        if (carrier == 1) {
            tempNode.next = new ListNode(1);
            tempNode = tempNode.next;
        }
        tempNode.next = null;
        return dummyNode.next;
    }

    static class ListNode {
        int value;
        ListNode next;

        public ListNode() {

        }

        public ListNode( int value ) {
            this.value = value;
        }

        public ListNode( int value, ListNode next ) {
            this.value = value;
            this.next = next;
        }
    }
}

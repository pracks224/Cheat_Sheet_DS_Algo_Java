package LinkedList;

public class CheckPalindrome {
    public static void main(String[] args) {
        ListNode node1 = new ListNode("a");
        ListNode node2 = new ListNode("b");
        ListNode node3 = new ListNode("c");
        ListNode node4 = new ListNode("c");
        ListNode node5 = new ListNode("d");
        ListNode node6 = new ListNode("b");
        ListNode node7 = new ListNode("a");
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = null;
        System.out.println(isPalindrome(node1));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            slow = slow.next;
            slow = reverseList(slow);
        }
        while (slow != null) {
            if (slow.val != head.val)
                return false;
            slow = slow.next;
            head = head.next;
        }

        return true;
    }

    private static  ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}

class ListNode {
    String val;
    ListNode next;

    ListNode(String val) {
        this.val = val;
    }
}


package com.np.practice.leetcode206;

import com.np.practice.ListNode;

public class ReverseLinkList {

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next=new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next=new ListNode(2);
        list2.next.next = new ListNode(3);
        list2.next.next.next = new ListNode(4);

        ListNode.printNode(reverseListRecursively(list));
        System.out.println();
        ListNode.printNode(reverseList(list2));

    }

    public static ListNode reverseListRecursively(ListNode head) {
        if(head ==null || head.next == null){
            return head;
        }
        ListNode newHead = reverseListRecursively(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return head;
    }
}

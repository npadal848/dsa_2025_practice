package com.np.practice.leetcode21;

import com.np.practice.ListNode;

public class MergeTwoSortedLinkedList {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next=new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next=new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode result = mergeTwoLists(list1, list2);
        printNode(result);
    }

    private static void printNode(ListNode result) {
        ListNode temp = result;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        ListNode t1=list1;
        ListNode t2=list2;

        while(t1 != null && t2 != null){
            if(t1.val <= t2.val){
                temp.next = t1;
                t1 = t1.next;

            }else{
                temp.next = t2;
                t2 = t2.next;

            }
            temp = temp.next;
        }

        if(t1 != null){
            temp.next = t1;
        }

        if(t2 != null){
            temp.next = t2;
        }
        return head.next;
    }
}

package com.np.practice;

//Definition for singly-linked list.
public class ListNode {
      public int val;
      public ListNode next;
      public ListNode() {}
      public ListNode(int val) { this.val = val; }
      public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static void printNode(ListNode node) {
        ListNode temp = node;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
 }

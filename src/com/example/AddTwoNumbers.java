package com.example;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int prev = 0;
        ListNode result = null;
        ListNode listHead = null;

        while(l1 != null || l2 != null || prev == 1) {

            int number1 = 0;
            int number2 = 0;

            if(l1 != null) {
                number1 = l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                number2 = l2.val;
                l2 = l2.next;
            }

            int sum = number1 + number2 + prev;

            if(sum >= 10) {
                sum = sum % 10;
                prev = 1;
            }
            else {
                prev = 0;
            }

            if(result == null) {
                result = new ListNode(sum);
                listHead = result;
            }
            else {
                ListNode newNode = new ListNode(sum);
                result.next = newNode;
                result = newNode;
            }
        }


        return listHead;
    }

}

 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }
package br.com.ricas.exercises;

import br.com.ricas.exercises.model.ListNode;

/*
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
* */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode l3 = result;
        int carry = 0;
        while (l1 != null || l2 != null) {

            int l1_val = (l1 != null) ? l1.val : 0;
            int l2_val = (l2 != null) ? l2.val : 0;

            int sum = l1_val + l2_val + carry;
            carry = sum / 10;

            int value = sum % 10;

            l3.next = new ListNode(value);

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

            l3 = l3.next;
        }

        if (carry > 0) {
            ListNode node = new ListNode(l3.next.val);
            l3.next = node;
            l3 = l3.next;
        }

        return result.next;
    }
}


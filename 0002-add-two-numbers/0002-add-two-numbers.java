/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode currNode = new ListNode(0);
        ListNode head = currNode;
        boolean carryOver = false;
        while (l1 != null && l2 != null){
            int sum = l1.val + l2.val;
            if (carryOver){
                sum++;
                carryOver = false;
            }
            if (sum > 9){
                carryOver = true;
            }
            currNode.next = new ListNode(sum % 10);
            currNode = currNode.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null){
            if (carryOver) {
                int sum = l1.val + 1;
                if (sum < 10){
                    carryOver = false;
                }
                currNode.next = new ListNode(sum%10);
                currNode = currNode.next;
            }
            else {
                currNode.next = l1;
                break;
            }
            l1 = l1.next;
        }
        while (l2 != null){
            if (carryOver) {
                int sum = l2.val + 1;
                if (sum < 10){
                    carryOver = false;
                }
                currNode.next = new ListNode(sum%10);
                currNode = currNode.next;
            }
            else {
                currNode.next = l2;
                break;
            }
            l2 = l2.next;
        }
        if (carryOver)
        {
            currNode.next = new ListNode(1);
            currNode = currNode.next;
        }     
        return head.next;
    }
}


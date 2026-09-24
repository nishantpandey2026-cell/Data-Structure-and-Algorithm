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
        ListNode temp1=l1;
        ListNode temp2=l2;
        int carry=0;
        return helper(temp1,temp2,carry);

        
    }
   ListNode helper(ListNode temp1, ListNode temp2, int carry) {

    if (temp1 == null && temp2 == null) {
        if (carry != 0) {
            return new ListNode(carry);
        }
        return null;
    }

    int val1 = (temp1 != null) ? temp1.val : 0;
    int val2 = (temp2 != null) ? temp2.val : 0;

    int sum = val1 + val2 + carry;

    int digit = sum % 10;
    carry = sum / 10;

    ListNode l = new ListNode(digit);

    ListNode next1 = (temp1 != null) ? temp1.next : null;
    ListNode next2 = (temp2 != null) ? temp2.next : null;

    l.next = helper(next1, next2, carry);

    return l;
}

}
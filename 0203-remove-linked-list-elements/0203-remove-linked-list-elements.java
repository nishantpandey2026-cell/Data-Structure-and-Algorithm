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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=head;
        return helper(temp,val);
    }
    ListNode helper(ListNode temp,int val){
        if(temp==null){
            return null;
        }
        if(temp.val==val){
            return helper(temp.next,val);
        }
        temp.next= helper(temp.next,val);
        return temp;
    }
}
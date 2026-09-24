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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        return helper(temp1,temp2);

    }
ListNode helper(ListNode temp1,ListNode temp2){
    if(temp1==null){
        return temp2;
    }
    if(temp2==null){
        return temp1;
    }
    if(temp1.val<temp2.val){
        temp1.next=helper(temp1.next,temp2);
        return temp1;
    }
    else{
        temp2.next=helper(temp1,temp2.next);
        return temp2;
    }
}
}
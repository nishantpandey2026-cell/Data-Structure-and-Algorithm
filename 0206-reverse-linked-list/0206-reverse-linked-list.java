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
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        int count=0;
        while(temp!=null)
        {
            count+=1;
            temp=temp.next;
        }
        int arr[]=new int[count];
        temp=head;
        for(int i=0;i<count;i++)
        {
            arr[i]=temp.val;
            temp=temp.next;
        }
        temp=head;
        for(int i=arr.length-1;i>=0;i--)
        {
            temp.val=arr[i];
            temp=temp.next;
        }
        return head;
    }
}
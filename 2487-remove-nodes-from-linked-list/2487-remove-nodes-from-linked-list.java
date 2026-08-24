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
    public ListNode removeNodes(ListNode head) {
        ListNode temp=head;
        Stack<ListNode>stack=new Stack<>();
        while(temp!=null)
        {
          stack.push(temp);
          temp=temp.next;
        }
        ListNode ans=null;
        while(!stack.isEmpty())
        {
            ListNode curr=stack.pop();
            if(ans==null || ans.val<=curr.val)
            {
                curr.next=ans;
                ans=curr;
            }

        }
        return ans;

    }
}
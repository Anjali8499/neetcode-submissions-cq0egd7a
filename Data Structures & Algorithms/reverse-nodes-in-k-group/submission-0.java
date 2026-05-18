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
        ListNode curr=head;
        ListNode prev=null;
        while(curr != null){
          ListNode front=curr.next;
          curr.next = prev;
          prev= curr;
          curr=front;
        }
        return prev;
    }
    public ListNode kthNode(ListNode node, int k){
       while(k>1 && node!=null){
            node=node.next;
            k--;
        }
        return node;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head,prevNode=null;
        while(temp != null){
            ListNode kNode=kthNode(temp,k);
            if(kNode == null){
              if(prevNode != null) prevNode.next=temp;
              break;
            }
            ListNode nextNode=kNode.next;
            kNode.next=null;
            reverseList(temp);
            if(prevNode==null){
                head=kNode;
            }
            else{
                prevNode.next=kNode;
            }
            prevNode=temp;
            temp=nextNode;
        }
        return head;
    }
}

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        int l=length(head);
        int rem=l-n;
        int count=1;
        if(n==l){
            return head.next;
        }
        ListNode temp=head;
        while(temp!=null){

            if(count==rem){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
            count++;
        }
        return head;
    }
    private int length(ListNode head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
}
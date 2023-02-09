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
        
        ListNode temp =head;
        int count=0;
        
        while(temp!=null){
            temp =temp.next;
            count++;
        }
        
        int res  = count-n;
        ListNode next1 = head;
        for(int i=1;i<res;i++){
            next1= next1.next;
            
        }
        if(count==n){
            head=head.next;
        }
        
        else{
             ListNode temp3 =next1.next.next;
        next1.next= temp3;
        }
        return head;
    }
}
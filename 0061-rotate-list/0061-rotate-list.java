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
    public ListNode rotateRight(ListNode head, int k) {
         if(head==null || k==0){
            return head;
        }
        
        ListNode temp = head;
        int count =1;
         while(temp.next!=null){
             count++;
             temp=temp.next;
         }
        temp.next = head;
        k = k%count;
    
        ListNode temp2=head;
        
        for(int i=0;i<count-k-1;i++){
            temp2=temp2.next;
            
        }
        head  = temp2.next;
        temp2.next = null;
        
   
        return head;
        
        
    }
}
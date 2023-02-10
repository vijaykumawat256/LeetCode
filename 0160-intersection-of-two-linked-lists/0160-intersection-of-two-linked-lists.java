/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
  

        ListNode temp1 = headA;
        int count1=0,count2=0;
        ListNode temp2 = headB;
        while(temp1!=null){
            temp1=temp1.next;
            count1++;
            
        }
        while(temp2!=null){
            temp2=temp2.next;
            count2++;
        }
        ListNode temp11 =headA;
        ListNode temp22 = headB;
        
        int diff = count2-count1;
        if(diff>0){
            for(int i=0;i<diff;i++){
                temp22= temp22.next;
            }
        }
        if(diff<0){
            for(int i=0;i>diff;i--){
                temp11 = temp11.next;
            }
        }
        while(temp11!=temp22){
            temp11 = temp11.next;
            temp22 = temp22.next;
     
            
        }
       return temp11;
    }
}
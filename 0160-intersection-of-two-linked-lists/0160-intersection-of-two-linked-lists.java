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
        int count1=0;
        int count2=0;
        ListNode dummyA=headA;
        ListNode dummyB=headB;
        while(headA!=null){
            headA=headA.next;
            count1++;
        }
        while(headB!=null){
            headB=headB.next;
            count2++;
        }
        int diff= Math.abs(count2-count1);
        for(int i=0;i<diff;i++){
            if(count2>count1){
                dummyB=dummyB.next;
                
            }
            else{
                dummyA=dummyA.next;
            }
        }
        
        while(dummyA!=dummyB){
            dummyA=dummyA.next;
            dummyB=dummyB.next;
        }
        return dummyA;
       
       
        
    }
}
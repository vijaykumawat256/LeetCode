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
        
        ListNode h1 = list1;
        ListNode h2 = list2;
        ListNode list = new ListNode(0);
        ListNode h3 = list;
        
        while(h1!=null && h2!=null){
                if(h1.val>h2.val)
                {
                    h3.next = h2;
                    h2 = h2.next;
                }
            else{
                h3.next =h1;
                h1 =h1.next;
            }
            h3 = h3.next;

    }
        h3.next= h1!=null ? h1 : h2;
        return list.next;
}
}
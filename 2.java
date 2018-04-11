/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode l3=new ListNode((l1.val+l2.val)%10);
        ListNode head=l3;
        carry=(l1.val+l2.val+carry)/10;
        while(l1.next!=null && l2.next!=null){
            l1=l1.next;
            l2=l2.next;
            l3.next=new ListNode((l1.val+l2.val+carry)%10);
            l3=l3.next;
            carry=(l1.val+l2.val+carry)/10;
        }
        while(l1.next!=null){
            l1=l1.next;
            l3.next=new ListNode((l1.val+carry)%10);
            l3=l3.next;
            carry=(l1.val+carry)/10;
        }
        while(l2.next!=null){
            l2=l2.next;
            l3.next=new ListNode((l2.val+carry)%10);
            l3=l3.next;
            carry=(l2.val+carry)/10;
        }
        if(carry==1){
            l3.next=new ListNode(1);
        }
        return head;
    }
}
package LeetCode.LinkedList;


/**
 * Created by ggorantla on 2/24/2015.
 * https://oj.leetcode.com/problems/reverse-nodes-in-k-group/* 
 */
public class ReverseNodesInKGroups {
    public ListNode reverseKGroup(ListNode head, int k){
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy, cur = head;
        dummy.next = head;
        int pos = 1;
        while (cur != null){
            if (pos == k){
                pos = 0;
                pre = reverse(pre,cur);
                cur = pre.next;
            }else {
                cur = cur.next;
            }
            pos++;
        }
        return dummy.next;
        
    }
    public ListNode reverse(ListNode pre, ListNode end){
        if (pre == null || end == null) return null;
        ListNode cur = pre.next;
        while (pre.next != end){
            ListNode temp = cur.next.next;
            cur.next.next = pre.next;
            pre.next = cur.next;
            cur.next = temp;
        }
        return cur;
    }
}

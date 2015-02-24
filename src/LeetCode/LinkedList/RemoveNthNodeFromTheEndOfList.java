package LeetCode.LinkedList;

/**
 * Created by ggorantla on 2/24/2015.
 * https://oj.leetcode.com/problems/remove-nth-node-from-end-of-list/
 */
public class RemoveNthNodeFromTheEndOfList {
    public ListNode removeNthNodeFromTheEndOfList(ListNode head, int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head, pre = dummy;

        while (cur != null){
            if (n > 0)
                n--;
            else
                pre = pre.next;
            cur = cur.next;
        }
        pre.next = pre.next.next;

        return dummy.next;
    }

    public static void main(String[] args) {

    }
}

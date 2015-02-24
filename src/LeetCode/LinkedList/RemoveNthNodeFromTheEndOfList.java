package LeetCode.LinkedList;

/**
 * Created by ggorantla on 2/24/2015.
 */
public class RemoveNthNodeFromTheEndOfList {
    public ListNode removeNthNodeFromTheEndOfList(ListNode head, int n){
        ListNode cur = head, pre = cur;

        while (cur.next != null){
            if (n > 0)
                n--;
            else
                pre = pre.next;
            cur = cur.next;
        }
        pre.next = pre.next.next;

        return head;
    }
}

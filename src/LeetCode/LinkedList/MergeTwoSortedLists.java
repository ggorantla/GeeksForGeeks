package LeetCode.LinkedList;

/**
 * Created by ggorantla on 2/24/2015.
 * https://oj.leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoSortedLists(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 != null || l2 != null){
            if (l2 == null || (l1 != null && l2.val > l1.val)){
                cur.next = l1;
                l1 = l1.next;
            }
            else {
                cur.next = l2;
                l2 = l2.next;
            }

            cur = cur.next;
        }


        return dummy.next;
    }
}

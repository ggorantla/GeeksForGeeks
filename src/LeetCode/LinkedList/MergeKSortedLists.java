package LeetCode.LinkedList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by ggorantla on 2/24/2015.
 * https://oj.leetcode.com/problems/merge-k-sorted-lists/
 */
public class MergeKSortedLists {
    public ListNode mergeKSortedLists(ArrayList<ListNode> lists){

        if (lists == null || lists.isEmpty())
            return null;
        Comparator<ListNode> comparator = new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if (o1.val < o2.val)
                    return -1;
                else if (o1.val > o2.val)
                    return 1;

                return 0;
            }
        };
        PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(lists.size(), comparator);
        for (ListNode x : lists){
            if (x != null)
                heap.add(x);
        }
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (!heap.isEmpty()){
            cur.next = heap.poll();
            cur = cur.next;
            if (cur.next != null) heap.add(cur.next);
        }

        return dummy.next;
    }
}

package LeetCode.LinkedList;

/**
 * Created by ggorantla on 3/2/2015.
 * https://oj.leetcode.com/problems/intersection-of-two-linked-lists/*
 */
public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionOfTwoLists(ListNode l1, ListNode l2){
        int lenA = getLength(l1), lenB = getLength(l2);
        while (lenA > lenB){
            l1 = l1.next;
            lenA--;
        }
        while (lenB > lenA){
            l2 = l2.next;
            lenB--;
        }
        // By now both will have same length
        
        while (l1 != l2){
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1;
    }
    
    private int getLength(ListNode head){
        int len = 0;
        ListNode cur = head;
        while(cur != null){
            len++;
            cur = cur.next;
        }
        return len;
    }
}

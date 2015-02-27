package LeetCode.LinkedList;

/**
 * Created by ggorantla on 2/26/2015.
 * https://oj.leetcode.com/problems/linked-list-cycle-ii/*
 */
public class LinkedListCycleTwo {
    public ListNode detectCycle(ListNode head){
        if (head == null || head.next == null) return null;
        ListNode fast = head, slow = head;
        
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast)
                break;
        }
        
        if (fast==null || fast.next== null ) return null;
        
        fast = head;
        while(fast!= slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}

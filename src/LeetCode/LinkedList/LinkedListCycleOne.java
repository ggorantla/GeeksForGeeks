package LeetCode.LinkedList;

/**
 * Created by ggorantla on 2/26/2015.
 */
public class LinkedListCycleOne {
    public boolean hasCycle(ListNode head){
        if (head == null || head.next == null) return false;
        ListNode fast = head, slow = head;
        
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast)
                return true;
        }
        return false;
    }
}

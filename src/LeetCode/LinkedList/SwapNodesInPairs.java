package LeetCode.LinkedList;

/**
 * Created by ggorantla on 2/24/2015.
 * https://oj.leetcode.com/problems/swap-nodes-in-pairs/* 
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null){
            ListNode temp = cur.next;
            cur.next = cur.next.next;
            cur = cur.next;
            temp.next = cur.next;
            cur.next = temp;
            cur = cur.next;
        }
        
        return  dummy.next;
    }
    
    public void PrintList(ListNode head ){
        ListNode cur = head;
        while(cur != null){
            System.out.println(cur + " ");
            cur = cur.next;
        }
        
    }

    public static void main(String[] args) {
        SwapNodesInPairs obj = new SwapNodesInPairs();
        ListNode a = new ListNode(1);
        ListNode b = a.next = new ListNode(2);
        ListNode c = b.next = new ListNode(3);
        ListNode d = c.next = new ListNode(4);
        ListNode e = d.next = new ListNode(5);
        ListNode result = obj.swapPairs(a);
        obj.PrintList(result);
        
    }
}

package LeetCode.LinkedList;

/**
 * Created by ggorantla on 2/23/2015.
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
    
    @Override
    public String toString(){
        
        return String.valueOf(this.val);
    }
}


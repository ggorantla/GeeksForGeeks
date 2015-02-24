package LeetCode.LinkedList;

/**
 * Created by ggorantla on 2/23/2015.
 * https://oj.leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode dummy = new ListNode(0), cur = dummy;

        int sum, carry = 0;
        while(l1 != null || l2 != null){
            sum = carry;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            cur.next = new ListNode(sum%10);
            cur = cur.next;

            carry = sum/10;


        }

        if (carry != 0) cur.next = new ListNode(carry);




        return dummy.next;
    }


    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(0);
        AddTwoNumbers obj = new AddTwoNumbers();
        ListNode itr = obj.addTwoNumbers(l1,l2);
        while (itr != null){
            System.out.println(itr.val);
            itr = itr.next;
        }
    }
}

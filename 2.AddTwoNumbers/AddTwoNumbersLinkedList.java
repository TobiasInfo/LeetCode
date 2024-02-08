import java.lang.Math;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        if(l1 == null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        
        int num1 = getNumberFromList(l1);
        int num2 = getNumberFromList(l2);
        int sum = num1 + num2;
        return createListFromInt(sum);
    }
    
    private int getNumberFromList(ListNode l){
        int pow = 0;
        int num1 = 0;
        while(l != null){
            num1 += l.val * Math.pow(10, pow);
            pow++;
            l = l.next;
        }
        return num1;
    }
    
    private ListNode createListFromInt(int number){
        if(number == 0){
            return new ListNode(0);
        }
        ListNode list = new ListNode();
        ListNode prec = list;
        do{
            int digit = number % 10;
            prec.next = new ListNode(digit);
            prec = prec.next;
            number = number/10;
        } while (number > 0);
        return list.next;
    }
    
}
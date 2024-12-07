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
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        int carry = 0;  // 进位标志，初始化为0，表示没有进位
        while (l1!= null || l2!= null || carry!= 0) {
            int sum = carry;  // 先加上进位值
            if (l1!= null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2!= null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;  // 计算新的进位值
            cur.next = new ListNode(sum % 10);  // 创建新节点存储当前数位的值
            cur = cur.next;
        }
        return dummy.next;
    }
}


       
       

        
 

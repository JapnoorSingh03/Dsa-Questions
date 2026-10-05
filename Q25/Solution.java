package Q25;

import java.util.*;

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;
        int count = 0;

        
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        
        if (count < k) {
            return head;
        }

        
        ListNode prev = null;
        ListNode current = head;

        for (int i = 0; i < k; i++) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        
        head.next = reverseKGroup(current, k);

        return prev;
    }
}

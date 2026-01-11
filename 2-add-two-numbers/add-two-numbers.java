class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Use a dummy head to simplify the logic for the first node
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        // Loop as long as there is a node in l1, l2, or a remaining carry
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            // Calculate sum and carry
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            
            // Create the next node in the result list
            current.next = new ListNode(sum % 10);
            current = current.next;

            // Move pointers forward if nodes exist
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummyHead.next;
    }
}
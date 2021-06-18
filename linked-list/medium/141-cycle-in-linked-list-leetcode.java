// Leetcode discussion link: https://leetcode.com/problems/linked-list-cycle/discuss/1280666/java-two-pointer-complete-explanation-time-space-complexity

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// Algorithmic Complexities
// Time:  O(n) - Where 'n' is the number of nodes in the linked list
// Space: O(1) - Since only 2 addition pointers are being used, resulting in constant space complexity

public class Solution {
    public boolean hasCycle(ListNode head) {
        
        // Base cases
        // If head is null, it means no element present, so no cycle will be present, so lets return false
        if (head == null) 
            return false;
        
        // If head.next is null, it means only 1 element present, so again no cycle will be present, so lets return false
        if (head.next == null) 
            return false;
        
        // Using the slow and fast pointer approach, also know as the hare and the turtle algorithm
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        
        // If both the pointers become null, so lets stop
        // Since the fastPointer will always be one step ahead of the slow pointer, so also checking for the fastPointer.next != null
        while (slowPointer != null && fastPointer != null &&  fastPointer.next != null) {
            slowPointer = slowPointer.next;  // Slow moves by one step
            fastPointer = fastPointer.next.next;  // Fast moves by 2 step
            if (slowPointer == fastPointer) {
                // If slowPointer and fastPonter are equal, it means we have detected the cycle
                // This is an algorithm, which already exists and have been proved by mathematicians
                // So lets return true, i.e. cycle is present
                return true;
            }
        }
        return false;  
        // At last if the cycle is never found and the while condition becomes false, so lets return false
        // Which means no cycle present in the linked list

    }
}

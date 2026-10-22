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
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> minHeap =
            new PriorityQueue<>((a, b) -> a.val - b.val);

        // Put the first node of every non-empty list into the heap.
        for (ListNode head : lists) {
            if (head != null) {
                minHeap.offer(head);
            }
        }

        // A dummy node makes building the answer easy.
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        // Repeatedly take the smallest available node.
        while (!minHeap.isEmpty()) {
            ListNode smallest = minHeap.poll();

            tail.next = smallest;
            tail = tail.next;

            // Its next node is now a candidate for the answer.
            if (smallest.next != null) {
                minHeap.offer(smallest.next);
            }
        }

        return dummy.next;
    }
}
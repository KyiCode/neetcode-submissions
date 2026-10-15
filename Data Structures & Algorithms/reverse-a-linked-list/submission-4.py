# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:

        prev = None
        
        if head is None or head.next is None:
            return head
        
        next = head.next    
        while (head.next is not None):
            
            head.next = prev
            prev = head
            head = next
            next = head.next

            
        head.next = prev
        return head
        

        
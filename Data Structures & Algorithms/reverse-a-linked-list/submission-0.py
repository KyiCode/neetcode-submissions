# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:

        prev = None
        curr = head
        if curr is None:
            return 
        
        next = curr.next    


        while (next is not None):
            
            curr.next = prev
            prev = curr
            curr = next
            next = curr.next

            
        curr.next = prev
        return curr
        

        
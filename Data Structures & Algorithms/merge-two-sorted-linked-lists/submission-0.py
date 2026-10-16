# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        result = list1   
        other = list2     

        if (list1 is None):
            return list2

        if list2 is None:
            return list1
        
        if list1.val > list2.val:
            result = list2
            other = list1

        curr = result

        while not (curr.next is None or other is None):

            if (curr.next.val > other.val):
                temp = curr.next
                curr.next = other
                other = temp
            curr = curr.next

        curr.next = other
            

        return result

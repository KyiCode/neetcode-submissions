# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        stack = []
        stack.append([root , 0])
        result = 0

        while len(stack) > 0:
            node, count = stack.pop()
            
            if (node is None):
                continue

            count += 1
            result = max(result, count)

            stack.append([node.left, count])
            stack.append([node.right, count])
        
        return result
        
        
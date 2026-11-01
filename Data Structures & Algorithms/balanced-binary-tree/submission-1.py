# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        def traverse(root : TreeNode):
            if not root:
                return [0, True]
            
            leftRes = traverse(root.left)
            rightRes = traverse(root.right)

            if abs(leftRes[0] - rightRes[0]) > 1 or not leftRes[1] or not rightRes[1]:
                return [0, False]
            
            return [max(leftRes[0], rightRes[0]) + 1, True]

        return traverse(root)[1]
            
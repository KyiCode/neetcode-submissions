# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    
        




    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        def dfs(node: TreeNode):
            if not node:
                return [0, 0]

            leftRes = dfs(node.left)
            rightRes = dfs(node.right)

            maxDepth = max(leftRes[0], rightRes[0]) + 1
            maxDiameter = leftRes[0]+ rightRes[0]
            maxDiameter = max(leftRes[1], rightRes[1], maxDiameter)

            return [maxDepth, maxDiameter]
        
        result = dfs(root)
            
        return result[1]
        
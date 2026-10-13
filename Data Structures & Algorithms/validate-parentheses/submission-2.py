class Solution:
    def isValid(self, s: str) -> bool:
        set = {'(', '[', '{'}
        dict = { '}' : '{', ']': '[', ')' : '('}
        stack = []

        for char in s:
            if char in set:
                stack.append(char)
            else:
                if not stack: 
                    return False
                
                content = stack.pop()
                if content != dict.get(char):
                    return False

        if stack:
            return False
        
        return True
        
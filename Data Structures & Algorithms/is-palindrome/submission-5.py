class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = "".join([char for char in s if (char.isalpha() or char.isnumeric())])
        s = s.lower()
        left = 0
        right = len(s) - 1

        while left < right:
            leftChar = s[left]
            rightChar = s[right]
            if leftChar != rightChar:
                return False
            left+=1
            right-=1

        return True
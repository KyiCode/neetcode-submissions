class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        map = {}

        if (len(s) != len(t)):
            return False

        for i in range(len(s)):
            if s[i] not in map:
                map[s[i]] = 1
            else:
                map[s[i]] += 1
            if t[i] not in map:
                map[t[i]] = -1
            else:
                map[t[i]] -= 1

        return all(v == 0 for v in map.values())
            
            
        
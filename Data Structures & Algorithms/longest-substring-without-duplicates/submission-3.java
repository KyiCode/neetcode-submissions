class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set = new HashSet<>();

        int length = s.length();
        int left = 0;
        int right = 0;
        int result = 0;
        int currCount = 0;

        while (right < length) {
            char curr = s.charAt(right);
            if (!set.contains(curr)) {
                set.add(curr);
                currCount += 1;
                result = Math.max(result, currCount);
                right++;
            } else {
                while (s.charAt(left) != curr) {
                    
                    currCount -= 1;
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(curr);
                left++;
                currCount -=1;
            }

        }
        return result;
    }
}

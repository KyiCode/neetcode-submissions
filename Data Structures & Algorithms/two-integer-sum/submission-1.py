class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        pair = {}

        for i in range(len(nums)):
            x = nums[i]
            if x in pair:
                return [pair.get(x), i]

            diff = target - x
            pair[diff] = i


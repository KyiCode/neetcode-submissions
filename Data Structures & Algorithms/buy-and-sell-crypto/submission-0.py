class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        currentMin = 101
        result = 0

        for x in prices:
            profit = x - currentMin
            if profit > result:
                result = profit
            if x < currentMin:
                currentMin = x

        return result

        
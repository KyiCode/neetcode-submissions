class Solution {
    int[] cost;
    int[] calc;

    public int minCostClimbingStairs(int[] cost) {
        this.cost = cost;
        calc = new int[cost.length];
        Arrays.fill(calc, -1);
        return Math.min(iterate(0), iterate(1));
    }

    public int iterate(int index) {
        if (index >= cost.length) {
            return 0;
        }
        if (calc[index] != -1) {
            return calc[index];
        }

        int currIndex = cost[index] + Math.min(iterate(index + 1), iterate(index + 2));
        calc[index] = currIndex;
        return currIndex;
    }
}

class Solution {
    HashMap<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int n) {
        if (map.containsKey(n)) return map.get(n);

        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;


        int ways = climbStairs(n-1) + climbStairs(n-2);
        map.put(n, ways);
        return ways;
    }
}

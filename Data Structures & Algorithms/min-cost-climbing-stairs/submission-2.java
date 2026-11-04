class Solution {
    int size;
    int[] costs;
    HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
    
    public int minCostClimbingStairs(int[] cost) {
        this.size = cost.length;
        this.costs = cost;    
        
        int start0 = Math.min(iterate(1, cost[0]), iterate(2, cost[0]));
        int start1 = Math.min(iterate(2, cost[1]), iterate(3, cost[1]));
        return Math.min(start0, start1);
    }


    public int iterate(int index, int cost) {
        if (index >= size) {
            return cost;
        }

        if (map.containsKey(index) && map.get(index).containsKey(cost)) {
            return map.get(index).get(cost);
        }

        cost += costs[index];
        int min = Math.min(iterate(index + 1, cost), iterate(index+2, cost));

        if (!map.containsKey(index)) {
            map.put(index, new HashMap<Integer, Integer>());
        }
        map.get(index).put(cost, min);
        return min;

    }


}

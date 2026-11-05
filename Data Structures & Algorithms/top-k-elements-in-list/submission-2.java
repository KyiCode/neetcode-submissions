class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> min = new PriorityQueue<>( (a,b) -> Integer.compare(a[1] ,b[1]));
        PriorityQueue<int[]> max = new PriorityQueue<>( (a,b) -> Integer.compare(b[1] ,a[1]));
        
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 0);
            }
            map.put(num, map.get(num) + 1);
            
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (min.size() < k) {
                min.add(new int[] {entry.getKey(), entry.getValue()});
            } else {
                max.add(new int[] {entry.getKey(), entry.getValue()});
                if (min.peek()[1] < max.peek()[1]) {
                    int[] temp = min.poll();
                    int[] big = max.poll();
                    min.add(big);
                    max.add(temp);
                } 
            }
        }

        // List<Integer> result = new ArrayList<>();
        int[] result = new int[k];
        int count = 0;
        while (!min.isEmpty()) {
            result[count++] = min.poll()[0];
            // result.add(min.poll()[0]);
        }

        return result;

    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 0);
            }
            map.put(num, map.get(num) + 1);
            
        }

        ArrayList<int[]> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(new int[]{entry.getKey(), entry.getValue()});
        }

        list.sort((a,b)-> Integer.compare(b[1] , a[1]));
        int[] result = new int[k];
        while (--k >= 0) {
            result[k] = list.get(k)[0];

        }
        return result;

    }
}

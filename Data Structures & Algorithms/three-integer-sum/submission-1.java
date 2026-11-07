class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {        
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new HashSet<>());
            }
            
            map.get(nums[i]).add(i);
        } 
        HashSet<List<Integer>> resultSet = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                int inverse = (nums[i] + nums[j]) * -1;
                if (map.containsKey(inverse)) {
                    HashSet<Integer> set = map.get(inverse);
                        
                        if (!Set.of(i,j).containsAll(set)) {
                            List<Integer> list = new ArrayList<>(List.of(nums[i], nums[j], inverse));
                            list.sort(Comparator.naturalOrder());
                            resultSet.add(list);
                        }
                    
                } 
            }
        }
        return resultSet.stream()
                       .collect(Collectors.toList());

    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<Integer, List<String>> map = new HashMap<>();


       for (String str : strs) {
            int[] signature = new int[26];
            Arrays.fill(signature, 0);

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                int index = (int) c - 97;
                signature[index] += 1;
            }
            int hash = Arrays.hashCode(signature);
            if (!map.containsKey(hash)) {
                map.put(hash, new LinkedList<String>());
            }
            map.get(hash).add(str);
       }

        List<List<String>> result = new LinkedList<>();
        map.forEach((x,y) -> result.add(y));
        return result;
    }
}

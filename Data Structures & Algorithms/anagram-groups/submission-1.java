class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String, List<String>> map = new HashMap<>();


       for (String str : strs) {
            char[] string = str.toCharArray();
            Arrays.sort(string);
            String finalString = new String(string);

            if (!map.containsKey(finalString)) {
                map.put(finalString, new LinkedList<String>());
            }
            map.get(finalString).add(str);
       }

        List<List<String>> result = new LinkedList<>();
        map.forEach((x,y) -> result.add(y));
        return result;
    }
}

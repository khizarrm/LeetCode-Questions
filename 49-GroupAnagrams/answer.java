class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++){

            char sortedArr[] = strs[i].toCharArray();
            Arrays.sort(sortedArr);
            String sortedWord = new String(sortedArr);

            if (!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }

}
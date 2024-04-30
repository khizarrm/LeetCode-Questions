class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> charToFreq = new HashMap<>();
        for (char c : s.toCharArray()){
            if (charToFreq.containsKey(c)){
                charToFreq.put(c, charToFreq.get(c) + 1);
            } else {
                charToFreq.put(c, 1);
            }
        }

        for (char c : t.toCharArray()){
            if (!charToFreq.containsKey(c) || charToFreq.get(c) == 0){
                return false;
            }
            else{
                charToFreq.put(c, charToFreq.get(c) - 1);
            }
        }

        for (int f : charToFreq.values()){
            if (f != 0){ return false; }
        }

        return true; 
    }
}

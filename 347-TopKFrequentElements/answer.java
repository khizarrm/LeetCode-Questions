class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> valToFreq = new HashMap<>();
        List<Integer>[] freqList = new List[nums.length+1];

        for (int num: nums){
            valToFreq.put(num, valToFreq.getOrDefault(num, 0) + 1);
        }

        for (int key : valToFreq.keySet()){
            int freq = valToFreq.get(key);
            if (freqList[freq] == null){
                freqList[freq] = new ArrayList<>();
            }
            freqList[freq].add(key);
        }

        int[] res = new int[k];
        int resIndex = 0; 
        for (int i = freqList.length - 1; i >= 0; i--){
            if (freqList[i] != null){
                for (int j = 0; j < freqList[i].size() && resIndex < k; j++){
                    res[resIndex] = freqList[i].get(j);
                    resIndex++; 
                }
            }
        }

        return res; 
    }
}

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        if len(nums) == 1: return nums

        valToFreq = {}
        freqs = [[] for i in nums]
        for n in nums:
            if n in valToFreq:
                valToFreq[n] += 1
            else:
                valToFreq[n] = 1
        
        
        print(valToFreq)

        freqs = []
        return freqs



    

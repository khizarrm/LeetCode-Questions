class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0: return 0
        numSet = set(nums)
        count = 0 
        for n in nums:
            tempCount = 0
            if n-1 not in numSet:
                while (n + tempCount) in numSet:
                    tempCount += 1
                count = max(tempCount, count)
        return count

            


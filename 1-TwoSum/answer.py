class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        valToIndex = {}
        output = []
        for index, number in enumerate(nums):
            n = target - number
            if n in valToIndex:
                output.append(index)
                output.append(valToIndex[n])
            valToIndex[number] = index
        return output





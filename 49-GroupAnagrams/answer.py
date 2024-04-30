class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        wordToAn = {}
        for word in strs:
            sWord = tuple(sorted(word))
            if sWord in wordToAn:
                wordToAn[sWord].append(word)
            else:
                wordToAn[sWord] = [word]

        return wordToAn.values()

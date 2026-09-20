class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        temp = defaultdict(list) # key : count array value: list of strings 
        for i in strs:
            count = [0]*26
            for j in i:
                count[ord(j) - ord('a')] += 1
            
            temp[tuple(count)].append(i)

        return list(temp.values())
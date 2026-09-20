class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False 

        temp = [0] * 26 
        for i in s:
            temp[ord(i) - ord('a')] += 1
        for j in t:
            temp[ord(j) - ord('a')] -= 1

        for i in temp: 
            if i != 0:
                return False 
        return True
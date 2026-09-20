class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        temp = dict() 
        res = []
        for i, n in enumerate(nums):
            compliment = target - n

            if compliment in temp:
                res.append(min(i, temp[compliment]))
                res.append(max(i, temp[compliment]))
                return res

            temp[n] = i 
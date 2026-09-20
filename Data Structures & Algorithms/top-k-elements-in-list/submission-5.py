class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        temp = dict()
        bucket = [[] for _ in range(len(nums)+1)]
        res = []
        for i in nums:
            temp[i] = temp.get(i, 0) + 1

        for i, j in temp.items():
            bucket[j].append(i)

        for i in bucket[::-1]:
            for j in i:
                res.append(j)

        return res[:k] 
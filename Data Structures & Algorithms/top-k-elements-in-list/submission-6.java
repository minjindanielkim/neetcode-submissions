class Solution {
    public int[] topKFrequent(int[] nums, int k) {
           HashMap<Integer, Integer> freq = new HashMap<>(); 
    for(int i = 0; i < nums.length; i++) {
      freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
    }

    List<Integer>[] buckets = new List[nums.length+1];

    for(Map.Entry<Integer, Integer> e: freq.entrySet()) {
      int num = e.getKey();
      int f = e.getValue(); 
      if(buckets[f] == null) {
        buckets[f] = new ArrayList<>();
      }
      buckets[f].add(num);
    }

    int[] result = new int[k];
    int index = 0; 

    for(int i = buckets.length - 1; i >= 0 && index < k; i--) {
      if(buckets[i] == null) {
        continue;
      }
      for(int num : buckets[i]) {
        result[index] = num;
        index++;
        if(index == k) {
          break;
        }
      }
    }
    return result;  
    }
}

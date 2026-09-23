class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> temp = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target-num; 
            if(temp.containsKey(diff)) {
                return new int[] {temp.get(diff), i};
            }
            temp.put(num, i);
        }        
        return new int[] {};
    }
}

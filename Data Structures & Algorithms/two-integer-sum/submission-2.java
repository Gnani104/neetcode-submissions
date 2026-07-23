class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> sumMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int composite = target - nums[i];
            if(sumMap.containsKey(composite)){
                return new int[] {sumMap.get(composite), i};
            }
            sumMap.put(nums[i], i);

        }
        return new int[]{};
    }
}

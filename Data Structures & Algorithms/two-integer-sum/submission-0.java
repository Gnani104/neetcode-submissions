class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> summap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            summap.put(nums[i], i);
        }
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(summap.containsKey(diff) && summap.get(diff)!= i){
                return new int[] {i, summap.get(diff)};
            }
        }
        return new int[] {};
    }
}

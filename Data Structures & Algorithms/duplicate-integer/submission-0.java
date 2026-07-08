class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dupset = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(dupset.contains(nums[i])){
                return true;
            }
            dupset.add(nums[i]);
        }
        return false;
    }
}
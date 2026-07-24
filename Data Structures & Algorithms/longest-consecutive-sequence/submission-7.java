class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int result = 0;
        Set<Integer> seq = new HashSet<>();
        for(int i = 0;i < nums.length;i++){
            seq.add(nums[i]);
        }
        int curr;
        for(int num:nums){
            curr = num;
            int streak = 0;
            while(seq.contains(curr)){
                curr++;
                streak++;
            }
            result = Math.max(result, streak);
        }
        return result;
    }
}

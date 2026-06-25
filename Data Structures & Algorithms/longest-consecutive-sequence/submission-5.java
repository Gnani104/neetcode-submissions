class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int counter = 1;
        int longest = 1;
        Arrays.sort(nums);
        for(int i = 0;i < nums.length - 1;i++){
            if(nums[i+1] == nums[i]) continue;
            if(Math.abs((nums[i+1] - nums[i])) == 1){
                counter++;
            }  else { 
                longest = Math.max(longest, counter); // save longest streak
                counter = 1; // reset for new streak
            }
        }
        return Math.max(counter,longest);
    }
}

class Solution {
    public int[] getConcatenation(int[] nums) {
        if(nums.length == 0){
            return new int[0];
        }
        int[] ans = new int[2 * nums.length];
        for(int  i = 0;i< nums.length;i++){
            ans[i] = ans[i+ nums.length] = nums[i];
        }

        return ans;
    }
}
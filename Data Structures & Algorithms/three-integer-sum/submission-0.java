class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> threeSumList = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            for(int j = i + 1;j < nums.length;j++){
                for(int k = j + 1;k < nums.length;k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> oneList = new ArrayList<>();
                        oneList.add(nums[i]);
                        oneList.add(nums[j]);
                        oneList.add(nums[k]);
                        threeSumList.add(oneList);
                    }
                }
            }
        }
        return new ArrayList<>(threeSumList);
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 0)
            return new int[0];

        Map<Integer, Integer> countMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer> keys = new ArrayList<>(countMap.keySet());
        keys.sort((a,b) -> countMap.get(b) - countMap.get(a));
        int[] result = new int[k];
        for(int i = 0; i < k;i++){
            result[i] = keys.get(i);
        }
        return result;
    }
}

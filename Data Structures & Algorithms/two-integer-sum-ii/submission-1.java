class Solution {
    public int[] twoSum(int[] numbers, int target) {
       Map<Integer, Integer> mp = new HashMap<>();
       for(int i = 0; i< numbers.length;i++){
        int composite = target - numbers[i];
        if(mp.containsKey(composite)){
            return new int[] {mp.get(composite), i + 1};
        }
        mp.put(numbers[i],i+1);
       }
       return new int[0];
        
    }
}

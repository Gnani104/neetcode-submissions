class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int counter = 0;
        for(int j = 0;j< s.length();j++){
            Set<Character> seen = new HashSet<>();
            for(int i = j; i < s.length();i++){
            if(seen.contains(s.charAt(i))){
                break;
            }
            seen.add(s.charAt(i));
        }
        counter = Math.max(counter, seen.size());
        }
        return counter;
    }
}

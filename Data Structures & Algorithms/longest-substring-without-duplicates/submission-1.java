class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        Set<Character> seen = new HashSet<>();
        int counter = 0;
        int l = 0;
        for(int r = 0; r < s.length();r++){
            while(seen.contains(s.charAt(r))){
                seen.remove(s.charAt(l));
                l++;
            }
            seen.add(s.charAt(r));
            counter = Math.max(counter, r - l + 1);
        }
    return counter;
    }
}

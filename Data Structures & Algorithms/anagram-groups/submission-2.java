class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] newstring = s.toCharArray();
            Arrays.sort(newstring);
            String mine = new String(newstring);
            map.putIfAbsent(mine, new ArrayList<>());
            map.get(mine).add(s);
        }
        return new ArrayList<>(map.values());
    }
}

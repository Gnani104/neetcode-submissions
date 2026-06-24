class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length]; // track already-grouped words

        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) continue; // skip if already in a group

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;

            for (int j = i + 1; j < strs.length; j++) {
                if (!visited[j] && isValidAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }

            result.add(group);
        }

        return result;
    }

    public boolean isValidAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>(); // fix: Character not String
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1); // fix: map2 not map1
        }

        return map1.equals(map2);
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0) return true;
        int l = 0, r = s.length() - 1;
        while(l < r){
            while(l < r && !isAlphanum(s.charAt(l))){
                l++;
            } 
            while(r > l && !isAlphanum(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            } 
            l++;
            r--;
        }
        return true;
    }
    public boolean isAlphanum(char s){
        return (s >= 'A' && s <= 'Z' ||
           s >= 'a' && s <= 'z' ||
           s >= '0' && s <= '9');
    }
}

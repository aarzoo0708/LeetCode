class Solution {
    public boolean areIsomorphic(String s1, String s2) {
        // code here
        if(s1.length() != s2.length()) return false;
        
        HashMap<Character, Character> map = new HashMap<>();
        
        for(int i=0; i<s1.length(); i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            
            if((map.containsKey(ch1) && map.get(ch1) != ch2) || (!map.containsKey(ch1) && map.values().contains(ch2))){
                return false;
            }
            map.put(ch1, ch2);
        }
        return true;
    }
}
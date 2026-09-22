class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length){
            return false;
        }
        for(int i=0; i<pattern.length(); i++){
            char p = pattern.charAt(i);
            String st = arr[i];

            if((map.containsKey(p) && !map.get(p).equals(st)) || (!map.containsKey(p) && map.values().contains(st))){
                return false;
            }
            map.put(p,st);
        }
        return true;
    }
}
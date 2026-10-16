class Solution {
    public String maxOdd(String s) {
        // code here
        for(int i=s.length()-1; i>=0; i--){
            int dig = s.charAt(i) - '0';
            if(dig % 2 == 1){
                return s.substring(0,i+1);
            }
        }
        return "";
    }
}
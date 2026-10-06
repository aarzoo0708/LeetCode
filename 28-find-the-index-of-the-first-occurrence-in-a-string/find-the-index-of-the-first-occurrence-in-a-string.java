class Solution {
    public int strStr(String haystack, String needle) {
        int len = haystack.length()-needle.length();
        int i=0;
        
        int jlen = needle.length();

        while(i>=0 && i<=len){
            int index = i;
            int j = 0;
            while(j>=0 && j<jlen && needle.charAt(j) == haystack.charAt(index)){
                    j++;
                    index++;
                }
                if (j==jlen){
                    return i;
                }
            i++;
        }
        return -1;
    }
}
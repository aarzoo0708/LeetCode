class Solution {
    public String longestCommonPrefix(String arr[]) {
        // code here
        Arrays.sort(arr);
        String str1 = arr[0];
        String str2 = arr[arr.length-1];
        int index = 0;
        
        while(index < str1.length()){
            if(str1.charAt(index) == str2.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        
        return index==0? "" : str1.substring(0,index);
    }
}
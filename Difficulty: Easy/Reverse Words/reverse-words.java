class Solution {
    public String reverseWords(String s) {
        // Code here
        StringBuilder str = new StringBuilder();
        String[] arr = s.trim().split("\\.+");
        
        for(int i=arr.length-1; i>=0; i--){
            if(!arr[i].isEmpty()){
                if(str.length() > 0){
                    str.append(".");
                }
            }
            str.append(arr[i]);
        }
        
        return str.toString();
    }
}

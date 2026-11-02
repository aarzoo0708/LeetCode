class Solution {
    public int minParentheses(String s) {
        // code here
        int size = 0;
        int open = 0;
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='('){
                size++;
            }
            else if(size>0){
                size--;
            }
            else{
                open++;
            }
        }
        
        return open + size;
    }
}

class Solution {
    public String removeOuter(String s) {
        // code here
        String res = "";
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char st = s.charAt(i);
            if(st=='('){
                if(count!=0){
                    res+=st;
                }
                count++;
            }
            else{
                count--;
                if(count!=0) res+=st;
            }
        }
        return res;
    }
}
// class Solution {
//     public int compress(char[] chars) {
//         int count = 1;
//         String s = "";
//         for(int i=1; i<chars.length; i++){
//             if(chars[i]==chars[i-1]){
//                 count++;
//             }
//             else{
//                 if(count>1){
//                 s = s + chars[i-1] + count; 
//                 }
//                 else{
//                     s = s + chars[i-1];
                    
//                 }
//                 count = 1;
//             }
//         }
//         if(count > 1) {
//             s = s + chars[chars.length - 1] + count;
//         } else {
//             s = s + chars[chars.length - 1];
//         }
//         int k = 0;
//         for(int i=0; i<s.length(); i++){
//             chars[k] = s.charAt(i);
//             k++;
//         }
//         return k;
//     }
// }

class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;

        while(read < chars.length){
            int count = 0;
            char ch = chars[read];

            while(read < chars.length && chars[read] == ch){
                count++;
                read++;
            }

            chars[write++] = ch;
            if(count > 1){
                String co = String.valueOf(count);
                for(int j=0; j <co.length(); j++){
                    chars[write++] = co.charAt(j);
                }
            }
        }
        return write;
    }
}
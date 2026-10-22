class Solution {
    int majorityElement(int arr[]) {
        // code here
        int el = 0;
        int count = 0;
        for(int num: arr){
            if(count == 0){
                el = num;
            }
            if(num==el){
                count++;
            }
            else{
                count--;
            }
        }
        
        int c = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==el){
                c++;
            }
        }
        if(c>arr.length/2){
            return el;
        }
        return -1;
    }
}
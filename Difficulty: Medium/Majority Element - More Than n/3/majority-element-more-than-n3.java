class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        
        int c1 = 0;
        int c2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            if(c1==0 && arr[i]!=el2){
                el1 = arr[i];
                c1 = 1;
            }
            else if(c2==0 && arr[i]!=el1){
                el2 = arr[i];
                c2 = 1;
            }
            else if(arr[i] == el1) c1++;
            else if(arr[i] == el2) c2++;
            else{
                c1--;
                c2--;
            }
        }
        
        c1 = 0;
        c2 = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == el1) c1++;
            if(arr[i] == el2) c2++;
        }
        
        int min = (int)(arr.length/3)+1;
        if(c1>=min) res.add(el1);
        if(c2>=min) res.add(el2);
        
        Collections.sort(res);
        return res;
        
    }
}
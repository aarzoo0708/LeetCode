class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(1);
            long ans = 1;
            for(int j=1; j<i; j++){
                ans = ans * (i-j+1);
                ans = ans / j;

                arr.add((int)ans);
                
            }
            if(i>0) arr.add(1);
            list.add(arr);
        }
        return list;
    }
}
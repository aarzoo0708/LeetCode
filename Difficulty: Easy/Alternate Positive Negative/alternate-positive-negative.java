class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for(int n: arr){
            if(n<0){
                neg.add(n);
            }
            else{
                pos.add(n);
            }
        }
        
        arr.clear();
        if(pos.size() < neg.size()){
            for(int i=0; i <pos.size(); i++){
                arr.add(pos.get(i));
                arr.add(neg.get(i));
            }
            for(int i=pos.size(); i<neg.size(); i++){
                arr.add(neg.get(i));
            }
        }
        else{
            for(int i=0; i<neg.size(); i++){
                arr.add(pos.get(i));
                arr.add(neg.get(i));
            }
            for(int i=neg.size(); i<pos.size(); i++){
                arr.add(pos.get(i));
            }
        }
    }
}
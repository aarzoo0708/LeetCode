class Solution {
    static ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;
        while(i < arr1.length && j < arr2.length){
            if(arr2[j] < arr1[i]){
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                if(list.isEmpty() || list.get(list.size() - 1)!=arr1[i]){
                list.add(arr1[i]);
                }
                j++;
                i++;
                
            }
        }
        return list;
    }
}

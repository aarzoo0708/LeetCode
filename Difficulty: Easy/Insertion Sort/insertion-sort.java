class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        for(int i=1; i<arr.length; i++){
                    for(int j=i; j>0; j--){
                        if(arr[j] < arr[j-1]){
                            int temp = arr[j];
                            arr[j] = arr[j-1];
                            arr[j-1] = temp;
                        }
                    }
                }
    }
}
class Solution {
    int missingNum(int arr[]) {
        // code here
        long sum = 0;
        long n = arr.length + 1;
        long expected = n * (n + 1)/2;
        for(int num: arr){
            sum+=num;
        }
        return (int)(expected - sum);
    }
}
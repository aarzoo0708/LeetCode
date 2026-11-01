class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        
        long SN = ((long)n * (n+1)) / 2;
        long S2N = ((long)n * (n+1) * (2*n+1)) / 6;
        long S = 0;
        long S2 = 0;
        for(int i=0; i<n; i++){
            S += arr[i];
            S2 += (long)arr[i] * arr[i];
        }
        
        long val1 = S - SN;
        long val2 = S2 - S2N;
        val2 = val2 / val1;
        long x = (val1 + val2) / 2;
        long y = x - val1;
        result.add((int)(x));
        result.add((int)(y));
        return result;
    }
}

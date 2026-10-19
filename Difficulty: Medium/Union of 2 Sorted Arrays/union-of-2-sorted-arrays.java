class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < a.length && j < b.length){
            if(a[i] < b[j]){
                if(result.size()==0 || result.get(result.size()-1)!=a[i])
                result.add(a[i]);
                i++;
            }
            else if(b[j] < a[i]){
                if(result.size()==0 || result.get(result.size()-1)!=b[j])
                result.add(b[j]);
                j++;
            }
            else{
                if(result.size()==0 || result.get(result.size()-1)!=a[i])
                result.add(a[i]);
                i++;
            }
        }
        
        while(i<a.length){
            if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                            result.add(a[i]);
                        }
                        i++;
        }
        while(j<b.length){
            if (result.isEmpty() || result.get(result.size() - 1) != b[j]) {
                            result.add(b[j]);
                        }
                        j++;
        }
        
        return result;
    }
}

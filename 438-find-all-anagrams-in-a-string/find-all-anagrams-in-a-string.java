class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int ns = s.length();
        int np = p.length();

        if(np > ns){
            return new ArrayList();
        }

        List<Integer> res = new ArrayList();
        int[] reference = new int[26];
        int[] slidingCount = new int[26];

        for(char c: p.toCharArray()) reference[c - 'a']++;
        for(char c: s.substring(0,np).toCharArray()) slidingCount[c - 'a']++;

        if(Arrays.equals(reference, slidingCount)){
            res.add(0);
        }

        for(int i=1; i < ns - np + 1; i++){
            slidingCount[s.charAt(i-1) - 'a']--;
            slidingCount[s.charAt(i + np - 1) - 'a']++;

            if(Arrays.equals(reference, slidingCount)){
                res.add(i);
            }
        }

        return res;
    }
}
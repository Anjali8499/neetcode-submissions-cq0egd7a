class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<l1;i++){
            char ch=s1.charAt(i);
            freq1[ch -'a']++;
        }
        int l=0,r=0;
        while(r<l2){
            freq2[s2.charAt(r)-'a']++;
            if(r-l+1>l1){
                freq2[s2.charAt(l)-'a']--;
                l++;
            }
            if(Arrays.equals(freq1,freq2)) return true;
            r++;
        }
        return false;
    }
}

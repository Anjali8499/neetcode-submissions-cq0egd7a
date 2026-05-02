class Solution {
    public int characterReplacement(String s, int k) {
        int i=0,j=0;
        int len=s.length();
        int maxLen=0,maxFreq=0;
        HashMap<Character,Integer> hm=new HashMap<>();

        while(j<len){
            char ch=s.charAt(j);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            maxFreq=Math.max(maxFreq,hm.get(ch));

            while((j-i+1)-maxFreq > k){ 
               char c= s.charAt(i);
               hm.put(c,hm.get(c)-1);
               i++;
            }
            maxLen=Math.max(maxLen,(j-i+1));
            j++; 
            
        }
        return maxLen;
    }
}

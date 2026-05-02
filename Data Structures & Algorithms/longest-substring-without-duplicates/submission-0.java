class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=s.length();
        int i=0,j=0;
        int maxLen=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        while(j<len){
            char ch=s.charAt(j);
          if( hm.containsKey(ch) && i<= hm.get(ch) ){
            i=hm.get(s.charAt(j))+1;
            hm.put(s.charAt(j),j);
          }
          maxLen=Math.max(maxLen,j-i+1);
          hm.put(s.charAt(j),j);
          j++;
        }
        return maxLen;
        
    }
}

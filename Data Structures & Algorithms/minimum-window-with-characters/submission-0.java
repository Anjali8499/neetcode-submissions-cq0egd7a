class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        int count=0, minLen=Integer.MAX_VALUE; 
        int sInd=-1;
        for(int i=0;i<m;i++){
            hm.put(t.charAt(i),hm.getOrDefault(t.charAt(i),0)+1);
        }
        int l=0, r=0;
        while(r<n){
           if(hm.containsKey(s.charAt(r))){
              if(hm.get(s.charAt(r)) > 0)count++;
             hm.put(s.charAt(r),hm.getOrDefault(s.charAt(r),0)-1);
           }
           while(count==m){
              if(r-l+1 < minLen){
                minLen=r-l+1;
                sInd=l;
              }
              if(hm.containsKey(s.charAt(l))){
                hm.put(s.charAt(l),hm.getOrDefault(s.charAt(l),0)+1);
                if(hm.get(s.charAt(l))>0) count--;
              }
              l++;
           }
          r++;
        }
      return sInd == -1 ? "" : s.substring(sInd,sInd+minLen);

          
    }
}

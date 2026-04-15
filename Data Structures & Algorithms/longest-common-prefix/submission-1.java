class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String res = strs[0];
        for(int k=1;k<strs.length;k++){
            String currentRes = "";
            int len= Math.min(res.length(), strs[k].length());
            for(int i=0;i<len;i++){
                if(res.charAt(i) == strs[k].charAt(i)) 
                    currentRes += res.charAt(i);
                else{
                    break;
                }
            }
            res = currentRes;
        }
        return res;
    }
}
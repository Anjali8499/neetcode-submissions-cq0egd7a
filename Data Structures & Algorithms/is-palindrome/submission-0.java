class Solution {
    public boolean isPalindrome(String s) {
        int l=s.length();
        int i=0,j=l-1;
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))){ 
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))) return false;
            i++;
            j--;
        }
        return true;
    }
}

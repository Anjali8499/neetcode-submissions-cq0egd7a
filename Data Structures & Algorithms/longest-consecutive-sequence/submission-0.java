class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int result=0;
        for(int num:nums){
            hs.add(num);
        }

        for(int n:hs){
            if(!hs.contains(n-1)){
                int streak=1;
                while(hs.contains(n+streak)){
                    streak++;
                }
                result=Math.max(result,streak);
            }
        }
        return result;
        
    }
}

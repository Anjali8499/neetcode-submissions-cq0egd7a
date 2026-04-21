class Solution {
    public int maxProduct(int[] nums) {
        int prefix=1,suffix=1;
        int res=nums[0];
        int n=nums.length;
        
        for(int i=0;i<nums.length;i++){
            prefix=nums[i]*(prefix==0 ? 1: prefix);
            suffix=nums[n-1-i]*(suffix==0 ? 1: suffix );
            res= Math.max(res,Math.max(prefix,suffix));
        }
        return res;
    }
}

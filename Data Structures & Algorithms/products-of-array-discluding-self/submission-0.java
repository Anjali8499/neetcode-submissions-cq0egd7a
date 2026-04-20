class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[]=new int[nums.length];
        int n=nums.length;
        res[0]=1;
        for(int i=1;i<n;i++){
            res[i]=nums[i-1]*res[i-1];
        }
        int postSum=1;
        for(int i=n-1;i>=0;i--){
          res[i]*=postSum;
          postSum*=nums[i];
        }
        return res;

        
    }
}  

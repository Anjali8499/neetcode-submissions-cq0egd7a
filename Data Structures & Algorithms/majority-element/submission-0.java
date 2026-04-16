class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int element=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                element=nums[i];
                count++;
            }
            else{
                count= count + (nums[i]==element? 1 : -1);
            }
        }
        return element;
        
        
    }
}
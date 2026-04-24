class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int res[]=new int[k];
        List<Integer>[] list=new List[n+1];
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=0;i<=n;i++){
            list[i]=new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            int ind=e.getValue();
            list[ind].add(e.getKey());
        }
        int index=0;
        for(int i=n;i>=0;i--){
            if(index< k){
                for(int l: list[i]){
                    res[index++]=l;
                    if(index==k) return res;
                }
            }
        }
        return res;

        
    }
}

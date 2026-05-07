class Solution {
    public int totalHours(int[] arr,int hourly){
        int n=arr.length;
        int totalHours=0;
        for(int i=0;i<n;i++){
            totalHours+=Math.ceil((double)arr[i]/(double)hourly);
        }

        return totalHours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=0,r=0;
        for(int i=0;i<piles.length;i++){
            r=Math.max(r,piles[i]);
        }
        while(l<=r){
          int mid=(l+r)/2;
          int totalH=totalHours(piles,mid);
          if(totalH <= h){
            r=mid-1;
          }else{
            l=mid+1;
          }
        }
        return l;
    }
}

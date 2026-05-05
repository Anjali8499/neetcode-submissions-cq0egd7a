class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack <Double> stack= new Stack<>();
        int n=position.length;
        int[][] pair=new int[n][2];
        for(int i=0;i<n;i++){
            pair[i][0]=position[i];
            pair[i][1]=speed[i];
        }
        Arrays.sort(pair,(a,b)->Integer.compare(b[0],a[0]));
        for(int[]p:pair){
            stack.push((target-p[0])*1.0/p[1]); //time to target

            // if we have 2 or more cars target speed, then calculate
            //from last position car,if previous car has greater or equal speed, it will be a fleet
            if(stack.size()>=2 && stack.peek() <= stack.get(stack.size()-2) )
             stack.pop(); // remove one 
        }
        return stack.size();
    }
}

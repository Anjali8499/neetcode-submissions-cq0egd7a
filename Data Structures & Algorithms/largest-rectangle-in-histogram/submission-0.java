class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack <Integer> stack=new Stack<>();
        int maxArea=0;
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && heights[i]< heights[stack.peek()]){
              int e=stack.peek();  
              int nse=i;
              stack.pop();  
              int pse= stack.isEmpty() ? -1 : stack.peek();
              int area=heights[e]*(nse-pse-1);
              maxArea=Math.max(maxArea, area);
            }
            stack.push(i); 
        }
        while(!stack.isEmpty()){
            int nse=n;
            int e=stack.peek();
            stack.pop();
            int pse= stack.isEmpty() ? -1 : stack.peek();
            int area=heights[e]*(nse-pse-1);
            maxArea=Math.max(maxArea, area);
        }
        return maxArea;
    }
}

class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j=heights.length-1;
        int result=0;
        while(i<j){
            int w=j-i;
            int h=Math.min(heights[i],heights[j]);
            if(heights[i]>heights[j]){j--;}
            else i++;
            int area=h*w;
            result=Math.max(area,result);
        }
        return result;
    }
}

class Solution {
    public int maxArea(int[] heights) {
        if (heights.length == 0) return 0;
        int maxArea = 0;                int area = 0;
        for(int i = 0;i<heights.length;i++){
            for(int j = i + 1;j<heights.length;j++){

                int smallest;
                if(heights[i]<heights[j]){
                    smallest = heights[i];
                }else{
                    smallest = heights[j];
                }
                area = smallest * Math.abs(i-j);
                maxArea = Math.max(maxArea,area);
            }
        }
        return maxArea;
    }
}

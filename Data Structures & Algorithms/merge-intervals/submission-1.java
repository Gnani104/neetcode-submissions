class Solution {
    public int[][] merge(int[][] intervals) {
        //base case 
        int n = intervals.length;
        if(n == 1) return intervals;

        Arrays.sort(intervals, (a,b) -> a[0] - b[0] );
        // Use stack
        Stack<int[]> stack = new Stack<>();

        stack.push(intervals[0]);

        for(int i = 1;i < n;i++){
            int[] prev = stack.peek();
            int[] curr = intervals[i];
            if(prev[1] < curr[0]){
                stack.push(curr);
            } else {
                prev[1] = Math.max(curr[1], prev[1]);
            }
        }
        return stack.toArray(new int[stack.size()][2]);

    }
}

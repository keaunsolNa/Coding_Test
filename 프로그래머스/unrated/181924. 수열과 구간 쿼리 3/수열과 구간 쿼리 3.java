class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int i = 0; i < queries.length; i++) {
            
            int sta = queries[i][0];
            int end = queries[i][1];
            
            int temp = arr[sta];
            arr[sta] = arr[end];
            arr[end] = temp;
        }
        return arr;
    }
}
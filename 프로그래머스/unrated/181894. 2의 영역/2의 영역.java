class Solution {
    public int[] solution(int[] arr) {
        
        int sta = 0;
        int end = 0;
        boolean flag = true;
        for(int i = 0; i < arr.length; i++) {
            
            if(flag && arr[i] == 2) { sta = i; flag = false; }
            if(arr[i] == 2) end = i;
        }
        
        if(sta == 0 && end == 0) return new int[]{-1};
        
        int[] answer = new int[end - sta + 1];
        int temp = 0;
        for(int i = sta; i <= end; i++) answer[temp++] = arr[i];
            
        return answer;
    }
}
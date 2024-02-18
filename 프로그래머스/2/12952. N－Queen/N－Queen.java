class Solution {
    
    private static int count = 0;
    public int solution(int n) {
        makeArr(n);
        return(count);
    }
    
     public static void makeArr(int n) {
        int[] a = new int[n];
        countArr(a, 0);
    }
    
	
    public static void countArr(int[] q, int n) {
        int N = q.length;
        
        if (n == N) {
        	
            count++;
            
        } else {
        	
            for (int i = 0; i < N; i++) {
                q[n] = i;
                if (checking(q, n)) countArr(q, n + 1);   
            }
            
        }
    }
    
    public static boolean checking(int[] q, int n) {
    	
        for (int i = 0; i < n; i++) {
        	
            if (q[i] == q[n]) return false;   // 같은 열
            if ((q[i] - q[n]) == (n - i)) return false;   // '\' 방향
            if ((q[n] - q[i]) == (n - i)) return false;   // '/' 방향
            
        }
        
        return true;
    }
}
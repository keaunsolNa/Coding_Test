class Solution {
    public int solution(int a, int b) {
        
        return Integer.parseInt("" + a + b ) > Integer.parseInt("" + b + a) ? Integer.parseInt("" + a + b ) : Integer.parseInt("" + b + a);
    }
}
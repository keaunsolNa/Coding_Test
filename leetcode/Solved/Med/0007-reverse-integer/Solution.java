class Solution {
    public int reverse(int x) {
        
        StringBuilder sb = new StringBuilder();
        boolean isMinus = false;

        for (char c : String.valueOf(x).toCharArray()) {

            if (c == '-') isMinus = true;
            else sb.insert(0, c);
        }

        return Integer.parseInt(sb.toString()) * (isMinus ? -1 : 1);
    }
}
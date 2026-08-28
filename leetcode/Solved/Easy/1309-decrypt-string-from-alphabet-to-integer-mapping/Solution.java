import java.util.StringTokenizer;

class Solution {
    public String freqAlphabets(String s) {
        
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] == '#') {
                
                int temp = Integer.parseInt(arr[i - 1] + "" + arr[i - 2]);
                System.out.println(temp);

                char c = (char) (temp + '0');
                sb.append(c);
                i--;
            }

            else {
                
                char c = (char) (arr[i] + '0');
                sb.append(c);
            }
        }

        return sb.reverse().toString();
    }
}
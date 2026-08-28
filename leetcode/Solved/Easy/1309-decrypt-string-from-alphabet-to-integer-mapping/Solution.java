import java.util.StringTokenizer;

class Solution {
    public String freqAlphabets(String s) {
        
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] == '#') {
                
                int temp = Integer.parseInt(arr[i - 2] + "" + arr[i - 1]);
                System.out.println(temp);

                char c = (char) (temp + 97 + '0' );
                sb.append(c);
                i -= 2;
            }

            else {
                
                char c = (char) (arr[i] + '0');
                sb.append(c);
            }
        }

        return sb.reverse().toString();
    }
}
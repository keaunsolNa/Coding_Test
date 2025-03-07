import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        int[] arr1 = new int[] { str1.charAt(0) - 'a', str1.charAt(1) - '0' };
        String str2 = br.readLine();
        int[] arr2 = new int[] { str2.charAt(0) - 'a', str2.charAt(1) - '0' };

        int term1 = Math.abs(arr1[0] - arr2[0]);
        int term2 = Math.abs(arr1[1] - arr2[1]);

        bw.write(Math.min(term1, term2) + " " + Math.max(term1, term2));
        bw.flush();
        bw.close();
        br.close();
    }


}
import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
	
	
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int total = n % 2 == 0 ? (n / 2 * 3) - (n / 2 * 2) : ((n / 2 + 1) * 3) - (n / 2 * 2);
     
        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
        br.close();
   
    }
}

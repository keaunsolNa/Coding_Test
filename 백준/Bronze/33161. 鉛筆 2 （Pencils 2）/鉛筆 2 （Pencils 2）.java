import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
	
	
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
     
        bw.write(String.valueOf(n / 5));
        bw.flush();
        bw.close();
        br.close();
   
    }
}

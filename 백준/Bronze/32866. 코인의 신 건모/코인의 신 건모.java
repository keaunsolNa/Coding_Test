import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        double n = Double.parseDouble(br.readLine());
        double x = Double.parseDouble(br.readLine());
        
        double t = (n - n * x / 100);
        double y = (100 * (n - t)) / t;
        
        bw.write(String.format("%.6f", y));
        bw.flush();
        bw.close();
        br.close();
   
    }

}

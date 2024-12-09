import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int x = Integer.parseInt(br.readLine()) % 3;
       
        bw.write(x == 0 ? "S" : x == 1 ? "U" : "O");
        bw.flush();
        bw.close();
        br.close();
   
    }

}

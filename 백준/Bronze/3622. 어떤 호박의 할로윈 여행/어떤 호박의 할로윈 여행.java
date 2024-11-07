import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        if (A > P || B > P) bw.write("No");
        
        else if (A + B <= P) bw.write("Yes");
        
        else if (a >= B) bw.write("Yes");
        
        else if (b >= A) bw.write("Yes");
        
        else bw.write("No");
        	
     
        
        bw.flush();
        bw.close();
        br.close();

    }
    

}

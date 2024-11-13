import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int ax = Integer.parseInt(st.nextToken());
        int ay = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        
        int bx = Integer.parseInt(st.nextToken());
        int by = Integer.parseInt(st.nextToken());
        
        int answer = 2;
        
        if (ax == 0)
        {
        	if (bx == 0 && ay > by) answer = 3;
        	else answer = 1;
        }
        
        if (ay == 0)
        {
        	if (by == 0 && ax > bx) answer = 3;
        	else answer = 1;
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }
    
}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st =  new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int fizzBuzz = 0, fizz = 0, buzz = 0;
        
        for (int i = 1; i <= n; i++)
        {
        	if (i % a == 0 && i % b == 0) fizzBuzz++;
        	else if (i % a == 0) fizz++;
        	else if (i % b == 0) buzz++;
        }
        
        
        bw.write(fizz + " " + buzz+ " " + fizzBuzz);
        bw.flush();
        bw.close();
        br.close();

    }
    
    
}

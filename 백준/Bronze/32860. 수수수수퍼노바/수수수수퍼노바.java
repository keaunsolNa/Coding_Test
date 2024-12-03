import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int year = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        
        String an = "SN " + year;
        if (num <= 26)
        {
        	an += (char) (num + 'A' - 1);
        }
        else 
        {
        	
        	an += (char)(((num - 1) / 26) + 'a' - 1);
        	an += (char)(((num - 1) % 26 + 1) + 'a' - 1);
        	
        }
        
    
        bw.write(an);
        bw.flush();
        bw.close();
        br.close();

    }


}

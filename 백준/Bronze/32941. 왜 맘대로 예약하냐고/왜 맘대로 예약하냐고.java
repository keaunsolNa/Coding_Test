import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
       
        int t = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        
        int n = Integer.parseInt(br.readLine());
        boolean flag = true;
        while (n --> 0)
        {
        	int k = Integer.parseInt(br.readLine());
        	st = new StringTokenizer(br.readLine());
        	boolean inFlag = false;
        	
        	while (k --> 0)
        	{
        		int temp = Integer.parseInt(st.nextToken());
        		if (temp == x) 
        		{
        			inFlag = true;
        			break;
        		}
        	}
        	
        	if (!inFlag) 
        	{
        		flag = false;
        	}
        }
        
        bw.write(flag ? "YES" : "NO");
        bw.flush();
        bw.close();
        br.close();
   
    }

    
}

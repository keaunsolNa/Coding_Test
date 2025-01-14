import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
	
	
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] nArr = new int[n];
        int[] mArr = new int[m];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) nArr[i] = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) mArr[i] = Integer.parseInt(st.nextToken());
        
        long total = 0;
        
        for (int i = 0; i < n; i++)
        {
        	
        	for (int j = 0; j < m; j++)
        	{
        		
        		int hab = nArr[i] + mArr[j];
        		total += (hab * Math.max(nArr[i], mArr[j]));
        	}
        }
        
        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
        br.close();
   
    }
}

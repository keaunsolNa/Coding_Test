import java.io.*;
import java.math.BigInteger;

public class Main {
	
	
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input = "";
        
        while (!(input = br.readLine()).equals("0"))
        {
        	
        	char[] arr = input.toCharArray();
        
        	char prev = arr[0];
        	int cnt = 1;
        	for (int i = 1; i < arr.length; i++)
        	{
        		
        		if (arr[i] != prev)
        		{
        			sb.append(cnt + "" + prev);
        			prev = arr[i];
        			cnt = 1;
        		}
        		else
        		{
        			cnt++;
        		}
        		
        		if (i == arr.length - 1)
        		{
        			sb.append(cnt + "" + prev);
        		}
        	}
        	
        	bw.write(sb + "\n");
        	sb.setLength(0);
        }
        
        bw.flush();
        bw.close();
        br.close();
   
    }
}

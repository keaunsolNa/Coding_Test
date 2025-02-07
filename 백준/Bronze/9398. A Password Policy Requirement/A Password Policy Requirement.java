import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	
	
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        
        while(n --> 0)
        {
        	
        	String input = br.readLine();
        	boolean flag = false;
        	for (int i = 6; i <= input.length(); i++)
        	{
        		
        		for (int j = 0; j <= input.length() - i; j++)
        		{
        			char[] token = input.substring(j, j + i).toCharArray();
        			
        			boolean flag1 = false, flag2 = false, flag3 = false;
        			
        			for (char c : token)
        			{
        				int temp = (int) c;
        				if (flag1 || (temp >= 97 && temp <= 122)) flag1 = true;
        				if (flag2 || (temp >= 65 && temp <= 90)) flag2 = true;
        				if (flag3 || (temp >= 48 && temp <= 57)) flag3 = true;
        				
        				if (flag1 && flag2 && flag3)
        				{
        					flag = true;
        					break;
        				}
        			}
        			
        			if (flag) break;
        		}
        		
        		if (flag)
        		{
        			bw.write(i + "\n");
        			break;
        		}
        	}
        	
        	if (!flag) bw.write("0\n");
        }
        
        
        bw.flush();
        bw.close();
        br.close();
   
    }
}

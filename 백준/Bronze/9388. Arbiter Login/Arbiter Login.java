import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	
	
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
       
        for (int i = 1; i <= n; i++)
        {
        	
        	st = new StringTokenizer(br.readLine());
        	String original = st.nextToken();
        	String target = st.nextToken();
        	
        	if (original.equals(target))
        	{
        		bw.write("Case " + i + ": Login successful.\n");
        	}
        	else
        	{
        		StringBuilder withCapsLock = new StringBuilder();
        		StringBuilder withNumLock = new StringBuilder();
        		StringBuilder withCapsAndNumLock = new StringBuilder();

        		for (int t = 0; t < original.length(); t++)
        		{

        			int temp = (int) original.charAt(t);
        			
        			// 대문자
        			if (temp >= 65 && temp <= 90)
        			{
        				withCapsLock.append((char) (temp + 32));
        				withNumLock.append(original.charAt(t));
        				withCapsAndNumLock.append((char) (temp + 32));
        			}
        			// 소문자
        			else if (temp >= 97 && temp <= 122)
        			{
        				withCapsLock.append((char) (temp - 32));
        				withNumLock.append(original.charAt(t));
        				withCapsAndNumLock.append((char) (temp - 32));
        				
        			}
        			// 숫자
        			else if (temp >= 48 && temp <= 57)
        			{
        				withCapsLock.append(original.charAt(t));
        			}
        			else 
        			{
        				withCapsLock.append(original.charAt(t));
        				withNumLock.append(original.charAt(t));
        				withCapsAndNumLock.append(original.charAt(t));        				
        			}
        		}
        		
        		if (withCapsLock.toString().equals(target)) bw.write("Case " + i + ": Wrong password. Please, check your caps lock key.\n");
        		else if (withNumLock.toString().equals(target)) bw.write("Case " + i + ": Wrong password. Please, check your num lock key.\n");
        		else if (withCapsAndNumLock.toString().equals(target)) bw.write("Case " + i + ": Wrong password. Please, check your caps lock and num lock keys.\n");
        		else bw.write("Case " + i + ": Wrong password.\n");
        		
        		
        	}
        }

        
        bw.flush();
        bw.close();
        br.close();
   
    }
}

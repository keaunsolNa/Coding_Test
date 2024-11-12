import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
      
        if (isPal(input))
        {
        	bw.write("AKARAKA");
        }
        
        else
        {
        	bw.write("IPSELENTI");
        }
        

        bw.flush();
        bw.close();
        br.close();
    }
    

    private static boolean isPal (String input)
    {
    	
    	if (input.length() == 1) return true;
    	
    	boolean result = false;
    	String prefix, suffix;
    	
    	if (input.length() % 2 == 0)
    	{
    		prefix = input.substring(0, input.length() / 2);
    		suffix = input.substring(input.length() / 2, input.length());
    	}
    	else
    	{
    		prefix = input.substring(0, input.length() / 2);
    		suffix = input.substring(input.length() / 2 + 1, input.length());
    	}
    	
    	char[] arr = input.toCharArray();
    	for (int i = 0; i < arr.length; i++)
    	{
    		
    		if (arr[i] != arr[arr.length - 1 - i])
    		{
    			return false;
    		}
    	}
    	
    	if (isPal(prefix) && isPal(suffix))
    	{
    		result = true;
    	}
    	
    	return result;
    }
}

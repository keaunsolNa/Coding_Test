import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        	
        String[] str = br.readLine().trim().split("\\+");
        
        if (str.length != 2)
        {
        	bw.write("No Money");
        }

        else if (str[0].startsWith("0") || str[1].startsWith("0"))
        {
        	bw.write("No Money");
        }
        
        else if (str[0].equals(str[1])) 
        {
        	
        	try 
        	{
            	Integer.parseInt(str[0]);        		
            	bw.write("CUTE");
        	}
        	
        	catch (NumberFormatException e)
        	{
        		bw.write("No Money");
        	}

        }
        
        else 
        {
        	bw.write("No Money");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}

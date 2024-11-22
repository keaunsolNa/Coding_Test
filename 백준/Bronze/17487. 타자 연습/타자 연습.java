import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] input = br.readLine().toCharArray();
        
        int left = 0, right = 0, temp = 0;
        
        for (char c : input)
        {
        	
        	if (c == ' ')
        	{
        		temp++;
        	}
        	
        	else if ((int)c >= 65 && (int)c <= 90)
        	{
        		temp++;
        		char lowerCase = (char) ((int)c + 32);
        		
        		if (leftOrRight(lowerCase)) right++;
        		else left++;
        	}
        	else
        	{
        		if (leftOrRight(c)) right++;
        		else left++;
        	}
        }
        
        while (temp --> 0)
        {
        	if (left > right) right++;
        	else left++;
        		
        }
        
        bw.write(left + " " + right);
        bw.flush();
        bw.close();
        br.close();

    }
    
    private static boolean leftOrRight(char c) {
    	
    	switch (c)
    	{
	    	case 'q' :
	    	case 'w' :
	    	case 'e' :
	    	case 'r' :
	    	case 't' :
	    	case 'y' :
	    	case 'a' :
	    	case 's' :
	    	case 'd' :
	    	case 'f' :
	    	case 'g' :
	    	case 'z' :
	    	case 'x' :
	    	case 'c' :
	    	case 'v' :
	    	case 'b' :
	    		
	    		return false;
    	}
    	
    	return true;
    }
}

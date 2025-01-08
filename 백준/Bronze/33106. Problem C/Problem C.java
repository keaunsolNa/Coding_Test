import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb;
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        while (n --> 0)
        {
        	
        	char[] input = br.readLine().toCharArray();
        	sb = new StringBuilder();
        	for (int i = 0; i < input.length; i++)
        	{
        		
        		if (input[i] == 'c' && i < input.length - 1)
        		{
        			
        			switch(input[i + 1])
        			{
        				case 'e' :
        				case 'i' :
        				case 'y' : sb.append('s'); break;
        				
        				case 'h' : sb.append('c'); i++; break;
        				
        				default : sb.append('k'); 
        					
        			}
        		}
        		else if (input[i] == 'c' && i == input.length - 1)
        		{
        			sb.append('k');
        		}
        		else
        		{
        			sb.append(input[i]);
        		}
        		
        	}
        	
        	bw.write(sb + "\n");
        }
        
        
        bw.flush();
        bw.close();
        br.close();
   
    }
    
}

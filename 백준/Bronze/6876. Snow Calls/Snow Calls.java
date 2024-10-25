import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        

        int n = Integer.parseInt(br.readLine());
        
        while (n --> 0)
        {
        	
        	char[] input = br.readLine().toCharArray();
    		StringBuilder sb = new StringBuilder();
    		
        	for (char c : input)
        	{
        		
        		int target = (int) c;
        		
        		if ((target >= 48 && target <= 57)) 
        		{
        			sb.append(c);
        		}
        		else
        		{
        			
        			switch(c)
        			{
        			case 'A' :
        			case 'B' :
        			case 'C' : sb.append(2);
        			break;
        			
        			case 'D' :
        			case 'E' :
        			case 'F' : sb.append(3);
        			break;

        			case 'G' :
        			case 'H' :
        			case 'I' : sb.append(4);
        			break;
        			
        			case 'J' :
        			case 'K' :
        			case 'L' : sb.append(5);
        			break;
        			
        			case 'M' :
        			case 'N' :
        			case 'O' : sb.append(6);
        			break;
        			
        			case 'P' :
        			case 'Q' :
        			case 'R' :
        			case 'S' : sb.append(7);
        			break;
        			
        			case 'T' :
        			case 'U' :
        			case 'V' : sb.append(8);
        			break;
        			
        			case 'W' :
        			case 'X' :
        			case 'Y' :
        			case 'Z' : sb.append(9);
        			break;
        			}
        		}
        	}

        	
        	sb = sb.insert(3, "-");
        	sb = sb.insert(7, "-");
        	bw.write(sb.toString().substring(0, 12));
        	bw.write("\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }


}

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringBuilder sb;
    	
        while (true)
        {
        	
        	int n = Integer.parseInt(br.readLine());
        	
        	if (n == 0) break;
        	
        	List<Character[]> list = new ArrayList<>();
        	char[][] map = new char[n][n];
        	char[] input = br.readLine().toCharArray();
        	
        	for (int i = 0; i < input.length / n; i++)
        	{
        		
        		Character[] temp = new Character[n];
        		for (int j = 0; j < n; j++)
        		{
        			
        			if (i % 2 == 0)
        			{
            			temp[j] = input[i * n + j];        				
        			}

        			else
        			{
        				temp[n - j - 1] = input[i * n + j];
        			}
        		}
        		list.add(temp);
        	}
        	
        	sb = new StringBuilder();

        	
        	for (int i = 0; i < n; i++)
        	{
        		
        		for (int j = 0; j < list.size(); j++)
        		{
        			
    				sb.append(list.get(j)[i]);
        		}
        	}

        	bw.write(sb.toString() + "\n");
        	
        }
       
        
        bw.flush();
        bw.close();
        br.close();

    }
    
}

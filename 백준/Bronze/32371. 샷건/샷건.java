import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][] map = new char[4][];
        
        for (int i = 0; i < 4; i++)
        {
        	map[i] = br.readLine().toCharArray();
        }
        
        
        char[] input = br.readLine().toCharArray();
        
        List<Integer> listX = new ArrayList<>();
        List<Integer> listY = new ArrayList<>();
        
        for (char c : input)
        {
        	
        	for (int i = 0; i < 4; i++)
        	{
        		
        		for (int j = 0; j < map[i].length; j++)
        		{
        			if (c == map[i][j])
        			{
        				if (!listX.contains(i)) listX.add(i);
        				if (!listY.contains(j)) listY.add(j);
        			}
        		}
        	}
        }

        Collections.sort(listX);
        Collections.sort(listY);
        
        bw.write(String.valueOf(map[listX.get(1)][listY.get(1)]));
        bw.flush();
        bw.close();
        br.close();
    }
    
}

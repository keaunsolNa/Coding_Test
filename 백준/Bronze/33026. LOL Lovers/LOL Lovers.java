import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();
        int l = 0, o = 0;
        for (char c : input)
        {
        	if (c == 'L') l++;
        	else o++;
        }

        int leftL = 0, leftO = 0, rightL = l, rightO = o;
        boolean flag = false;
        for (int i = 0; i < n; i++)
        {
        	
        	if (input[i] == 'L')
        	{
        		leftL++;
        		rightL--;
        	}
        	else 
        	{
        		leftO++;
        		rightO--;
        	}
        	
        	if ((leftL > 0 || leftO > 0) && (rightL > 0 || rightO > 0))
        	{
        		if (leftL != rightL && leftO != rightO)
        		{
        			flag = true;
        			bw.write(String.valueOf(i + 1));
        			break;
        		}
        	}
        }
        
        if (!flag) bw.write("-1");
        bw.flush();
        bw.close();
        br.close();
   
    }

    
}

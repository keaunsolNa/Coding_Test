import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[][] inputs = new char[5][];
        
        for (int i = 0; i < 5; i++)
        {
        	inputs[i] = br.readLine().toCharArray();;
        }
        

        int len = inputs[0].length;
        int idx = 0;
        String[] answer = new String[len];
        
        for (int i = 0; i < len; i++)
        {

        	StringBuilder temp = new StringBuilder();
        	for (int j = 0; j < 5; j++)
        	{
        		temp.append(inputs[j][i]);
        	}
        	
        	switch(temp.toString())
        	{
        		case ".omln" : answer[idx++] = "owln.\n"; break;
        		case "owln." : answer[idx++] = ".omln\n"; break;
        		default : answer[idx++] = "..oLn"; break;
        	}
        
        }
        	
        for (int i = 0; i < len; i++)
        {
        	
        	for (int j = 0; j < 5; j++)
        	{
        		inputs[j][i] = answer[i].charAt(j);
        	}
        }
   
        for (char[] cc : inputs)
        {
        	for (char c : cc)
        	{
        		bw.write(String.valueOf(c));
        	}
        	bw.write("\n");
        }
    	
        bw.flush();
        bw.close();
        br.close();

    }


}

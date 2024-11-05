import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] exercises = new String[n];
        for (int i = 0; i < n; i++)
        {
        	
        	String input = br.readLine();
        	
        	if (input.contains("rest"))
        	{
        		exercises[i] = "😎";
        	}
        	
        	else if (input.contains("leg"))
        	{
        		exercises[i] = "🦵";        		
        	}
        	
        	else 
        	{
        		exercises[i] = "💪";
        	}
        }

        int idx = 0;
        for (int i = 1; i <= 31; i++)
        {
        
        	bw.write(exercises[idx++]);
        	if (idx % n == 0) idx = 0;
        	if (i % 7 == 0) bw.write("\n");
        	
        }

        bw.flush();
        bw.close();
        br.close();

    }
    

}

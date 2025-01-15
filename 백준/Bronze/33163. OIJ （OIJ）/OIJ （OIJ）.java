import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
	
	
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();
        
        for (char c : input)
        {
        	
        	if (c == 'J') sb.append('O');
        	else if (c == 'O') sb.append('I');
        	else if (c == 'I') sb.append('J');
        }
      
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
   
    }
}

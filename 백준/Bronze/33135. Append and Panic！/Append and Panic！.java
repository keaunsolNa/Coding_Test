import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
        String input = br.readLine();
        int mid = input.length() % 2 == 0 ? input.length() / 2 : input.length() / 2 + 1;
        
        while (true)
        {
        	
        	boolean[] alp = new boolean[26];
        	char[] prev = input.substring(0,  mid).toCharArray(); 
        	StringBuilder makePrev = new StringBuilder();
        	
        	for (char c : prev)
        	{
        		if (alp[c - 'A']) continue;
        		alp[c - 'A'] = true;
        		makePrev.append(c);
        	}

        	char[] sortPrev = makePrev.toString().toCharArray();
        	Arrays.sort(sortPrev);
        	
			makePrev = new StringBuilder();
        	for (char c : sortPrev)
        	{
        		makePrev.append(c);
        	}
        	
        	String after = input.substring(mid);
        	if (makePrev.toString().equals(after)) break;

        	mid++;
        }
        
        bw.write(String.valueOf(mid));
        bw.flush();
        bw.close();
        br.close();
   
    }
    
}

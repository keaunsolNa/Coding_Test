import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= n; i++)
        {
        	
        	st = new StringTokenizer(br.readLine());
        	bw.write("Case " + i + ": ");
        	
        	while (st.hasMoreTokens())
        	{
        		
        		String token = st.nextToken();
        		switch(token)
        		{
        			case ".-" : bw.write("A"); break;
        			case "-..." : bw.write("B"); break;
        			case "-.-." : bw.write("C"); break;
        			case "-.." : bw.write("D"); break;
        			case "." : bw.write("E"); break;
        			case "..-." : bw.write("F"); break;
        			case "--." : bw.write("G"); break;
        			case "...." : bw.write("H"); break;
        			case ".." : bw.write("I"); break;
        			case ".---" : bw.write("J"); break;
        			case "-.-" : bw.write("K"); break;
        			case ".-.." : bw.write("L"); break;
        			case "--" : bw.write("M"); break;
        			case "-." : bw.write("N"); break;
        			case "---" : bw.write("O"); break;
        			case ".--." : bw.write("P"); break;
        			case "--.-"	: bw.write("Q"); break;
        			case ".-." : bw.write("R"); break;
        			case "..." : bw.write("S"); break;
        			case "-" : bw.write("T"); break;
        			case "..-" : bw.write("U"); break;
        			case "...-" : bw.write("V"); break;
        			case ".--" : bw.write("W"); break;
        			case "-..-" : bw.write("X"); break;
        			case "-.--" : bw.write("Y"); break;
        			case "--.." : bw.write("Z"); break;
        		}
        	}
    		bw.write("\n");
        }
    	
        bw.flush();
        bw.close();
        br.close();

    }


}

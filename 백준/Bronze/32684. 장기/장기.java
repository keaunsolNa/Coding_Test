import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        double total1 = 0;
        double total2 = 1.5;
        
        for (int i = 0; i < 6; i++)
        {
        	int temp = Integer.parseInt(st.nextToken());
        	
        	switch(i)
        	{
        		case 0 : total1 += temp * 13; break;
        		case 1 : total1 += temp * 7; break;
        		case 2 : total1 += temp * 5; break;
        		case 3 : total1 += temp * 3; break;
        		case 4 : total1 += temp * 3; break;
        		case 5 : total1 += temp * 2; break;
        	}
        }
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++)
        {
        	int temp = Integer.parseInt(st.nextToken());
        	
        	switch(i)
        	{
        		case 0 : total2 += temp * 13; break;
        		case 1 : total2 += temp * 7; break;
        		case 2 : total2 += temp * 5; break;
        		case 3 : total2 += temp * 3; break;
        		case 4 : total2 += temp * 3; break;
        		case 5 : total2 += temp * 2; break;
        	}
        }
        
        bw.write(total1 > total2 ? "cocjr0208" : "ekwoo");
        bw.flush();
        bw.close();
        br.close();
    }
    
}

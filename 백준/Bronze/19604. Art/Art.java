import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxY = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++)
        {
        	
        	st = new StringTokenizer(br.readLine() , ",");
        	int x = Integer.parseInt(st.nextToken());
        	int y = Integer.parseInt(st.nextToken());

        	minX = Math.min(x, minX);
        	maxX = Math.max(x, maxX);
        	minY = Math.min(y, minY);
        	maxY = Math.max(y, maxY);
        	
        }

        bw.write((minX - 1) + "," + (minY - 1) + "\n");
        bw.write((maxX + 1) + "," + (maxY + 1) + "\n");
        bw.flush();
        bw.close();
        br.close();
   
    }

    
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st;

    	int n = Integer.parseInt(br.readLine());
    	List<String> list = new ArrayList<>();
    	while (n --> 0) list.add(br.readLine());
    	
    	int m = Integer.parseInt(br.readLine());
    	int cnt = 0;
    	while (m --> 0) if (list.contains(br.readLine())) cnt++;
    		
    	System.out.println(cnt);
    }
    
    
}

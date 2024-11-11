import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        Map<Integer, Integer> map = new LinkedHashMap<>();
        	
        int n = Integer.parseInt(br.readLine());
        while (n --> 0)
        {
        	
        	st = new StringTokenizer(br.readLine());
        	int key = Integer.parseInt(st.nextToken());
        	int value = Integer.parseInt(st.nextToken());
        	
        	map.put(key, map.getOrDefault(key, 0) + value);
        			
        }

        bw.write(map.size() + "\n");
        for (Integer key : map.keySet())
        {
        	
        	bw.write(key + " " + map.get(key) + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();

    }
}

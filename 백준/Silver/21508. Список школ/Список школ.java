import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        	
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        
        while (n --> 0)
        {
        	
        	String numStr = br.readLine().replaceAll("[ a-zA-Z]", "");
        	map.put(numStr, map.getOrDefault(numStr, 0) + 1);

        }
        
        List<String> list = new ArrayList<>();
        for (String key : map.keySet())
        {
        	if (map.get(key) >= 1 && map.get(key) <= 5) 
        	{
        		list.add(key);
        	}
        }
        
        bw.write(list.size() + "\n");
        
        for (String key : list)
        {
        	bw.write(key + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();

    }
}

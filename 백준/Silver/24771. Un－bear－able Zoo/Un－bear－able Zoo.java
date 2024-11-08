import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int idx = 1;
        
        while (true)
        {

        	int n = Integer.parseInt(br.readLine());
        	if (n == 0) break;
        	
        	Map<String, Integer> map = new TreeMap<>();

        	while (n --> 0)
        	{
        		String[] input = br.readLine().split(" ");
        		
        		String key = input[input.length - 1].toLowerCase();
        		map.put(key, map.getOrDefault(key, 0) + 1);
        	}
        	
        	bw.write("List " + idx++ + ":\n");
        	for (String key : map.keySet())
        	{
        		bw.write(key + " | " + map.get(key) + "\n");
        	}
        }
        
        bw.flush();
        bw.close();
        br.close();

    }
    

}

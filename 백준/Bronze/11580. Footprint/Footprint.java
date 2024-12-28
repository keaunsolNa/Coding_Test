import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

	private static int[] point;
	private static Map<Integer, Set<Integer>> xMap;
	private static Set<Integer> yList;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int l = Integer.parseInt(br.readLine());
        char[] order = br.readLine().toCharArray();
        xMap = new HashMap<>(); 
        yList = new HashSet<>();
        yList.add(0);
        xMap.put(0, yList);
        
        point = new int[] {0, 0};
        for (char c : order)
        {
        	switch(c)
        	{
        		case 'E' : point[0]++; putMap(); break;
        		case 'W' : point[0]--; putMap(); break;
        		case 'S' : point[1]--; putMap(); break;
        		case 'N' : point[1]++; putMap(); break;
        	}
        }

        int total = 0;
        for (Integer key : xMap.keySet())
        {
        	total += xMap.get(key).size();
        	
        }
        
        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
        br.close();
   
    }

    private static void putMap()
    {
    	if (xMap.containsKey(point[0]))
		{
			xMap.get(point[0]).add(point[1]);
		}
		else
		{
			yList = new HashSet<>();
			yList.add(point[1]);
			xMap.put(point[0], yList);
		} 
    	
    }
    
}

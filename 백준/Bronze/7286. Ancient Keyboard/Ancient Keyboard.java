import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int tc = Integer.parseInt(br.readLine());

        while (tc --> 0)
        {
        	
            Map<Integer, Set<Character>> map = new HashMap<>();        	
        	int n = Integer.parseInt(br.readLine());
        	int minTime = 10001;
        	int maxTime = 0;
        	
        	for (int i = 0; i < n; i++)
        	{
        		
        		st = new StringTokenizer(br.readLine());
        		char alp = st.nextToken().charAt(0);
        		int start = Integer.parseInt(st.nextToken());
        		int end = Integer.parseInt(st.nextToken());
        		minTime = Math.min(minTime, start + 1);
        		maxTime = Math.max(maxTime, end);
        		
        		for (int s = start + 1; s <= end; s++)
        		{
        			
        			if (map.containsKey(s))
        			{
        				map.get(s).add(alp);
        			}
        			else
        			{
        				Set<Character> set = new HashSet<>();
        				set.add(alp);
        				map.put(s, set);
        			}
        		}
        		
        	}
        	
        	for (int i = minTime; i <= maxTime; i++)
        	{
        		
        		if (map.containsKey(i))
        		{
        			bw.write((map.get(i).size() - 1 + 'A'));
        		}
        	}
        	bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }


}

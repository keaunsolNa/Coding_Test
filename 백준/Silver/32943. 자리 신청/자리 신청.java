import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

	private static class Log implements Comparable<Log>
	{
		
		private int time;
		private int seat;
		private int number;
		
		public Log(int time, int seat, int number)
		{
			this.time = time;
			this.seat = seat;
			this.number = number;
		}

		@Override
		public int compareTo(Log o) 
		{
			return Integer.compare(this.time, o.time);
		}
		
	}
	
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        boolean[] seat = new boolean[c + 1];
        Map<Integer, Integer> stuMap = new TreeMap<>();
        
        PriorityQueue<Log> pq = new PriorityQueue<>();
        
        while (k --> 0)
        {
        	st = new StringTokenizer(br.readLine());
        	int t = Integer.parseInt(st.nextToken());
        	int s = Integer.parseInt(st.nextToken());
        	int n = Integer.parseInt(st.nextToken());

        	pq.add(new Log(t, s, n));
        	
        }
        
        while (!pq.isEmpty())
        {
        	Log log = pq.poll();
        	if(!seat[log.seat]) 
        	{
        		seat[log.seat] = true;
        		if (stuMap.containsKey(log.number))
        		{
        			seat[stuMap.get(log.number)] = false;
        		}
        		
    			stuMap.put(log.number, log.seat);
        	}
        }

        for (Integer key : stuMap.keySet())
        {
        	bw.write(key + " " + stuMap.get(key) + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
   
    }

    
}

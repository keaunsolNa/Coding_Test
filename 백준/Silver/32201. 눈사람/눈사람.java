import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

	private static class Result implements Comparable<Result> {
		
		private int number;
		private int secondRate;
		private int resultRate;
		
		public Result(int number, int firstRate, int secondRate)
		{
			this.number = number;
			this.secondRate = secondRate;
			this.resultRate = firstRate - secondRate;
		}

		@Override
		public int compareTo(Result o) {
			
			if (this.resultRate == o.resultRate)
			{
				return Integer.compare(this.secondRate, o.secondRate);
			}
			return Integer.compare(o.resultRate, this.resultRate);
		}
		
		
	}
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	StringTokenizer st2 = new StringTokenizer(br.readLine());

    	Map<Integer, Integer> first = new HashMap<>();
    	Map<Integer, Integer> second = new HashMap<>();    	
        
        for (int i = 0; i < n; i++)
        {

        	first.put(Integer.parseInt(st.nextToken()), i);
        	second.put(Integer.parseInt(st2.nextToken()), i);
        }

        PriorityQueue<Result> pq = new PriorityQueue<>();
        
        for (Integer key : second.keySet())
        {
        	pq.add(new Result(key, first.get(key), second.get(key)));
        }
        
        int maxWin = pq.peek().resultRate;
        
        while (!pq.isEmpty())
        {
        	Result res = pq.poll();
        	if (maxWin > res.resultRate) break;
        	bw.write(res.number + " ");
        }
        
        bw.flush();
        bw.close();
        br.close();
   
    }
    
}

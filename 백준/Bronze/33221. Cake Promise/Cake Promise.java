import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Main {

	private static class TeamsScore implements Comparable<TeamsScore>{
		
		int score;
		int totalTime;
		
		public TeamsScore(int score, int totalTime)
		{
			this.score = score;
			this.totalTime = totalTime;
		}

		@Override
		public int compareTo(Main.TeamsScore o) {
			
			if (this.score == o.score) return Integer.compare(this.totalTime, o.totalTime);
			else return Integer.compare(this.score, o.score);
		}
	}
	
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        PriorityQueue<TeamsScore> pq = new PriorityQueue<>();
        
        TeamsScore professor = new TeamsScore(0, 0);

    	st = new StringTokenizer(br.readLine());
    	n--;

    	int score = 0;
    	int totalTime = 0;

    	while (st.hasMoreTokens())
    	{
    		String target = st.nextToken();

    		if (!target.equals("X"))
    		{
    			score++;
    			totalTime += Integer.parseInt(target);
    		}
    	}

    	professor.score = score;
    	professor.totalTime = totalTime;

        while (n --> 0)
        {
        	
        	st = new StringTokenizer(br.readLine());
        	score = 0;
        	totalTime = 0;
        	while (st.hasMoreTokens())
        	{

        		String target = st.nextToken();
        		if (!target.equals("X"))
        		{
        			score++;
        			totalTime += Integer.parseInt(target);
        		}
        	}
        	
        	pq.add(new TeamsScore(score, totalTime));
        }

        int winner = 0;
        
        while (!pq.isEmpty())
        {
        	
        	TeamsScore student = pq.poll();
        	if (professor.score < student.score) winner++;
        	else if (professor.score == student.score && professor.totalTime > student.totalTime) winner++;
        	else if (professor.score == student.score && professor.totalTime == student.totalTime) winner++;
        }
        
        bw.write(String.valueOf(winner));
        bw.flush();
        bw.close();
        br.close();
   
    }
}

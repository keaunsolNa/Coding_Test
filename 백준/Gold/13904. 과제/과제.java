import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    	private static class Assignment implements Comparable<Assignment> {
		
		int day;
		int point;
		
		Assignment(int day, int point) {
			this.day = day;
			this.point = point;
		}
		
		@Override
		public int compareTo(Assignment o) {

			if(this.point == o.point) {
				return this.day - o.day;
			}
			
			return o.point - this.point;
		}
		
	}
    
   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
	
		int N = Integer.parseInt(br.readLine());
		List<Assignment> list = new ArrayList<>();
		
		int maxD = 0;
		while(N --> 0) {
			
			st = new StringTokenizer(br.readLine());
			
			int d = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			list.add(new Assignment(d, w));
			maxD = Math.max(maxD, d);
			
		}
		
		int answer = 0;
		for(int i = maxD; i > 0; i--) answer += solve(list, i);
		
		
		System.out.println(answer);
   }
    
    public static int solve(List<Assignment> assignmentList, int now) {
	
		int idx = -1;
	    int result = 0;
	    
	    for (int i = 0; i < assignmentList.size(); i++) {
	    
	    	if (assignmentList.get(i).day >= now && result < assignmentList.get(i).point) {
	    		idx = i;
	    		result = assignmentList.get(i).point;
	    	}
	    }
	    
	    if (result == 0) return 0;

	    assignmentList.remove(idx);
	    return result;
	  
	}
}
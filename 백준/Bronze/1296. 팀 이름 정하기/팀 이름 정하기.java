import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	private static long yeonL = 0;
	private static long yeonO = 0;
	private static long yeonV = 0;
	private static long yeonE = 0;

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String yendo = br.readLine();
		countYeodoChar(yendo);
		
		int N = Integer.parseInt(br.readLine());
		long maxPoint = -1;
		String winner = "";
		for(int i = 0; i < N; i++) {
			
			String teamName = br.readLine();
			long temp = countChar(teamName);
			
			if(maxPoint < temp) {
				
				winner = teamName;
				maxPoint = temp;

			} else if(maxPoint == temp) {
			
				List<String> sortList = new ArrayList<>();
				
				sortList.add(winner);
				sortList.add(teamName);
				
				Collections.sort(sortList);
				
				winner = sortList.get(0);
			}
			
		}
		
		System.out.println(winner);
		
	}

    public static void countYeodoChar(String str) {
    	
    	yeonL = str.chars()
		 		.filter(c -> c == 'L')
		 		.count();
    	yeonO = str.chars()
		 		.filter(c -> c == 'O')
		 		.count(); 
    	yeonV = str.chars()
		 		.filter(c -> c == 'V')
		 		.count(); 
    	yeonE = str.chars()
		 		.filter(c -> c == 'E')
		 		.count();    	
    	
    }

    public static long countChar(String str) {
    	
	        long longL = str.chars()
	        		 		.filter(c -> c == 'L')
	        		 		.count() + yeonL;
	        long longO = str.chars()
	        			    .filter(c -> c == 'O')
	        			    .count() + yeonO;
	        long longV = str.chars()
	        				.filter(c -> c == 'V')
	        				.count() + yeonV;
	        long longE = str.chars()
	        				.filter(c -> c == 'E')
	        				.count() + yeonE;
	        
	        return ((longL + longO) * (longL + longV) * (longL + longE) * (longO + longV) * (longO + longE) * (longV + longE)) % 100;
    }
}

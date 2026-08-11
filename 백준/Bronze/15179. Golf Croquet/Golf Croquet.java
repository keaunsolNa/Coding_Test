import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		String team1 = br.readLine();
		String team2 = br.readLine();
		
		int S = Integer.parseInt(br.readLine());
		
		String input = br.readLine();
		
		int team1S = 0;
		int team2S = 0;

		for(int i = 0; i < S; i++) {
			
			char temp = input.charAt(i);
			
			if(i % 2 == 0) {
				
				team1S += (temp == 'H') ? 1 : 0;
				team1S += (temp == 'D') ? (team1S == 6) ? 1 : 2 : 0;
				team2S += (temp == 'O') ? 1 : 0;
			}
			
			else {
				
				team2S += (temp == 'H') ? 1 : 0;
				team2S += (temp == 'D') ? (team2S == 6) ? 1 : 2 : 0;
				team1S += (temp == 'O') ? 1 : 0;
				
			}
			
			if(team1S >= 7 || team2S >= 7) break;
			
		}
		
		
		System.out.print(team1 + " " + team1S + " " + team2 + " " + team2S + ". ");
		if(team1S >= 7) System.out.println(team1 + " has won.");
		else if(team2S >= 7) System.out.println(team2 + " has won.");
		else if(team1S > team2S) System.out.print(team1 + " is winning.");
		else if(team1S < team2S) System.out.println(team2 + " is winning.");
		else System.out.println("All square.");
	}
}

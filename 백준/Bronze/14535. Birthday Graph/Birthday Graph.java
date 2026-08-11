import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int TC = 1;
		
		while(true) {
			
			int N = Integer.parseInt(br.readLine().replaceAll(" ", ""));
			if(N == 0) break;
			
			String Jan = "Jan:";
			String Feb = "Feb:";
			String Mar = "Mar:";
			String Apr = "Apr:";
			String May = "May:";
			String Jun = "Jun:";
			String Jul = "Jul:";
			String Aug = "Aug:";
			String Sep = "Sep:";
			String Oct = "Oct:";
			String Nov = "Nov:";
			String Dec = "Dec:";
			
			while(N --> 0) {
				

				st = new StringTokenizer(br.readLine());
				int day = Integer.parseInt(st.nextToken());
				int month = Integer.parseInt(st.nextToken());
				int year = Integer.parseInt(st.nextToken());
				
				switch(month) {
				
					case 1 : Jan += "*"; break;
					case 2 : Feb += "*"; break;
					case 3 : Mar += "*"; break;
					case 4 : Apr += "*"; break;
					case 5 : May += "*"; break;
					case 6 : Jun += "*"; break;
					case 7 : Jul += "*"; break;
					case 8 : Aug += "*"; break;
					case 9 : Sep += "*"; break;
					case 10 : Oct += "*"; break;
					case 11 : Nov += "*"; break;
					case 12 : Dec += "*"; break;
					
				}
				
			}
			
			sb.append("Case #" + TC + ":" + "\n");
			sb.append(Jan + "\n" + Feb + "\n" + Mar +"\n" + Apr + "\n");
			sb.append(May + "\n" + Jun + "\n" + Jul +"\n" + Aug + "\n");
			sb.append(Sep + "\n" + Oct + "\n" + Nov +"\n" + Dec + "\n");
			
			TC++;
		}
		
		System.out.println(sb);
		
	}
}

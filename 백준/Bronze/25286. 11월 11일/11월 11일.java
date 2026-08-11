import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		while(T --> 0) {
			st = new StringTokenizer(br.readLine());
			int year = Integer.parseInt(st.nextToken());
			int month = Integer.parseInt(st.nextToken());
			int day = month;
			
			switch(month - 1) {
				case 1 : 
				case 3 :
				case 5 : 
				case 7 :
				case 8 :
				case 10 : 
				case 12 : 
					
					sb.append(year + " " + (month - 1) + " " + 31);
					break;
					
				case 4 :
				case 6 : 
				case 9 : 
				case 11 :
					
					sb.append(year + " " + (month - 1) + " " + 30);
					break;
					
				case 2 : 
					
					if((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) 
						
						sb.append(year + " " + (month - 1) + " " + 29);
					
					else 
						sb.append(year + " " + (month - 1) + " " + 28);
					break;
					
				case 0 : 
					
					sb.append((year - 1) + " " + 12 + " " + 31);
			}
			
			sb.append("\n");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		System.out.print(sb);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String start = st.nextToken();
		String end = st.nextToken();
		
		int startHH = Integer.parseInt(start.split(":")[0]);
		int startMM = Integer.parseInt(start.split(":")[1]);
		int startMinute = startHH * 60 + startMM;
		
		int emdHH = Integer.parseInt(end.split(":")[0]);
		int endMM = Integer.parseInt(end.split(":")[1]);
		int endMinute = emdHH * 60 + endMM;
		
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()) + 1;
		int T = Integer.parseInt(st.nextToken());
		
		int now = startMinute;
		int day = 0;
		while(N --> 0) {
			
			if(now + T < endMinute) now += T;
			else {
				now = startMinute;
				day++;
				N++;
			}
			
		}

		System.out.println(day);
		System.out.println((now / 60 < 10 ? "0" + now / 60 : now / 60) + ":" + (now % 60 < 10 ? "0" + now % 60 : now % 60));
	
   }
}
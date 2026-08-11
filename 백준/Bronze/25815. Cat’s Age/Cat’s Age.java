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
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int year = Integer.parseInt(st.nextToken());
		int month = Integer.parseInt(st.nextToken());
		int catY = 0;
		int catM = 0;
		
		if(year > 1) {
			
			catY += 24;
			catY += (year - 2) * 4;
			catM += (month * 4);
			
		} else if(year > 0) {
			
			catY += 15;
			catM += (month * 9);
			
		} else {
			
			catM += (month * 15);
			
		}
		
		catY += catM / 12;
		catM = catM % 12;
		
		System.out.println(catY + " " + catM);
	}
}

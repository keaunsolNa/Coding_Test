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
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int gold = Integer.parseInt(st.nextToken());
		int silver = Integer.parseInt(st.nextToken());
		int bronze = Integer.parseInt(st.nextToken());
		
		int cost = (gold * 6) + (silver * 3);
		int bp = (gold * 3) + (silver * 2) + bronze;
		
		
		if(bp >= 8) sb.append("Province or Gold");
		else if(bp >= 6) sb.append("Duchy or Gold");
		else if(bp >= 5) sb.append("Duchy or Silver");
		else if(bp >= 3) sb.append("Estate or Silver");
		else if(bp >= 2) sb.append("Estate or Copper");
		else sb.append("Copper");
			
		
		System.out.println(sb);
		
	}
}

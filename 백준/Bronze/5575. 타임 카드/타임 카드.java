import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int AGW = Integer.parseInt(st.nextToken())*60*60 + Integer.parseInt(st.nextToken())*60 + Integer.parseInt(st.nextToken());
		int AOW = Integer.parseInt(st.nextToken())*60*60 + Integer.parseInt(st.nextToken())*60 + Integer.parseInt(st.nextToken());
		System.out.println((AOW-AGW)/3600 + " " + (AOW-AGW)%3600/60 + " " + (AOW-AGW)%60);
		
		st = new StringTokenizer(br.readLine(), " ");
		int BGW = Integer.parseInt(st.nextToken())*60*60 + Integer.parseInt(st.nextToken())*60 + Integer.parseInt(st.nextToken());
		int BOW = Integer.parseInt(st.nextToken())*60*60 + Integer.parseInt(st.nextToken())*60 + Integer.parseInt(st.nextToken());
		System.out.println((BOW-BGW)/3600 + " " + (BOW-BGW)%3600/60 + " " + (BOW-BGW)%60);
		
		st = new StringTokenizer(br.readLine(), " ");
		int CGW = Integer.parseInt(st.nextToken())*60*60 + Integer.parseInt(st.nextToken())*60 + Integer.parseInt(st.nextToken());
		int COW = Integer.parseInt(st.nextToken())*60*60 + Integer.parseInt(st.nextToken())*60 + Integer.parseInt(st.nextToken());
		System.out.println((COW-CGW)/3600 + " " + (COW-CGW)%3600/60 + " " + (COW-CGW)%60);
		
	}
}

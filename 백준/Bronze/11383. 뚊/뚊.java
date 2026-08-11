import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test05();
	}

	public static void test05() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		String A = "";
		String B = "";

		for(int i = 0; i < N; i++) {
			A += br.readLine();
		}
		for(int i = 0; i < N; i++) {
			B += br.readLine();
		}
		
		A = A + A;
		
		List<String> AList = new ArrayList<>();
		for(int i = 0; i < A.length(); i++) {
			AList.add(A.charAt(i)+"");
		}
		
		List<String> BList = new ArrayList<>();
		for(int i = 0; i < B.length(); i++) {
			BList.add(B.charAt(i)+"");
		}
		
		Collections.sort(AList);
		Collections.sort(BList);
		
		if(AList.containsAll(BList)) {
			System.out.println("Eyfa");
		} else {
			System.out.println("Not Eyfa");
		}
	}
}

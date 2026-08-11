import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

	public static void test02() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a1 = Integer.parseInt(st.nextToken());
		int b1 = Integer.parseInt(st.nextToken());
		int a2 = Integer.parseInt(st.nextToken());
		int b2 = Integer.parseInt(st.nextToken());
		
		
		st = new StringTokenizer(br.readLine());
		int a3 = Integer.parseInt(st.nextToken());
		int b3 = Integer.parseInt(st.nextToken());
		int a4 = Integer.parseInt(st.nextToken());
		int b4 = Integer.parseInt(st.nextToken());
		
		int Ga = a1 + a2;
		int Gb = b1 + b2;
		int Ea = a3 + a4;
		int Eb = b3 + b4;
		
		if(Ga - Ea + Gb - Eb == 0) System.out.println("Tie");
		else if(Ga - Ea + Gb - Eb > 0) System.out.println("Gunnar");
		else System.out.println("Emma");
		
	}
}

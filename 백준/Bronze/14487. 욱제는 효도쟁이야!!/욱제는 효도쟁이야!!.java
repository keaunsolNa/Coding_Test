import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		List<Integer> arrayList = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			arrayList.add(Integer.parseInt(st.nextToken())); 
		}
		
		Collections.sort(arrayList);

		long Pay = 0;
		for(int i = 0; i < arrayList.size() - 1; i++) {
			Pay += arrayList.get(i);
		}
		
		System.out.println(Pay);
		
	}
}

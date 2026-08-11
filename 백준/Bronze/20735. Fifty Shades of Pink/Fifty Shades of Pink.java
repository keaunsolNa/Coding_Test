import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		while(N --> 0) {
			String name = br.readLine().toLowerCase();
			if(name.contains("rose") || name.contains("pink")) cnt++;
			
		}
		
		if(cnt == 0) System.out.println("I must watch Star Wars with my daughter");
		else System.out.println(cnt);
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

	public static void test07() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		String[] stu = new String[T];
		for(int i = 0; i < T; i++) stu[i] = br.readLine();
		
		String[] ans = new String[T];
		for(int i = 0; i < T; i++) ans[i] = br.readLine();
		
		int corect = 0;
		for(int i = 0; i < T; i++) 
			if(stu[i].equals(ans[i])) corect++;
		
		System.out.println(corect);
		
	}
}

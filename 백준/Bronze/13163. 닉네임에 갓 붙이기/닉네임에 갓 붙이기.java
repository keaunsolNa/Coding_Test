import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			StringBuilder sb = new StringBuilder();
			String[] nickName = br.readLine().split(" ");
			sb.append("god");
			
			for(int j = 1; j < nickName.length; j++) {
				sb.append(nickName[j]);
			}
			
			sb.append("\n");
			System.out.print(sb);
			
		}

	}
}
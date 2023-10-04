import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		int maxScore = 0;
		String maxName = "";
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int score = Integer.parseInt(st.nextToken());
			
			if(score > maxScore) {
				maxScore = score;
				maxName = name;
			} else if(score == maxScore) {
				String[] temp = {maxName, name};
				Arrays.sort(temp);
				maxName = temp[0];
			}
			
		}
		
		System.out.println(maxName);
   }
}
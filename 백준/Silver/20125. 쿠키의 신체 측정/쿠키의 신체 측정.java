import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] map = new int[N][N];
		
		
		for(int i = 0; i < N; i++) {

			String tempString = br.readLine();
			for(int j = 0; j < N; j++) {

				char temp = tempString.charAt(j);
				map[i][j] = temp == '*' ? 1 : 0;
			}
		}

		String heart = "";
		String answer = "";
		
		for(int i = 1; i < N; i++) {
			
			for(int j = 0; j < N; j++) {
				
				if(map[i - 1][j] == 1 && map[i][j - 1] == 1 && map[i][j+1] == 1 && map[i + 1][j] == 1) {
					heart = (i + 1) + " " + (j + 1);
					
					int temp = 1;
					int left = 0;
					int right = 0;
					int middle = 0;
					int leftLeg = 0;
					int rightLeg = 0;
					
					while(j - temp >= 0 && map[i][j - temp++] != 0) left++;
					
					temp = 1;
					while(j + temp < N && map[i][j + temp++] != 0) right++;
					
					temp = 1;
					while(i + temp < N && map[i + temp++][j] != 0) middle++;
					
					temp = 1;
					while(i + middle + temp < N && map[i + middle + temp++][j - 1] != 0) leftLeg++;
					
					temp = 1;
					while(i + middle + temp < N && map[i + middle + temp++][j + 1] != 0) rightLeg++;
					
					answer = left + " " + right + " " + middle + " " + leftLeg + " " + rightLeg;
					
					System.out.println(heart);
					System.out.println(answer);
					return;
				}
			}
		}
   }
}
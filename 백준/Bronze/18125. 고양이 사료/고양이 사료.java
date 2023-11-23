import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		int[][] map = new int[C][R];
		for(int i = 0; i < C; i++) {
			
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < R; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < R; i++) {
			
			st = new StringTokenizer(br.readLine());
			for(int j = C - 1; j >= 0; j--) {
				
				if(map[j][i] != Integer.parseInt(st.nextToken())) {
					
					System.out.println("|>___/|     /}\n" +
                            "| O O |    / }\n" +
                            "( =0= )\"\"\"\"  \\\n" +
                            "| ^  ____    |\n" +
                            "|_|_/    ||__|");

					
					return;
				}
			}
		}
		
        System.out.println( "|>___/|        /}\n" +
                "| O < |       / }\n" +
                "(==0==)------/ }\n" +
                "| ^  _____    |\n" +
                "|_|_/     ||__|");
   }
}
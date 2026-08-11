import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test08();
	}

	public static void test08() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			double[] dart = new double[12];
			for(int j = 0; j < 12; j++) dart[j] = Math.abs(Double.parseDouble(st.nextToken()));
			
			double P1 = 0;
			double P2 = 0;
			int tern = 1;
			
			for(int j = 0; j < 12;) {
				
				for(int k = 0; k < 3; k++) {
					double dis = dart[j] * dart[j] + dart[j + 1] * dart[j + 1];
					if(tern == 1) 
						P1 += dis <= 9 ? 100 : dis <= 36 ? 80 : dis <= 81 ? 60 : dis <= 144 ? 40 : dis <= 225 ? 20 : 0;
					else 
						P2 += dis <= 9 ? 100 : dis <= 36 ? 80 : dis <= 81 ? 60 : dis <= 144 ? 40 : dis <= 225 ? 20 : 0;
					j += 2;
				}
				tern = tern == 1 ? 2 : 1;
				
			}
			
			String P1S = String.format("%.0f", P1);
			String P2S = String.format("%.0f", P2);
			sb.append("SCORE: " + P1S + " to " + P2S + ", ");
			if(P1 > P2) sb.append("PLAYER 1 WINS.");
			else if(P2 > P1) sb.append("PLAYER 2 WINS.");
			else sb.append("TIE.");
			
			sb.append("\n");
		}

		System.out.print(sb);
	}
}

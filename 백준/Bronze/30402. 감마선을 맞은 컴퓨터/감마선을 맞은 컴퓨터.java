import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i = 0; i < 15; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < 15; j++) {
				char text = st.nextToken().charAt(0);
				
				if(text == 'w') {
					System.out.println("chunbae");
					return;
				} else if(text == 'b') {
					System.out.println("nabi");
					return;
				} else if(text == 'g') {
					System.out.println("yeongcheol");
					return;
				}
			}
		}
	}
}

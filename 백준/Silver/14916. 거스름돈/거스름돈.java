import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

	public static void test05() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int five = 0;
		int two = 0;
		for(int i = N/5; i >= 0; i--) {
			if(N - (5*i) == 0) {
				five = i;
				two = 0;
				break;
			} else if((N - (5*i)) % 2 == 0) {
				five = i;
				two = (N - (5*i))/2;
				break;
			}
			
			if(i == 0) {
				if(N%2 == 0) {
					System.out.println(N/2);
				}
			}
		}
		if(N == 2) System.out.println(1); 
		else if(N == 4) System.out.println(2);
		else if(five == 0 && two == 0) System.out.println(-1);
		else System.out.println(five + two);
	}
}

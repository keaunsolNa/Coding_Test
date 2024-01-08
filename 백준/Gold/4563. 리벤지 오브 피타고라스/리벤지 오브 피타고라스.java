import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			long a = Long.parseLong(br.readLine());
			if(a == 0) break;
			
			int cnt = 0;
			long A = a * a;
			for(int i = 1; i <= a; i++) {
				
				if(A % i == 0) {
					if((((A / i + i) / 2.0) == (A / i + i) / 2 &&
						((A / i - i) / 2.0) == (A / i - i) / 2) &&
	  					 (A / i - i) / 2 > a)
						cnt++;
				}
			}
			System.out.println(cnt);
		}
		
	}
	

}
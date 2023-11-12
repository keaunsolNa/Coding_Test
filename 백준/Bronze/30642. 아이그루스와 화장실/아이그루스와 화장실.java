import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		boolean check = br.readLine().equals("annyong") ? true : false;
		
		int K = Integer.parseInt(br.readLine());
		
		if(check && K % 2 != 0) System.out.println(K);
		else if(check && K % 2 == 0) System.out.println(K > 1 ? K - 1 : K + 1);
		else if(!check && K % 2 == 0) System.out.println(K);
		else if(!check && K % 2 != 0) System.out.println(K > 1 ? K - 1 : K + 1);
        
	}
}

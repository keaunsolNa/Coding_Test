import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test06();
	}

	public static void test06() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		List<Integer> arr = new ArrayList<>();
		for(int i = 0; i < N; i++){
			arr.add(Integer.parseInt(st.nextToken()));
		}

		int firstRing = arr.get(0);
	
		
		for(int i = 1; i < N; i++) {
			int gcd = GCD(arr.get(i), firstRing);
			int LCD = firstRing*arr.get(i)/gcd;
			System.out.println(LCD/arr.get(i)+"/"+LCD/firstRing);
		}
	}

    static int GCD(int a, int b){ 
    	if (a%b == 0) {
    		return b;
    	}
    	return GCD(b, a % b);
    }
}

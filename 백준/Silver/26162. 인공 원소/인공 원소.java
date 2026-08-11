import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		while(T --> 0) {
			int a = Integer.parseInt(br.readLine());
			if(check(a)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

	static boolean check(int a) {
		
		List<Integer> primeList = new ArrayList<>();
		for(int i = 1; i <= a; i++) {
			if(isPrime(i)) {
				primeList.add(i);
			}
		}
		
		for(int i = 0; i < primeList.size(); i++) {
			
			for(int j = 0; j < primeList.size(); j++) {
				
				if(primeList.get(i) + primeList.get(j) == a) {
					return true;
				}
			}
		}
		return false;
	}

    public static boolean isPrime(long n) {
		
        if(n == 1 || n == 0) return false;

        for(long i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }

        return true;
        
    }
}

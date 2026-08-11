import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		test02();
	}

	public static void test02() {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		int min = -1;
		
		for(int i = M; i <= N; i++) {
			if(isPrime(i)) {
				sum += i;
				if(min == -1) {
					min = i;
				}
			}
		}
		
		if(sum != 0) {
			System.out.println(sum);
		}
		System.out.println(min);
	}

	public static boolean isPrime(long n) {
		
        if(n == 1 || n == 0) return false;

        for(long i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }

        return true;
        
    }
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		test05();
	}

	public static void test05()  {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int cnt = 0;
			if(n != 0) {
				for(int i = n + 1; i <= 2*n; i++) {
					if(isPrime(i)) {
						cnt++;
					}
				}
				if(cnt != 0) {
					System.out.println(cnt);
				}
			} else{
				break;
			}
		}
	}

	public static boolean isPrime(long n) {
		
        if(n == 1 || n == 0) return false;

        for(long i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0) return false;
        }

        return true;
        
    }
}

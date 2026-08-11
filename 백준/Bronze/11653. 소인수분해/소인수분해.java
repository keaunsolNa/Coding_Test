import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		test03();
	}

	public static void test03() {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		if(N != 1) {
			
			for(int i = 2; i <= N; i++) {
				while(N%i == 0) {
					N = N/i;
					System.out.println(i);
				}
			}
		}
	}
}

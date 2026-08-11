import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		test12();
	}

	public static void test12(){
		Scanner sc = new Scanner(System.in);
		int a;
		String b;
		a = sc.nextInt();
		b = sc.next();
		System.out.println(a*Character.getNumericValue(b.charAt(2)));
		System.out.println(a*Character.getNumericValue(b.charAt(1)));
		System.out.println(a*Character.getNumericValue(b.charAt(0)));
		
		System.out.println(a*Integer.parseInt(b));
	}
}

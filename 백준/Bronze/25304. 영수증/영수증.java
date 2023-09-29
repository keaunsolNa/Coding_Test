import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int totalCount, amount;
		totalCount = sc.nextInt();
		amount = sc.nextInt();
		
		for(int i = 1; i <= amount; i++) {
			totalCount -= (sc.nextInt() * sc.nextInt());
		}
		
		if(totalCount == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
    }
}
package baekjoon;

public class Test05_Function2 {

	public static void main(String[] args) {
		boolean[] noneSelf = new boolean[10001];
		
		for(int i = 1; i <= 10000; i++) {
			int n = selfOrNonSelf(i);
			if(n <= 10000) noneSelf[n] = true;
		}

		for(int i = 1; i < noneSelf.length; i++) {
			if(noneSelf[i] == false) {
				System.out.println(i);
			}
		}
		
	}
	
	public static int selfOrNonSelf(int n) {
		
		int sum = n;
		
		while(n != 0) {
			sum += (n%10);
			n = n / 10;
		}
		return sum;
		
	}
	
}

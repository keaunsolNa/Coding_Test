import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public class Main {
    
    private static List<int[]> hanoiList = new ArrayList<>();
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		BigInteger count = new BigInteger("2");
		System.out.println(count.pow(N).subtract(new BigInteger("1")));
		
		if(N <= 20) {
			
			hanoi(N, 1, 2, 3);
			
			for (int i = 0; i < hanoiList.size(); i++) {
				
                int[] step = hanoiList.get(i);
                System.out.println(step[0] + " " + step[1]);
                
            }
		}
		
	}

	public static void hanoi(int n, int one, int two, int three) {
		if(n == 1) toArray(one, three);
		else {
			hanoi(n-1, one, three, two);
			toArray(one, three);
			hanoi(n-1, two, one, three);
		}
	}
	
	public static void toArray(int one, int two) {
		int[] temp = new int[2];
		temp[0] = one;
		temp[1] = two;
		hanoiList.add(temp);
	}
}

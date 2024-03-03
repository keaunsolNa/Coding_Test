import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	private static List<int[]> hanoiList = new ArrayList<>();
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		hanoi(N, 1, 2, 3);
		int[][] answer = new int[hanoiList.size()][];
		 
        for (int i = 0; i < hanoiList.size(); i++) {
        	answer[i] = hanoiList.get(i);
		}
        StringBuilder sb = new StringBuilder();
        sb.append(hanoiList.size()).append("\n");
        for (int[] is : answer) {
			for (int is2 : is) {
				sb.append(is2).append(" ");
			}
			sb.append("\n");
		}
        
        System.out.println(sb);
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
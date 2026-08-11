import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] input = br.readLine().toCharArray();
		String[] dic = br.readLine().split(" ");
		int[] dice = new int[3];
		dice[0] = Integer.parseInt(dic[0]);
		dice[1] = Integer.parseInt(dic[1]);
		dice[2] = Integer.parseInt(dic[2]);

		Arrays.sort(dice);
		
		if(input[10] == 'Y') {
			if(dice[0] == dice[1] && dice[1] == dice[2]) {
				System.out.println(50);
				return;
			}
		} 
		
		if(input[9] == 'Y') {
			if(dice[0] != 1 && dice[0] != dice[1] && dice[0] != dice[2] && dice[1] != dice[2]) {
				System.out.println(30);
				return;
			}
		}
		
		if(input[8] == 'Y') {
			if(dice[2] != 6 && dice[0] != dice[1] && dice[0] != dice[2] && dice[1] != dice[2]) {
				System.out.println(30);
				return;
			}
		}
		
		if(input[11] == 'Y') {
			if(dice[0] == 6) {
				System.out.println(30);
				return;
			}
		}
		
		
	}
}

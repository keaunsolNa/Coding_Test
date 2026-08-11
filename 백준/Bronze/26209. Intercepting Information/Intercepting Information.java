import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		
		boolean check = true;
		for(int i = 0; i < temp.length; i++) {
			if(Integer.parseInt(temp[i]) == 9) {
				check = false;
				break;
			}
		}
		
		if(check) {
			System.out.println("S");
		} else {
			System.out.println("F");
		}
		
	}
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String board = br.readLine();  

		board = board.replaceAll("XXXX", "AAAA");
		board = board.replaceAll("XX", "BB");
		
		if(board.contains("X")) {
			System.out.println(-1);
		} else {
			System.out.println(board);
		}
	}
}

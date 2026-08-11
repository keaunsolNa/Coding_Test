import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	private static String input;
	private static StringBuilder sb = new StringBuilder();
	private static int idx = 0;
	private static boolean[] visited;

	public static void main(String[] args) throws IOException {
		test09();
	}

	public static void test09() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = br.readLine();
		visited = new boolean[input.length()];
		solove(0, input.length() - 1);
		
		System.out.println(sb.toString());
		
	}

	private static void solove(int left, int right) throws IOException {
       
		if (left > right) return;

        int idx = left;

        for (int i = left; i <= right; i++) {
            if (input.charAt(idx) > input.charAt(i)) idx = i;
        }
        
        visited[idx] = true;

        for (int i = 0; i < input.length(); i++) {
            if (visited[i])  sb.append(input.charAt(i));
        }
        
        sb.append("\n");
        solove(idx + 1, right);
        solove(left, idx  - 1);
    }
}

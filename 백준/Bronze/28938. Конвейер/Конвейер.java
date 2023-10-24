import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int answer = 0;
		for(int i = 0; i < N; i++) answer += Integer.parseInt(st.nextToken());
		
		System.out.println(answer < 0 ? "Left" : answer == 0 ? "Stay" : "Right");
	}
}

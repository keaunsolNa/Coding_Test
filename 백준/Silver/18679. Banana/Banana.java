import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		test04();
	}

	public static void test04() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<String, String> vol = new HashMap<>();
		
		for(int i = 0; i < N; i++) {
			String[] text = br.readLine().split("=");
			vol.put(text[0].replaceAll(" ", ""), text[1].replaceAll(" ", ""));
		}
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; i++) {
			int K = Integer.parseInt(br.readLine());
			String[] input = br.readLine().split(" ");
			
			for(int j = 0; j < K; j++) {
				sb.append(vol.get(input[j])).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}

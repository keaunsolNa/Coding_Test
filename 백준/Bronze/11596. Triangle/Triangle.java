import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test06();
	}

	public static void test06() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		
		st = new StringTokenizer(br.readLine());
		int[] arr2 = new int[3];
		for(int i = 0; i < 3; i++) arr2[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr2);
		
		boolean chk = true;
		for(int i = 0; i < 3; i++) if(arr[i] != arr2[i]) chk = false;
		
		if(arr[0] * arr[0] + arr[1] * arr[1] != arr[2] * arr[2]) chk = false;
		if(arr2[0] * arr2[0] + arr2[1] * arr2[1] != arr2[2] * arr2[2]) chk = false;
		
		if(chk) System.out.println("YES");
		else System.out.println("NO");
	}
}

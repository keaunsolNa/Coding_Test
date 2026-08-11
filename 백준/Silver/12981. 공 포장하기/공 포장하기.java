import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test03();
	}

	public static void test03() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] rgb = new int[3];
		for(int i = 0; i < 3; i++) rgb[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(rgb);

		int box = rgb[0];
		
		rgb[1] -= rgb[0];
		rgb[2] -= rgb[0];
		
		box += rgb[1] / 3;
		box += rgb[2] / 3;
		rgb[1] = rgb[1] % 3;
		rgb[2] = rgb[2] % 3;
		
		if(rgb[1] + rgb[2] >= 3) box += 2;
		else if(rgb[1] + rgb[2] == 0) box += 0;
		else if(rgb[1] + rgb[2] <= 2) box += 1;
		
		System.out.println(box);
		
	}
}

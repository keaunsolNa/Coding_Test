import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test10();
	}

	public static void test10() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());

		boolean[] wa = new boolean[w];
		boolean[] ha = new boolean[h];

		int n = Integer.parseInt(bf.readLine());

		while (n > 0) {
			st = new StringTokenizer(bf.readLine());
			int wh = Integer.parseInt(st.nextToken());
			int idx = Integer.parseInt(st.nextToken());

			if (wh == 0) ha[idx] = true;
			if (wh == 1) wa[idx] = true;
			n--;
		}

		int mw = 0;
		int tmp = 0;
		for (int i = 0; i < wa.length; i++) {
			
			if (wa[i]) {
				
				mw = Math.max(mw, tmp);
				tmp = 1;
				
			} else tmp++;
		}
		
		mw = Math.max(mw, tmp);

		tmp = 0;
		int mh = 0;
		for (int i = 0; i < ha.length; i++) {
			
			if (ha[i]) {
				
				mh = Math.max(mh, tmp);
				tmp = 1;
				
			} else tmp++;
		}
		
		mh = Math.max(mh, tmp);

		System.out.println(mw * mh);
	}
}

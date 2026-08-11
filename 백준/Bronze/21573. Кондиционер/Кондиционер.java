import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

	public static void test01() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int room = Integer.parseInt(st.nextToken());
		int cond = Integer.parseInt(st.nextToken());
		
		String mod = br.readLine();
		
		switch(mod) {
			case "freeze" : 
				if(room <= cond) {
					System.out.println(room);
				} else {
					System.out.println(cond);
				}
				break;
			case "heat"   :
				if(room <= cond) {
					System.out.println(cond);
				} else {
					System.out.println(room);
				}
				break;
			case "auto"   :
				System.out.println(cond);
				break;
			case "fan"    :
				System.out.println(room);
				break;
		}
	}
}

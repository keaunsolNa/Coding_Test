import java.io.*;
import java.util.StringTokenizer;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Long pront = Long.parseLong(st.nextToken() + st.nextToken());
		Long tail = Long.parseLong(st.nextToken() + st.nextToken());

		System.out.println(pront + tail);
	}
}
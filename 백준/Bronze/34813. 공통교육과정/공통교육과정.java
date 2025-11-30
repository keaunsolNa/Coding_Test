import java.io.*;
import java.util.StringTokenizer;

public class Main {

    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer st;

	public static void main(String[] args) throws IOException {

        solve();
        bw.flush();
        bw.close();
        br.close();

    }

    private static void solve() throws IOException {

     	String str = br.readLine();
		 char s = str.charAt(0);
		 switch (s)
		 {
			 case 'F' : bw.write("Foundation"); break;
			 case 'C' : bw.write("Claves"); break;
			 case 'V' : bw.write("Veritas"); break;
			 case 'E' : bw.write("Exploration"); break;
		 }
    }



}
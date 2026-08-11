import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st;
	   String input = "";
	   
	   while(!(input = br.readLine()).equals("0 0 0 0")) {
		   st = new StringTokenizer(input);
		   
		   int l = Integer.parseInt(st.nextToken());
		   int w = Integer.parseInt(st.nextToken());
		   int h = Integer.parseInt(st.nextToken());
		   int v = Integer.parseInt(st.nextToken());
		   
		   if(l == 0) {
			   sb.append((v / h / w) + " " + w + " " + h + " " + v);
		   } else if(w == 0) {
			   sb.append(l + " " + (v / h / l) + " " + h + " " + v);
		   } else if(h == 0) {
			   sb.append(l + " " + w + " " + (v / w / l) + " " + v);
		   } else if(v == 0) {
			   sb.append(l + " " + w + " " + h + " " + (l * w * h));
		   }
		   
		   sb.append("\n");
		   
	   }
	   
	   System.out.println(sb);
	   
   }
}

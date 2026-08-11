import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test02();
	}

   public static void test02() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringBuilder sb = new StringBuilder();
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   int P = Integer.parseInt(st.nextToken());
	   int Q = Integer.parseInt(st.nextToken());
	   
	   List<Integer> PList = new ArrayList<>();
	   List<Integer> QList = new ArrayList<>();
	   
	   for(int i = 1; i <= P; i++) 
		   if(P % i == 0) PList.add(i);
	   
	   for(int i = 1; i <= Q; i++)
		   if(Q % i == 0) QList.add(i);
	   
	   for(int p = 0; p < PList.size(); p++) {
		   
		   for(int q = 0; q < QList.size(); q++) {
			   
			   sb.append(PList.get(p) + " " + QList.get(q) + "\n");
		   }
	   }
	   
	   System.out.println(sb);
   }
}

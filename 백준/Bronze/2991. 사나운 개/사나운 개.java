import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test05();
	}

   public static void test05() throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	   int a = Integer.parseInt(st.nextToken());
	   int b = Integer.parseInt(st.nextToken());
	   int c = Integer.parseInt(st.nextToken());
	   int d = Integer.parseInt(st.nextToken());
       int p[] = new int[3];
       int dogcnt[] = new int[3];
       
	   st = new StringTokenizer(br.readLine(), " ");
       for(int i = 0; i < 3 ;i++) {
           p[i] = Integer.parseInt(st.nextToken());
           dogcnt[i]=0;
       }
       for(int i=0; i<3;i++) {
           if(p[i] % (a + b) >= 1 && p[i] % (a + b) <= a) {
               dogcnt[i]++;
           }
           if(p[i] % (c + d) >= 1 && p[i] % (c + d) <= c) {
               dogcnt[i]++;
           }
           System.out.println(dogcnt[i]);
       }

	   
   }
}

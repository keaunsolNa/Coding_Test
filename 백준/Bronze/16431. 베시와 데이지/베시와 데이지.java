import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test01();
	}

   public static void test01() throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st;
      
      st = new StringTokenizer(br.readLine());
      int Bx = Integer.parseInt(st.nextToken());
      int By = Integer.parseInt(st.nextToken());

      st = new StringTokenizer(br.readLine());
      int Dx = Integer.parseInt(st.nextToken());
      int Dy = Integer.parseInt(st.nextToken());

      st = new StringTokenizer(br.readLine());
      int Jx = Integer.parseInt(st.nextToken());
      int Jy = Integer.parseInt(st.nextToken());

      int B = Math.max(Math.abs(Jx-Bx), Math.abs(Jy-By));
      int D = Math.abs(Jx-Dx) + Math.abs(Jy-Dy);
    
      if (B == D) System.out.println("tie");
      else if (B < D) System.out.println("bessie");
      else System.out.println("daisy");
      
   }
}

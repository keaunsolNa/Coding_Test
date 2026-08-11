import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		test07();
	}

   public static void test07() throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       long vk = Long.parseLong(st.nextToken());
       long jk = Long.parseLong(st.nextToken());
       st = new StringTokenizer(br.readLine());
       long vl = Long.parseLong(st.nextToken());
       long jl = Long.parseLong(st.nextToken());
       st = new StringTokenizer(br.readLine());
       long vh = Long.parseLong(st.nextToken());
       long dh = Long.parseLong(st.nextToken());
       long jh = Long.parseLong(st.nextToken());

       long heavyChain = vh * dh * jh;
       long lightChainK = vk * jk;
       long lightChainL = vl * jl;
       long totalVariant = heavyChain * (lightChainK + lightChainL);

       System.out.print(totalVariant);
   }
}

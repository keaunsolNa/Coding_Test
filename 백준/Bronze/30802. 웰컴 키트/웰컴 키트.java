import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        int[] size = new int[6];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 6; i++) size[i] = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        
        int totalT = 0;
        for(int i = 0; i < 6; i++) totalT += size[i] % T == 0 ? size[i] / T : size[i] / T + 1;
        
        System.out.println(totalT);
        System.out.println(N / P + " " + N % P);
   }
}
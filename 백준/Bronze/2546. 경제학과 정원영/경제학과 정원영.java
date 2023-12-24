import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        while(t --> 0) {

            br.readLine();
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] cLanguage = new int[n];
            st = new StringTokenizer(br.readLine());
            long cTotal = 0;
            for(int i = 0; i < n; i++) {
                cLanguage[i] = Integer.parseInt(st.nextToken());
                cTotal += cLanguage[i];
            }

            double cEver = (double) cTotal / n;

            int[] economics = new int[m];
            st = new StringTokenizer(br.readLine());
            long eTotal = 0;
            for(int i = 0; i < m; i++) {
                economics[i] = Integer.parseInt(st.nextToken());
                eTotal += economics[i];
            }

            double eEver = (double) eTotal / m;

            Arrays.sort(cLanguage);

            int cnt = 0;
            for(int i = 0; i < n; i++)
                if(cLanguage[i] < cEver && cLanguage[i] > eEver) cnt++;

            System.out.println(cnt);
        }

    }
}


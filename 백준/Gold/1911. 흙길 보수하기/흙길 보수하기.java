import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int[][] point = new int[n][2];

        for(int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());

            point[i][0] = Integer.parseInt(st.nextToken());
            point[i][1] = Integer.parseInt(st.nextToken());

        }

        Arrays.sort(point, (o1, o2) -> {
            if(o1[0] == o2[0])  return o1[1] - o2[1];
            else  return o1[0] - o2[0];
        });

        int ans = 0;
        int range = 0;


        for(int[] intArr : point) {

            if(intArr[0] > range) range = intArr[0];

            if(intArr[1] > range) {
                while(intArr[1] > range) {
                    range += l;
                    ans++;
                }
            }
        }

        System.out.println(ans);
	}
}

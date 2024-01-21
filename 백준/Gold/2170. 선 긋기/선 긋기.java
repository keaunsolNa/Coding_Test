import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] point = new int[n][2];

        for(int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            point[i][0] = Integer.parseInt(st.nextToken());
            point[i][1] = Integer.parseInt(st.nextToken());

        }

        Arrays.sort(point, (o1, o2) -> {
            if(o1[0] == o2[0])  return o1[1] - o2[1];
            else  return o1[0] - o2[0];
        });

        int start = point[0][0];
        int end = point[0][1];
        int len = end - start;

        for(int i = 1; i < n; i++) {

            if(start <= point[i][0] && point[i][1] <= end) continue;
            else if(point[i][0] < end) len += point[i][1] - end;
            else len += point[i][1] - point[i][0];

            start = point[i][0];
            end = point[i][1];
        }

        System.out.println(len);
	}
}

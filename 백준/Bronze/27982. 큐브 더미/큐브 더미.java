import java.io.*;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());

       int n = Integer.parseInt(st.nextToken());
       int m = Integer.parseInt(st.nextToken());

       boolean[][][] matrix = new boolean[n + 2][n + 2][n + 2];
       int[][] cube = new int[m][3];

       for (int t = 0; t < m; t++) {

           st = new StringTokenizer(br.readLine());

           int i = Integer.parseInt(st.nextToken());
           int j = Integer.parseInt(st.nextToken());
           int k = Integer.parseInt(st.nextToken());
           matrix[i][j][k] = true;
           cube[t][0] = i;
           cube[t][1] = j;
           cube[t][2] = k;

       }

       int ans = 0;
       for (int t = 0; t < m; t++) {

           int i = cube[t][0];
           int j = cube[t][1];
           int k = cube[t][2];

           if (matrix[i - 1][j][k] && matrix[i + 1][j][k] && matrix[i][j - 1][k] &&
               matrix[i][j + 1][k] && matrix[i][j][k - 1] && matrix[i][j][k + 1]) ans++;
       }

        System.out.println(ans);




    }


}
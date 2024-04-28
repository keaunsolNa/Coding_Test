    import java.io.*;
    import java.util.*;

    public class Main {


        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            StringBuilder sb = new StringBuilder();

            int n = Integer.parseInt(br.readLine());
            String[] arr = new String[n];

            for (int i = 0; i < n; i++)
                arr[i] = new StringBuilder(br.readLine()).reverse().toString();

            Arrays.sort(arr);

            for (int i = 0; i < n; i++) sb.append(arr[i]).append("\n");

            System.out.println(sb);

        }




    }

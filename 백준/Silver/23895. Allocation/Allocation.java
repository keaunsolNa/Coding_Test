    import java.io.*;
    import java.util.*;

    public class Main {


        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            StringBuilder sb = new StringBuilder();

            int tc = Integer.parseInt(br.readLine());

            for (int t = 1; t <= tc; t++) {

                st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                st = new StringTokenizer(br.readLine());
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

                Arrays.sort(arr);

                int cnt = 0;
                for (int i = 0; i < n; i++) {

                    if (b - arr[i] >= 0) {
                        cnt++;
                        b -= arr[i];
                    }

                    else break;
                }

                sb.append("Case #").append(t).append(": ").append(cnt).append("\n");

            }

            System.out.println(sb);
        }




    }

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[] arr = br.readLine().toCharArray();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n - 1; i++)
        {
            if (arr[i] == 'A') list.add(i);
        }

        if (list.size() < 2)
        {
            sb.append("NO");
        }

        else
        {

            int temp = m - 3;

            if (list.get(list.size() - 2) < temp) {
                sb.append("NO");
            }
            else
            {
                for (int i = list.get(list.size() - 2) - temp; i < list.get(list.size() - 2); i++)
                {
                    sb.append(arr[i]);
                }

                sb.append("AA");

                for (int i = list.get(list.size() - 1) + 1; i < arr.length; i++)
                {
                    if (arr[i] != 'A' && arr[i] != 'E' && arr[i] != 'I' && arr[i] != 'O' && arr[i] != 'U')
                    {
                        sb.append(arr[i]);
                        break;
                    }
                }

                if (sb.length() != m)
                {
                    sb.setLength(0);
                    sb.append("NO");
                }
            }
        }

        bw.write(sb.toString().equals("NO") ? sb.toString() : "YES\n" + sb);
        bw.flush();
        bw.close();
        br.close();

    }
}
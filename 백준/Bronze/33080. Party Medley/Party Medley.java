import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        int count = 0, maxScore = 0;
        for (int i = 0; i < n; i++)
        {

            int first = arr[i];
            for (int j = i + 1; j < n; j++)
            {
                int second = arr[j];
                for (int q = j + 1; q < n; q++)
                {
                    int last = arr[q];
                    if (first - last > m) break;

                    count++;
                    if (maxScore < first + second + last)
                    {
                        maxScore = first + second + last;
                    }
                }
            }
        }

        if (count == 0) bw.write("-1");
        else bw.write(count + " " + maxScore);
        bw.flush();
        bw.close();
        br.close();

    }

}

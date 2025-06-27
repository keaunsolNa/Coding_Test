import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int cnt = 1;
        int prev = arr[0];

        List<Integer> list = new ArrayList<>();
        List<Integer> maxList = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (i == 0)
            {
                prev = arr[i];
                list.add(prev);
            }

            else
            {
                if (arr[i] >= prev)
                {
                    list.add(arr[i]);
                    prev = arr[i];
                }
                else
                {
                    cnt++;
                    if (list.size() > maxList.size())
                    {
                        maxList.clear();
                        maxList.addAll(list);
                    }

                    list.clear();
                    list.add(arr[i]);
                    prev = arr[i];
                }
            }
        }

        bw.write(cnt + " " + Math.max(maxList.size(), list.size()));

        bw.flush();
        bw.close();
        br.close();

    }


}
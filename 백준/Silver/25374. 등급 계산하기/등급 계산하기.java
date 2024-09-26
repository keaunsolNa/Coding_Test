import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] points = new int[n];

        for (int i = 0; i < n; i++)
        {
            points[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(points);
        reverse(points);

        int[] cuts = {0, 4, 7, 12, 17, 20, 17, 12, 7, 4};
        int[] answer = new int[10];

        int grade = 1;
        answer[grade]++;
        cuts[grade]--;

        for (int i = 1; i < n; i++)
        {
            if (cuts[grade] <= 0)
            {
                if (points[i - 1] == points[i])
                {
                    int nextGrade = grade + 1;
                    while (cuts[nextGrade] == 0) nextGrade++;
                    cuts[grade]++;
                    cuts[nextGrade]--;

                }
                else
                {
                    int nextGrade = grade + 1;
                    while (cuts[nextGrade] == 0) nextGrade++;
                    grade = nextGrade;
                }
            }

            answer[grade]++;
            cuts[grade]--;
        }

        for (int i = 1; i < 10; i++)
        {
            bw.write(answer[i] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }

    public static void reverse(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

}

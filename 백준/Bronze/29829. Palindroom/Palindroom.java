import java.util.*;
import java.io.*;

public class Main {



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();
        while (st.hasMoreTokens()) list.add(Integer.parseInt(st.nextToken()));

        int size = list.size();
        boolean flag = true;
        int cnt = 0;
        int[] arr = new int[size];
        for (int i = 0; i < size / 2; i++) {


            if (list.get(i).equals(list.get(size - i - 1)))  {
                arr[i] = list.get(i);
                arr[size - i - 1] = list.get(i);
            }

            else {
                cnt++;
                if (cnt == 2) {
                    flag = false;
                    break;
                }
                arr[i] = list.get(i);
                arr[size - i - 1] = arr[i];
            }

        }

        if (flag) {
            System.out.println("JAH");
            for (int i = 0; i < size; i++) System.out.print(arr[i] + " ");
        }

        else System.out.println("EI");
    }
}

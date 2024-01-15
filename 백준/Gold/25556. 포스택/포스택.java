import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

        Stack<Integer>[] stacks = new Stack[4];
        for(int i = 0; i < 4; i++) {
            stacks[i] = new Stack<>();
            stacks[i].push(0);
        }

        for(int i = 0; i < n; i++) {

            boolean chk = false;
            for(int j = 0; j < 4; j++) {

                if(stacks[j].peek() < a[i]) {

                    stacks[j].push(a[i]);
                    chk = true;
                    break;
                }
            }

            if(!chk) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

}
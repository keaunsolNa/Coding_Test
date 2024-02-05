import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int cnt = 0;
        for(int i = a; i <= b; i++) {

            double temp = Math.sqrt(i);
            double temp2 = Math.cbrt(i);

            if(temp == (int)temp && temp2 == (int)temp2) cnt++;
        }

        System.out.println(cnt);

    }
}

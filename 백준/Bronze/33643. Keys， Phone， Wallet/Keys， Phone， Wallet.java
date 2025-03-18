import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        boolean[] check = new boolean[3];
        while (n --> 0)
        {
            String token = br.readLine();
            if (token.equals("keys")) check[0] = true;
            if (token.equals("phone")) check[1] = true;
            if (token.equals("wallet")) check[2] = true;
        }

        if (!check[0]) bw.write("keys\n");
        if (!check[1]) bw.write("phone\n");
        if (!check[2]) bw.write("wallet\n");
        if (check[0] && check[1] && check[2]) bw.write("ready");
        bw.flush();
        br.close();
        bw.close();
    }

}
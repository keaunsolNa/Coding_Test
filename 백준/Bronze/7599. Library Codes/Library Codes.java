import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while (true)
        {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int f = Integer.parseInt(st.nextToken());

            if (name.equals("#") && f == 0) break;

            bw.write(name + " Library\n");
            int n = 1;
            int c = Integer.parseInt(br.readLine());
            while (c --> 0)
            {
                st = new StringTokenizer(br.readLine());
                int w = Integer.parseInt(st.nextToken());
                String text =  st.nextToken();

                bw.write("Book " + n++ + " ");
                bw.write(((f * text.length() + 2 <= w)  ? "horizontal" : "vertical") + "\n");


            }
        }


        bw.flush();
        bw.close();
        br.close();
    }


}
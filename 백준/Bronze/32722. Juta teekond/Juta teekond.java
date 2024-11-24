import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean flag = true;
        int number = Integer.parseInt(br.readLine());

        if (number != 1 && number != 3)
        {
            flag = false;
        }

        number = Integer.parseInt(br.readLine());

        if (number != 6 && number != 8)
        {
            flag = false;
        }

        number = Integer.parseInt(br.readLine());

        if (number != 2 && number != 5)
        {
            flag = false;
        }


        bw.write(flag ? "JAH" : "EI");
        bw.flush();
        bw.close();
        br.close();
    }

}

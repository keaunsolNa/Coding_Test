    import java.io.*;
    import java.util.*;

    public class Main {


        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            StringBuilder sb = new StringBuilder();

            char[] arr = new char[3];
            for (int i = 0; i < 3; i++) arr[i] = br.readLine().charAt(0);

            Arrays.sort(arr);
            System.out.println(arr[0] == 'k' && arr[1] == 'l' && arr[2] == 'p' ? "GLOBAL" : "PONIX");


        }




    }

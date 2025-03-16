import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        switch (n)
        {
            case 1 :
                System.out.println("2024 8");
                break;
            case 2 :
                System.out.println("2025 3");
                break;
            case 3 :
                System.out.println("2025 10");
                break;
            case 4 :
                System.out.println("2026 5");
                break;
            case 5 :
                System.out.println("2026 12");
                break;
        }


        bw.flush();
        br.close();
        bw.close();
    }

}
import java.io.*;

class Main {

    public static int n(int n) {

        int p = 1;
        if (n == 1 || n == 0) p = 0;

        for (int i = 1; i < Math.sqrt(n); i++) {
            if (i == 1) continue;
            if (n % i == 0) {
                p = 0;
                break;
            }
        }
        return p;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if (n ( Integer.parseInt(br.readLine())) == 1) System.out.println("yes");
        else System.out.println("no");
    }
}

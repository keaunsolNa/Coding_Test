import java.util.*;
import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        a = solve(a);
        b = solve(b);

        if (a == 1) {

            switch (b) {
                case 1 :
                    System.out.println("="); break;
                case 3 :
                    System.out.println("<"); break;
                default:
                    System.out.println(">");
            }
        }

        else if (a == 2) {

            switch (b) {

                case 2 :
                    System.out.println("="); break;
                case 1 :
                    System.out.println("<"); break;
                default :
                    System.out.println(">");
            }
        }

        else if (a == 3) {

            switch (b) {

                case 3 :
                    System.out.println("="); break;
                case 2 :
                    System.out.println("<"); break;
                default:
                    System.out.println(">"); break;
            }
        }

        else {

            if (b == 4) {
                System.out.println("=");
            } else {
                System.out.println("<");
            }
        }
    }

    private static int solve(int a) {

        return switch (a) {
            case 0 -> 1;
            case 2 -> 2;
            case 5 -> 3;
            default -> 4;
        };
    }

}

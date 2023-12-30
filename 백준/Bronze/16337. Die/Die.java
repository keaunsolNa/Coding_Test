import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[3][3];

        int total = 0;
        for(int i = 0; i < 3; i++) {

            String input = br.readLine();
            for(int j = 0; j < 3; j++) {

                arr[i][j] = input.charAt(j) == 'o' ? 1 : 0;
                total += arr[i][j];
            }
        }

        boolean flag = false;
        int ans = 0;
        switch (total) {

            case 1 :

                if (arr[1][1] == 1) flag = true;
                break;
            case 2 :

                if (arr[0][0] == 1 && arr[2][2] == 1) flag = true;
                if (arr[0][2] == 1 && arr[2][0] == 1) flag = true;
                break;
            case 3 :

                if (arr[0][2] == 1 && arr[1][1] == 1 && arr[2][0] == 1) flag = true;
                if (arr[0][0] == 1 && arr[1][1] == 1 && arr[2][2] == 1) flag = true;
                break;
            case 4 :

                if (arr[0][0] == 1 && arr[0][2] == 1 && arr[2][0] == 1 && arr[2][2] == 1) flag = true;
                break;
            case 5 :

                if (arr[0][0] == 1 && arr[0][2] == 1 && arr[1][1] == 1
                    && arr[2][0] == 1 && arr[2][2] == 1) flag = true;
                break;
            case 6 :

                if (arr[0][0] == 1 && arr[0][2] == 1 && arr[1][0] == 1 &&
                    arr[1][2] == 1 && arr[2][0] == 1 && arr[2][2] == 1) flag = true;

                if (arr[0][0] == 1 && arr[0][1] == 1 && arr[0][2] == 1 &&
                    arr[2][0] == 1 && arr[2][1] == 1 && arr[2][2] == 1) flag = true;
                break;
        }

        if(!flag) System.out.println("unknown");
        else System.out.println(total);
    }

}
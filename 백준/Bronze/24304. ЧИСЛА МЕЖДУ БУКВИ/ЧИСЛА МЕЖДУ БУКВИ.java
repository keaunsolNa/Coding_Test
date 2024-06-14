import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();

        boolean flag = false;
        for (int i = 0; i < 4; i++) {

            if ((int)arr[i] >= 48 && (int)arr[i] <= 57) {

                flag = true;
                String temp = String.valueOf(arr[i] - '0');

                if (i + 1 < 4 && arr[i + 1] >= 48 && (int)arr[i + 1] <= 57) {

                    temp += String.valueOf(arr[i + 1] - '0');
                    i++;
                    if (i + 1 < 4 && arr[i + 1] >= 48 && (int)arr[i + 1] <= 57) {

                        temp += String.valueOf(arr[i + 1] - '0');
                        i++;

                        if (i + 1 < 4 && arr[i + 1] >= 48 && (int)arr[i + 1] <= 57) {

                            temp += String.valueOf(arr[i + 1] - '0');
                            i++;

                        }
                    }
                }

                System.out.println(Integer.parseInt(temp) * n);
            }

        }

        if (!flag) System.out.println("N/A");
    }



}
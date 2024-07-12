import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        while (n --> 0)
        {

            char[] input = br.readLine().toCharArray();
            int cnt = 0;
            StringBuilder temp = new StringBuilder();

            for (int i = 0; i < input.length; i++)
            {

                char c = input[i];

                switch (c) {

                    case '@' : temp.append('a'); cnt++; break;
                    case '[' : temp.append('c'); cnt++; break;
                    case '!' : temp.append('i'); cnt++; break;
                    case ';' : temp.append('j'); cnt++; break;
                    case '^' : temp.append('n'); cnt++; break;
                    case '0' : temp.append('o'); cnt++; break;
                    case '7' : temp.append('t'); cnt++; break;
                    case '\\' : {

                        if (input[i + 1] == '\\' && input[i + 2] == '\'')
                        {
                            temp.append('w');
                            cnt++;
                            i += 2;
                            break;
                        }

                        else if (input[i + 1] == '\'') {
                            temp.append('v');
                            cnt++;
                            i++;
                            break;
                        }
                    }

                    default : temp.append(c);
                }

            }

            if (cnt >= temp.length() / 2.0) sb.append("I don't understand").append("\n");
            else sb.append(temp).append("\n");
        }

        System.out.print(sb);

    }
}


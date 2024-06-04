import java.util.*;
import java.io.*;

public class Main {

    private static class Box {

        private int x;
        private int y;
        private int z;
        private int size;

        public Box (int x, int y, int z) {

            this.x = x;
            this.y = y;
            this.z = z;
            this.size = x * y * z;
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Box[] boxes = new Box[n];
        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());
            int[] temp = new int[3];
            for (int j = 0; j < 3; j++) temp[j] = Integer.parseInt(st.nextToken());

            Arrays.sort(temp);

            boxes[i] = new Box(temp[0], temp[1], temp[2]);

        }

        Arrays.sort(boxes, Comparator.comparingInt(c -> c.size));

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {

            st = new StringTokenizer(br.readLine());
            int[] temp = new int[3];
            for (int j = 0; j < 3; j++) temp[j] = Integer.parseInt(st.nextToken());

            Arrays.sort(temp);

            int corectBox = -1;
            for (int j = 0; j < n; j++) {

                Box box = boxes[j];
                if (box.x >= temp[0] && box.y >= temp[1] && box.z >= temp[2]) {
                    corectBox = j;
                    break;
                }
            }

            if (corectBox == -1) sb.append("Item does not fit.");
            else sb.append(boxes[corectBox].size);

            sb.append("\n");
        }

        System.out.print(sb);
    }


}

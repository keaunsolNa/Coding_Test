import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static List<String> extensionList = new ArrayList<>();
    public static class File implements Comparable<File> {

        String file;
        String extension;
        int inList;

        File(String file, String extension, int inList) {
            this.file = file;
            this.extension = extension;
            this.inList = inList;
        }

        @Override
        public int compareTo(File o) {

            if(o.file.equals(this.file)) {

                if(this.inList == o.inList)

                    return this.extension.compareTo(o.extension);

                return Integer.compare(o.inList, this.inList);

            }
            return this.file.compareTo(o.file);
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        PriorityQueue<File> pq = new PriorityQueue<>();
        HashSet<String> set = new HashSet<>();
        String[] fileArr = new String[n];

        for(int i = 0; i < n; i++) fileArr[i] = br.readLine();

        for(int i = 0; i < m; i++) set.add(br.readLine());

        for(int i = 0; i < n; i++) {

            String file = fileArr[i];
            String name = file.split("[.]")[0];
            String extension = file.split("[.]")[1];

            int inList = set.contains(extension) ? 1 : 0;
            pq.add(new File(name, extension, inList));

        };


        while(!pq.isEmpty()) {

            File file = pq.poll();

            sb.append(file.file).append(".").append(file.extension).append("\n");
        }

        System.out.print(sb);
    }
}
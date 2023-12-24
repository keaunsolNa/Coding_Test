import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    
    private static class Method1 implements Comparable<Method1> {

        int quality;
        int price;

        Method1(int quality, int price) {
            this.quality = quality;
            this.price = price;
        }

        @Override
        public int compareTo(Method1 o) {
            if(o.quality == this.quality) return this.price - o.price;
            return o.quality - this.quality;
        }
    }

    private static class Method2 implements Comparable<Method2> {

        int quality;
        int price;

        Method2(int quality, int price) {
            this.quality = quality;
            this.price = price;
        }

        @Override
        public int compareTo(Method2 o) {
            if(o.price == this.price) return o.quality - this.quality;
            return this.price - o.price;
        }
    }
    
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Method1> pq1 = new PriorityQueue<>();
        PriorityQueue<Method2> pq2 = new PriorityQueue<>();

        while(n --> 0) {
            st = new StringTokenizer(br.readLine());

            int q = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            pq1.add(new Method1(q, p));
            pq2.add(new Method2(q, p));
        }

        System.out.println(pq1.peek().quality + " " + pq1.poll().price + " " + pq1.peek().quality + " " + pq1.poll().price);
        System.out.println(pq2.peek().quality + " " + pq2.poll().price + " " + pq2.peek().quality + " " + pq2.poll().price);
  
    }
}

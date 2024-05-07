import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    private static class Product {

        private int number;
        private int profit;
        private int price;
        private int oppCost;
        private int netProfit;

        public Product (int number, int profit, int price, int oppCost, int netProfit) {

            this.number = number;
            this.profit = profit;
            this.price = price;
            this.oppCost = oppCost;
            this.netProfit = netProfit;
        }

    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        Product[] products = new Product[n];
        int[] profits = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int profit = Integer.parseInt(st.nextToken());
            profits[i] = profit;
            products[i] = new Product(i, profit, 0, 0, 0);
        }

        Arrays.sort(profits);
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            products[i].price = Integer.parseInt(st.nextToken());
            int highProfit = profits[n - 1] == products[i].profit ? profits[n - 2] : profits[n - 1];
            products[i].oppCost = highProfit - products[i].price;
            products[i].netProfit = products[i].profit - products[i].oppCost - products[i].price;
        }

        for (int i = 0; i < n; i++) System.out.print(products[i].netProfit + " ");




    }

}

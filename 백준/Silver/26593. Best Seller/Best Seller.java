import java.util.*;
import java.io.*;

public class Main {

    private static class Product {

        private final String name;
        private final double cellCount;
        private final double totalCost;

        public Product (String name, String cellCount, String cost) {

            this.name = name;
            this.cellCount = Double.parseDouble(cellCount);
            double sellCost = Double.parseDouble(cost);
            this.totalCost = sellCost * this.cellCount;

        }

    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String str;
        List<Product> products = new ArrayList<>();
        while ((str = br.readLine()) != null) {

            st = new StringTokenizer(str);
            products.add(new Product(st.nextToken(), st.nextToken(), st.nextToken()));

            products.sort((o1, o2) -> {
                if (o1.totalCost == o2.totalCost) {

                    if (o1.cellCount == o2.cellCount) return o1.name.compareTo(o2.name);
                    return Double.compare(o2.cellCount, o1.cellCount);
                }
                return Double.compare(o2.totalCost, o1.totalCost);
            });
        }

        for (Product product : products) {

            sb.append("$").append(String.format("%.2f", product.totalCost)).append(" - ").append(product.name).append("/").append(String.format("%.0f", product.cellCount)).append("\n");

        }

        System.out.print(sb);
    }


}

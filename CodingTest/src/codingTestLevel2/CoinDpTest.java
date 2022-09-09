//package codingTestLevel2;
//import java.util.*;
// 
//public class CoinDpTest {
//    public static void main(String args[]) {
//        Scanner scanner = new Scanner(System.in);
// 
//        System.out.println("N 입력 : ");
//        int n = scanner.nextInt();
//        System.out.println("K 입력 : ");
//        int k = scanner.nextInt();
// 
//        System.out.println("입력 종료");
//        int coin[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            coin[i] = scanner.nextInt();
//        }
// 
//        System.out.println("Coin 탐색 종료");
//        int d[] = new int[k + 1];
//        for (int i = 1; i <= k; i++) {
//            d[i] = -1;
//            for (int j = 0; j < n; j++) {
//                if (coin[j] <= i) {
//                    if (d[i - coin[j]] < 0) continue;
//                    if (d[i] < 0) d[i] = d[i - coin[j]] + 1;
//                    else if (d[i - coin[j]] + 1 < d[i]) d[i] = d[i - coin[j]] + 1;
//                }
//            }
//        }
// 
//        System.out.println(d[k]);
//    }
//}
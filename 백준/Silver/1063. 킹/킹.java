import java.io.*;
import java.util.*;

public class Main {

    private static int kx, ky, sx, sy;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String king = st.nextToken();
        kx = king.charAt(0) - 'A';
        ky = Integer.parseInt(king.charAt(1) + "");

        String stone = st.nextToken();
        sx = stone.charAt(0) - 'A';
        sy = Integer.parseInt(stone.charAt(1) + "");

        int n = Integer.parseInt(st.nextToken());

        while (n --> 0) {

            String move = br.readLine();

            switch (move) {

                case "R" : {

                    if (isKingOutPosition(kx + 1, ky)) break;
                    else kx += 1;

                    if (isKingAndStoneSamePosition()) sx += 1;

                    if (isStoneOutPosition()) {
                        sx -= 1;
                        kx -= 1;
                    }

                    break;
                }

                case "L" : {

                    if (isKingOutPosition(kx - 1, ky)) break;
                    else kx -= 1;

                    if (isKingAndStoneSamePosition()) sx -= 1;

                    if (isStoneOutPosition()) {

                        kx += 1;
                        sx += 1;
                    }

                    break;
                }

                case "B" : {

                    if (isKingOutPosition(kx, ky - 1)) break;
                    else ky -= 1;

                    if (isKingAndStoneSamePosition()) sy -= 1;

                    if (isStoneOutPosition()) {

                        ky += 1;
                        sy += 1;
                    }

                    break;
                }

                case "T" : {

                    if (isKingOutPosition(kx, ky + 1)) break;
                    else ky += 1;

                    if (isKingAndStoneSamePosition()) sy += 1;

                    if (isStoneOutPosition()) {

                        ky -= 1;
                        sy -= 1;
                    }

                    break;
                }

                case "RT" : {

                    if (isKingOutPosition(kx + 1, ky + 1)) break;
                    else { kx += 1; ky += 1; }

                    if (isKingAndStoneSamePosition()) {
                        sx += 1; sy += 1;
                    };

                    if (isStoneOutPosition()) {

                        kx -= 1;
                        ky -= 1;
                        sx -= 1;
                        sy -= 1;
                    }

                    break;
                }

                case "LT" : {

                    if (isKingOutPosition(kx - 1, ky + 1)) break;
                    else { kx -= 1; ky += 1; }

                    if (isKingAndStoneSamePosition()) {
                        sx -= 1; sy += 1;
                    };

                    if (isStoneOutPosition()) {

                        kx += 1;
                        ky -= 1;
                        sx += 1;
                        sy -= 1;
                    }

                    break;
                }

                case "RB" : {

                    if (isKingOutPosition(kx + 1, ky - 1)) break;
                    else { kx += 1; ky -= 1; }

                    if (isKingAndStoneSamePosition()) {
                        sx += 1; sy -= 1;
                    };

                    if (isStoneOutPosition()) {

                        kx -= 1;
                        ky += 1;
                        sx -= 1;
                        sy += 1;
                    }

                    break;
                }

                case "LB" : {

                    if (isKingOutPosition(kx - 1, ky - 1)) break;
                    else { kx -= 1; ky -= 1; }

                    if (isKingAndStoneSamePosition()) {
                        sx -= 1;
                        sy -= 1;
                    };

                    if (isStoneOutPosition()) {

                        kx += 1;
                        ky += 1;
                        sx += 1;
                        sy += 1;
                    }

                    break;
                }
            }

        }

        System.out.println((char)(kx + 'A') + "" + ky);
        System.out.println((char)(sx + 'A') + "" + sy);
    }

    private static boolean isKingOutPosition(int tempX, int tempY) {
        return tempX == -1 || tempX == 8 || tempY == 0 || tempY == 9;
    }
    private static boolean isKingAndStoneSamePosition () {
        return kx == sx && ky == sy;
    }

    private static boolean isStoneOutPosition() {
        return sx == -1 || sx == 8 || sy == 0 || sy == 9;
    }
}
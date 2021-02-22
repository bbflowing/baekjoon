package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1906 {
    public static int input [][];
    public static boolean caught [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new int [N+1][M+1];
        caught = new boolean [N+1][M+1];

        for (int i=1; i<=3; ++i) { // 1: Queen, 2: Knight, 3: Pawn
            st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            for (int j=0; j<count; ++j) {
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                input[x][y] = i;
            }
        }
        /*
        for (int i=1; i<=N; ++i) {
            System.out.println(Arrays.toString(input[i]));
        }

         */
        for (int i=1; i<=N; ++i) {
            for (int j=1; j<=M; ++j) {
                if (input[i][j] == 1 || input[i][j] == 2) {
                    solve(i, j, N, M);
                }
            }
        }
        /*
        for (int i=0; i<N; ++i) {
            System.out.println(Arrays.toString(caught[i]));
        }

         */
        int answer = 0;
        for (int i=1; i<=N; ++i) {
            for (int j=1; j<=M; ++j) {
                if (input[i][j] == 0 && !caught[i][j]) {
                    //System.out.println(i+","+j);
                    ++answer;
                }
            }
        }
        System.out.println(answer);
    }

    public static void solve (int x, int y, int N, int M) {
        int knightX [] = {-1, -2, -1, -2, +1, +2, +1, +2};
        int knightY [] = {-2, -1, +2, +1, -2, -1, +2, +1};
        int queenX [] = {-1, -1, +1, +1, +1, -1, 0, 0};
        int queenY [] = {-1, +1, -1, +1, 0, 0, -1, +1};

        if (input[x][y] == 1) { // Queen
            for (int i=0; i<8; ++i) {
                int nx = x; int ny = y;
                while (true) {
                    nx += queenX[i]; ny += queenY[i];

                    if (nx<1 || N+1<=nx || ny<1 || M+1<=ny) {
                        break;
                    }
                    if (input[nx][ny]>=1) { // blocked
                        break;
                    }
                    if (caught[nx][ny]) {
                        continue;
                    }
                    caught[nx][ny] = true;
                    /*
                    System.out.println(nx+","+ny);
                    for (int j=1; j<=N; ++j) {
                       System.out.println(Arrays.toString(caught[j]));
                    }

                     */
                }
            }
        } else if (input[x][y] == 2) {
            for (int i=0; i<8; ++i) {
                int nx = x + knightX[i];
                int ny = y + knightY[i];

                if (nx<1 || N+1<=nx || ny<1 || M+1<=ny) {
                    continue;
                }
                if (input[nx][ny] >= 1) {
                    continue;
                }
                if (caught[nx][ny]) {
                    continue;
                }
                caught[nx][ny] = true;
                /*
                System.out.println(nx+","+ny);
                for (int j=1; j<=N; ++j) {
                    System.out.println(Arrays.toString(caught[j]));
                }

                 */
            }
        }
    }
}

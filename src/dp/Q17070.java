package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q17070 {
    /*
    public static int pipes [][];
    public static int N, answer ;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        pipes = new int [N+1][N+1];
        for (int i=1; i<=N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=N; ++j) {
                pipes[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        answer = 0;
        solve(1, 2, 0);
        System.out.println(answer);


    }

    public static void solve (int x, int y, int type) {
        if (x == N && y == N && pipes[N][N] == 0) {
            ++answer;
            return;
        }

        if (type == 0) {
            if (y + 1 <= N) {
                if (pipes[x][y + 1] == 0) {
                    solve(x, y + 1, 0);
                }
            }
            if (x+1 <= N && y+1 <= N) {
                if (pipes[x+1][y+1] == 0 && pipes[x+1][y] == 0 && pipes[x][y+1] == 0) {
                    solve(x + 1, y + 1, 2);
                }
            }
        } else if (type == 1) {
            if (x + 1 <= N) {
                if (pipes[x + 1][y] == 0) {
                    solve(x + 1, y, 1);
                }
            }
            if (x+1 <= N && y+1 <= N) {
                if (pipes[x+1][y+1] == 0 && pipes[x+1][y] == 0 && pipes[x][y+1] == 0) {
                    solve(x + 1, y + 1, 2);
                }
            }
        } else {
            if (y + 1 <= N) {
                if (pipes[x][y + 1] == 0) {
                    solve(x, y + 1, 0);
                }
            }
            if (x + 1 <= N) {
                if (pipes[x + 1][y] == 0) {
                    solve(x + 1, y, 1);
                }
            }
            if (x+1 <= N && y+1 <= N) {
                if (pipes[x+1][y+1] == 0 && pipes[x+1][y] == 0 && pipes[x][y+1] == 0) {
                    solve(x + 1, y + 1, 2);
                }
            }
        }
    }

     */
}

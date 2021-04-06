package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16929 {
    /*
    1. dfs
    2. found a visited spot & reached using a direction different from the direction right before -> cycle
       found a visited spot & used the same direction -> not a cycle
    3. no more same character -> no cycle (cancel all the routes)

    public static int N, M;
    public static char game [][];
    public static boolean visited [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        game = new char [N][M];
        visited = new boolean [N][M];
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                game[i][j] = line.charAt(j);
            }
        }
        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
                if (!visited[i][j]) {
                    visited[i][j] = true;
                    findCycle(i, j, -1);
                    visited[i][j] = false;
                }
            }
        }
        System.out.println("No");
    }

    public static void findCycle(int x, int y, int before) {
        for (int i=0; i<4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 <= nx && nx < N && 0 <= ny && ny < M) {
                if (!visited[nx][ny] && game[nx][ny] == game[x][y]) {
                    visited [nx][ny] = true;
                    //System.out.println(nx+","+ny);
                    findCycle(nx, ny, i);
                    visited[nx][ny] = false;
                } else if (visited[nx][ny] && game[nx][ny] == game[x][y]) {
                    if ((before == 0 && i == 1) || (before == 1 && i == 0) ||
                            (before == 2 && i == 3) || (before == 3 && i == 2)) {
                        continue;
                    } else {
                        System.out.println("Yes");
                        System.exit(0);
                    }
                }
            }
        }
    }
     */
}

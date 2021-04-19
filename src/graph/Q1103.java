package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1103 {
    /*
    public static int R, C;
    public static char board[][];
    public static int distance[][];
    public static boolean visited[][];
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        board = new char[R][C];
        distance = new int[R][C];
        visited = new boolean[R][C];
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                board[i][j] = line.charAt(j);
                distance[i][j] = -1;
            }
        }
        solve(0, 0);
        System.out.println(distance[0][0]);
    }

    public static int solve (int x, int y) {
        if (x<0 || R<=x || y<0 || C<=y || board[x][y] == 'H') {
            return 0;
        }
        if (visited[x][y]) {
            System.out.println(-1);
            System.exit(0);
        }
        if (distance[x][y] != -1) {
            return distance[x][y];
        }
        distance[x][y] = 0;
        visited[x][y] = true;
        int multiplier = board[x][y] - '0';
        for (int dir=0; dir<4; ++dir) {
            int nx = x + multiplier*dx[dir];
            int ny = y + multiplier*dy[dir];
            distance[x][y] = Math.max(distance[x][y], solve(nx, ny)+1);
        }
        visited[x][y] = false;
        return distance[x][y];
    }
     */
}


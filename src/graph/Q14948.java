package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q14948 {
    /*
    public static int R, C;
    public static int army[][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        army = new int[R][C];
        for (int i=0; i<R; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<C; ++j) {
                army[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs();
    }

    public static void bfs() {
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        int visited[][][][] = new int[2][2][R][C];
        for (int i=0; i<2; ++i) {
            for (int j=0; j<2; ++j) {
                for (int k=0; k<R; ++k) {
                    Arrays.fill(visited[i][j][k], -1);
                }
            }
        }
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        queue.add(new Coordinate(0, army[0][0], 0, 0));
        visited[0][0][0][0] = army[0][0];

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == R-1 && c.y == C-1) {
                System.out.println(c.max);
                return;
            }
            for (int dir=0; dir<4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx<0 || R<=nx || ny<0 || C<=ny) {
                    continue;
                }
                int nmax = Math.max(c.max, army[nx][ny]);
                if (visited[c.skipped][0][nx][ny] <= nmax && visited[c.skipped][0][nx][ny] != -1) {
                    continue;
                }
                visited[c.skipped][0][nx][ny] = nmax;
                queue.add(new Coordinate(c.skipped, nmax, nx, ny));

                if (c.skipped == 0) {
                    int nnx = nx + dx[dir];
                    int nny = ny + dy[dir];

                    if (nnx<0 || R<=nnx || nny<0 || C<=nny) {
                        continue;
                    }
                    nmax = Math.max(c.max, army[nnx][nny]);
                    if (visited[1][0][nnx][nny] <= nmax && visited[1][0][nnx][nny] != -1) {
                        continue;
                    }
                    if (visited[0][1][nx][ny] <= nmax && visited[0][1][nx][ny] != -1) {
                        continue;
                    }
                    visited[1][0][nnx][nny] = nmax;
                    visited[0][1][nx][ny] = nmax;
                    queue.add(new Coordinate(1, nmax, nnx, nny));
                }
            }
        }
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate> {
    int skipped;
    int max;
    int x;
    int y;

    Coordinate (int skipped, int max, int x, int y) {
        this.skipped = skipped;
        this.max = max;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo (Coordinate c) {
        return this.max - c.max;
    }
}
 */

package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q14948 {
    /*
    public static int R, C;
    public static int army[][];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        army = new int[R][C];
        for (int i = 0; i < R; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < C; ++j) {
                army[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs();
    }

    public static void bfs() {
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        int visited[][][][] = new int[2][2][R][C];
        for (int i = 0; i < 2; ++i) {
            for (int a = 0; a < 2; ++a) {
                for (int j = 0; j < R; ++j) {
                    for (int k = 0; k < C; ++k) {
                        visited[i][a][j][k] = -1;
                    }
                }
            }
        }
        visited[0][0][0][0] = army[0][0];
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        queue.add(new Coordinate(0, 0, 0, army[0][0]));
        int answer = 987_654_321;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();

            if (c.x == R - 1 && c.y == C - 1) {
                System.out.println(c.max);
                break;
            }
            for (int dir = 0; dir < 4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx < 0 || R <= nx || ny < 0 || C <= ny) {
                    continue;
                }
                int nmax = Math.max(c.max, army[nx][ny]);
                if (visited[0][c.skipped][nx][ny] <= nmax && visited[0][c.skipped][nx][ny] != -1) {
                    continue;
                } else {
                    visited[0][c.skipped][nx][ny] = nmax;
                    queue.add(new Coordinate(nx, ny, c.skipped, nmax));
                    //System.out.println(nx + "," + ny + "," + c.skipped + "," + nmax);
                }
                if (c.skipped == 0) {
                    int nnx = nx + dx[dir];
                    int nny = ny + dy[dir];
                    if (nnx < 0 || R <= nnx || nny < 0 || C <= nny) {
                        continue;
                    }
                    nmax = Math.max(c.max, army[nnx][nny]);
                    if (visited[1][0][nx][ny] <= nmax && visited[1][0][nx][ny] != -1) {
                        continue;
                    }
                    visited[0][1][nnx][nny] = nmax;
                    visited[1][0][nx][ny] = nmax;
                    queue.add(new Coordinate(nnx, nny, 1, nmax));
                }
            }
        }
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate> {
    int x;
    int y;
    int skipped;
    int max;

    Coordinate(int x, int y, int skipped, int max) {
        this.x = x;
        this.y = y;
        this.skipped = skipped;
        this.max = max;
    }

    @Override
    public int compareTo(Coordinate c) {
        if (this.max >= c.max) {
            return 1;
        } else {
            return -1;
        }
    }
}
 */

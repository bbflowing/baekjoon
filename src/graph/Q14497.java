package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q14497 {
    /*
    public static char map[][];
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        map = new char[N][M];
        Coordinate start = null;
        for (int i = 0; i < N; ++i) {
            String line = br.readLine();
            for (int j = 0; j < M; ++j) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == '*') {
                    start = new Coordinate(i, j, 0);
                    map[i][j] = '0';
                }
            }
        }

        bfs(start, N, M);
    }


    public static void bfs(Coordinate start, int N, int M) {
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(start);
        boolean visited[][] = new boolean[N][M];
        visited[start.x][start.y] = true;
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};

        while (!queue.isEmpty()) {

            Coordinate c = queue.poll();
            //System.out.println(c.x+","+c.y+","+map[c.x][c.y]);

            for (int i = 0; i < 4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (nx < 0 || N <= nx || ny < 0 || M <= ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (map[nx][ny] == '1') {
                    map[nx][ny] = '0';
                    queue.add(new Coordinate(nx, ny, c.jumps + 1));
                    visited[nx][ny] = true;
                } else if (map[nx][ny] == '0') {
                    queue.add(new Coordinate(nx, ny, c.jumps));
                    visited[nx][ny] = true;
                } else if (map[nx][ny] == '#') {
                    System.out.println(c.jumps+1);
                    System.exit(0);
                }
                //System.out.println(nx+","+ny);
            }
        }
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int jumps;

    Coordinate(int x, int y, int jumps) {
        this.x = x;
        this.y = y;
        this.jumps = jumps;
    }
}
 */

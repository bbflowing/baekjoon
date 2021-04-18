package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q5558 {
    /*
    public static int R, C;
    public static char map[][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        Coordinate start = null;
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'S') {
                    map[i][j] = '.';
                    start = new Coordinate (i, j, 0, 1);
                }
            }
        }
        bfs(start, K);
    }

    public static void bfs (Coordinate start, int max) {
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        boolean visited[][][] = new boolean[max+1][R][C];
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(start);
        visited[1][start.x][start.y] = true;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            int dst = map[c.x][c.y]-'0';
            if (c.target == dst) {
                if (dst == max) {
                    System.out.println(c.distance);
                    return;
                }
                visited[dst+1][c.x][c.y] = true;
                queue.add(new Coordinate(c.x, c.y, c.distance, dst+1));
                continue;
            }

            for (int dir=0; dir<4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (!check(nx, ny)) continue;
                if (visited[c.target][nx][ny]) continue;
                if (map[nx][ny] == 'X') continue;

                visited[c.target][nx][ny] = true;
                queue.add(new Coordinate(nx, ny, c.distance+1, c.target));
            }
        }
    }

    public static boolean check (int x, int y) {
        if (x<0 || R<=x || y<0 || C<=y) {
            return false;
        }
        return true;
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int distance;
    int target;

    Coordinate (int x, int y, int distance, int target) {
        this.x = x;
        this.y = y;
        this.distance = distance;
        this.target = target;
    }
}
 */
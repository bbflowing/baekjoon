package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q15092 {

    public static char map [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        map = new char [N][M];
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                map[i][j] = line.charAt(j);
            }
        }
        int counter = 0;
        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
                if (map[i][j] == '#') {
                    ++counter;
                    bfs(i, j, N, M);
                }
            }
        }
        System.out.println(counter);
    }

    public static void bfs (int x, int y, int N, int M) {
        int dx[] = {-1, -1, -1, 0, 0, 1, 1, 1};
        int dy[] = {-1, 0, 1, -1, 1, -1, 0, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(x, y));
        map[x][y] = '.';

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            for (int i = 0; i < 8; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (nx < 0 || N <= nx || ny < 0 || M <= ny) {
                    continue;
                }
                if (map[nx][ny] == '.') {
                    continue;
                }
                map[nx][ny] = '.';
                queue.add(new Coordinate(nx, ny));
            }
        }
    }
}

class Coordinate {
    int x;
    int y;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

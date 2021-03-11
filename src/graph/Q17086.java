package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q17086 {
    /*
    public static int map [][];

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        map = new int [N][M];
        ArrayList<Coordinate> sharks = new ArrayList<>();

        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; ++j) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int answer = 0;
        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
                if (map[i][j] == 0) {
                    int temp = bfs(i, j, N, M);
                    if (temp > answer) {
                        answer = temp;
                    }
                }
            }
        }
        System.out.println(answer);
    }

    public static int bfs (int x, int y, int N, int M) {
        int dx [] = {-1, -1, -1, 0, 0, +1, +1, +1};
        int dy [] = {-1, 0, +1, -1, +1, -1, 0, +1};
        boolean visited [][] = new boolean [N][M];
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(x, y, 0));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (map[c.x][c.y] == 1) {
                //System.out.println(c.distance);
                return c.distance;
            }
            for (int i=0; i<8; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (nx<0 || N<=nx || ny<0 || M<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                visited[nx][ny] = true;
                queue.add(new Coordinate(nx, ny, c.distance+1));
                //System.out.println(nx+","+ny+","+(c.distance+1));
            }
        }
        return -1;
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int distance;

    Coordinate (int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}
 */

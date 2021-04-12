package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q17129 {
    /*
    public static int R, C;
    public static int island [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        island = new int [R][C];
        int startX = 0; int startY = 0;
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                island[i][j] = line.charAt(j)-'0';
                if (island[i][j] == 2) {
                    startX = i; startY = j;
                }
            }
        }
        bfs(startX, startY);
    }

    public static void bfs (int x, int y) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        boolean visited [][] = new boolean [R][C];
        visited[x][y] = true;
        queue.add(new Coordinate(x, y, 0));

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (3 <= island[c.x][c.y] && island[c.x][c.y] <= 5) {
                System.out.println("TAK");
                System.out.println(c.distance);
                return;
            }

            for (int dir=0; dir<4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx<0 || R<=nx || ny<0 || C<=ny) {
                    continue;
                }
                if (island[nx][ny] == 1) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                queue.add(new Coordinate(nx, ny, c.distance+1));
                visited[nx][ny] = true;
            }
        }
        System.out.println("NIE");
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

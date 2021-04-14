package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q17836 {
    /*
    public static int R, C;
    public static int castle [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        castle = new int [R+1][C+1];
        for (int i=1; i<=R; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=C; ++j) {
                castle[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs(T);
    }
    public static void bfs (int T) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        boolean visited [][][] = new boolean [2][R+1][C+1];
        visited[0][1][1] = true;
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(1, 1, 0, 0));

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == R && c.y == C && c.distance<=T) {
                System.out.println(c.distance);
                return;
            }
            if (c.distance > T) {
                System.out.println("Fail");
                return;
            }
            for (int dir=0; dir<4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx<1 || R<nx || ny<1 || C<ny) {
                    continue;
                }
                if (castle[nx][ny] == 0) {
                    if (!visited[c.sword][nx][ny]) {
                        visited[c.sword][nx][ny] = true;
                        queue.add(new Coordinate(nx, ny, c.distance+1, c.sword));
                    }
                } else if (castle[nx][ny] == 1) {
                    if (c.sword == 1 && !visited[1][nx][ny]) {
                        visited[1][nx][ny] = true;
                        queue.add(new Coordinate(nx, ny, c.distance+1, 1));
                    }
                } else if (castle[nx][ny] == 2) {
                    int nsword = 1;
                    if (!visited[nsword][nx][ny]) {
                        visited[1][nx][ny] = true;
                        queue.add(new Coordinate(nx, ny, c.distance+1, nsword));
                    }
                }
            }
        }
        System.out.println("Fail");
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int distance;
    int sword;

    Coordinate (int x, int y, int distance, int sword) {
        this.x = x;
        this.y = y;
        this.distance = distance;
        this.sword = sword;
    }
}
 */
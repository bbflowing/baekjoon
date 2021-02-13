package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q14923 {
    public static int input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int hx = Integer.parseInt(st.nextToken()); int hy = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int ex = Integer.parseInt(st.nextToken()); int ey = Integer.parseInt(st.nextToken());
        input = new int [N+1][M+1];
        for (int i=1; i<=N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=M; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs(hx, hy, ex, ey, N, M);
    }
    public static void bfs(int hx, int hy, int ex, int ey, int N, int M) {
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        queue.add(new Coordinate(hx, hy, 0, 0));
        int min = 987_654_321;
        boolean check [][][] = new boolean [N+1][M+1][2];
        check[hx][hy][0] = true;

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            if (current.x == ex && current.y == ey) {
                min = current.distance;
                break;
            }

            for (int i=0; i<4; ++i) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                int nbroken = current.broken;
                int ndistance = current.distance;

                if (nx<=0 || N+1<=nx || ny<=0 || M+1<=ny) {
                    continue;
                }
                if (input[nx][ny] == 0 && !check[nx][ny][nbroken]) {
                    queue.add(new Coordinate(nx, ny, nbroken, ndistance + 1));
                    check[nx][ny][nbroken] = true;
                }
                if (input[nx][ny] == 1 && nbroken + 1 <= 1 && !check[nx][ny][nbroken+1]) {
                    queue.add(new Coordinate(nx, ny, nbroken+1, ndistance+1));
                    check[nx][ny][nbroken+1] = true;
                }
            }
        }
        if (min == 987_654_321) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    }
}

class Coordinate implements Comparable<Coordinate>{
    int x;
    int y;
    int broken;
    int distance;

    Coordinate (int x, int y, int broken, int distance) {
        this.x = x;
        this.y = y;
        this.broken = broken;
        this.distance = distance;
    }

    @Override
    public int compareTo(Coordinate o) {
        return this.distance - o.distance;
    }
}

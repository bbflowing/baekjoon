package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q18405 {
    /*
    public static int N;
    public static int virus[][];
    public static PriorityQueue<Coordinate> queue;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        virus = new int[N + 1][N + 1];
        queue = new PriorityQueue<>();
        for (int i = 1; i <= N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; ++j) {
                virus[i][j] = Integer.parseInt(st.nextToken());
                if (virus[i][j] != 0) {
                    queue.add(new Coordinate(virus[i][j], i, j));
                }
            }
        }
        st = new StringTokenizer(br.readLine());
        int time = Integer.parseInt(st.nextToken());
        int endX = Integer.parseInt(st.nextToken());
        int endY = Integer.parseInt(st.nextToken());
        if (time == 0) {
            System.out.println(virus[endX][endY]);
        } else {
            for (int i = 1; i <= time; ++i) {
                bfs();
            }
            System.out.println(virus[endX][endY]);
        }
    }

    public static void bfs() {
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        PriorityQueue<Coordinate> next = new PriorityQueue<>();


        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            for (int dir = 0; dir < 4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx < 1 || N < nx || ny < 1 || N < ny) {
                    continue;
                }
                if (virus[nx][ny] != 0) {
                    continue;
                }
                virus[nx][ny] = c.type;
                next.add(new Coordinate(c.type, nx, ny));
            }
        }
        queue = next;
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate> {
    int type;
    int x;
    int y;

    Coordinate(int type, int x, int y) {
        this.type = type;
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Coordinate c) {
        return this.type - c.type;
    }
}
 */

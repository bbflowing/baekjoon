package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q13565 {
    public static char input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        input = new char [M][N];
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        for (int i=0; i<M; ++i) {
            String line = br.readLine();
            for (int j=0; j<N; ++j) {
                input[i][j] = line.charAt(j);
                if (i == 0) {
                    queue.add(new Coordinate(i, j, 0));
                }
            }
        }
        bfs(queue, M, N);
    }
    public static void bfs(PriorityQueue<Coordinate> queue, int M, int N) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        boolean check [][] = new boolean [M][N];

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            check[current.x][current.y] = true;
            if (current.x == M-1) {
                System.out.println("YES");
                System.exit(0);
            }
            for (int i=0; i<4; ++i) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                int ndistance = current.distance;
                if (nx < 0 || M <= nx || ny < 0 || N <= ny) {
                    continue;
                }
                if (input[nx][ny] == '1') {
                    continue;
                }
                if (check[nx][ny]) {
                    continue;
                }
                queue.add(new Coordinate(nx, ny, ndistance + 1));
                check[nx][ny] = true;
            }
        }
        System.out.println("NO");
    }
}

class Coordinate implements Comparable<Coordinate>{
    int x;
    int y;
    int distance;

    Coordinate (int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }

    @Override
    public int compareTo(Coordinate o) {
        return this.distance - o.distance;
    }
}

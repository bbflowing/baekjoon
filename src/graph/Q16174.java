package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16174 {
    /*
    public static int input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        input = new int [N][N];
        for (int i=0; i<N; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs(N);
    }
    public static void bfs (int N) {
        Queue<Coordinate> queue = new LinkedList<>();
        boolean visited [][] = new boolean [N][N];
        visited[0][0] = true;
        queue.add(new Coordinate(0, 0));
        int dx [] = {0, 1};
        int dy [] = {1, 0};

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            int distance = input[current.x][current.y];
            if (distance == -1) {
                System.out.println("HaruHaru");
                System.exit(0);
            }
            for (int i=0; i<2; ++i) {
                int nx = current.x + dx[i]*distance;
                int ny = current.y + dy[i]*distance;

                if (nx<0 || N<=nx || ny<0 || N<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                visited[nx][ny] = true;
                queue.add(new Coordinate(nx, ny));
            }
        }
        System.out.println("Hing");
    }
     */
}

/*
class Coordinate {
    int x;
    int y;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
 */

package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2178 {
    /*
    public static boolean input [][];
    public static boolean check [][];

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        input = new boolean [N][M];
        check = new boolean [N][M];


        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                if (line.charAt(j) == '1') {
                    input[i][j] = true;
                } else {
                    input[i][j] = false;
                }
            }
        }

        bfs (0, 0, N, M);
    }

    public static void bfs (int x, int y, int N, int M) {
        Queue<Coordinate> queue = new LinkedList<>();
        int rank [][] = new int [N][M];
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        queue.add(new Coordinate(x, y));
        check[x][y] = true;
        rank[x][y] = 1;

        while (!queue.isEmpty()) {
            Coordinate visited = queue.poll();

            for (int i=0; i<4; ++i) {
                int targetX = visited.x + dx[i];
                int targetY = visited.y + dy[i];

                if (targetX == N-1 && targetY == M-1) {
                    System.out.println(rank[visited.x][visited.y]+1);
                    System.exit(0);
                } else if (0 <= targetX && targetX < N && 0 <= targetY && targetY < M) {
                    if (input[targetX][targetY] && !check[targetX][targetY]) {
                        queue.add(new Coordinate(targetX, targetY));
                        check[targetX][targetY] = true;
                        rank[targetX][targetY] = rank[visited.x][visited.y] + 1;
                    }
                }
            }
        }
    }
    */
}
/*

class Coordinate {
    int x;
    int y;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
*/



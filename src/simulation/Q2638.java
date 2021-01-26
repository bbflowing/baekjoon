package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2638 {
    public static int input [][];
    public static int total;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new int [N][M];
        total = 0;
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
                if (input[i][j] == 1) ++total;
            }
        }
        int answer = 0;

        while (true) {
            bfs(0, 0, N, M);
            if (total == 0) {
                ++answer;
                System.out.println(answer);
                break;
            }else {
                ++answer;
            }
        }

    }
    public static void bfs (int x, int y, int N, int M) {
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(x,y));
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        int cheese [][] = new int [N][M];

        while (!queue.isEmpty()) {
            Coordinate next = queue.poll();
            for (int i =0; i<4; ++i) {
                int newX = next.x + dx[i];
                int newY = next.y + dy[i];

                if (newX < 0 || N <= newX || newY < 0 || M <= newY) continue;
                if (input[newX][newY] == 0 && cheese[newX][newY] == 0) {
                    queue.add(new Coordinate(newX, newY));
                    cheese[newX][newY] = 1;
                } else if (input[newX][newY] == 1) {
                    ++cheese[newX][newY];
                    if (cheese[newX][newY] >= 2) {
                        input[newX][newY] = 0;
                        --total;
                    }
                }
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
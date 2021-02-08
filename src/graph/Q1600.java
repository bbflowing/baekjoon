package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1600 {
    public static int input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        input = new int [H][W];
        for (int i=0; i<H; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<W; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs(K, H, W);
    }

    public static void bfs (int K, int H, int W) {
        int knightX [] = {-2, -1, -2, -1, 1, 2, 1, 2};
        int knightY [] = {-1, -2, 1, 2, -2, -1, 2, 1};
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        boolean check [][][] = new boolean [H][W][K+1];
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(0, 0, 0, 0));
        int min = 987_654_321;

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            int nx = current.x; int ny = current.y;
            if (nx == H-1 && ny == W-1) {
                if (min > current.distance) {
                    min = current.distance;
                }
            }
            int nknight = current.knight;
            int ndistance = current.distance;

            if (nknight+1 <= K) {
                for (int i=0; i<8; ++i) {
                    nx = current.x + knightX[i];
                    ny = current.y + knightY[i];

                    if (nx < 0 || H <= nx || ny < 0 || W <= ny) {
                        continue;
                    }

                    if (input[nx][ny] == 1) {
                        continue;
                    }

                    if (!check[nx][ny][nknight+1]) {
                        queue.add(new Coordinate(nx, ny, nknight + 1, ndistance + 1));
                        check[nx][ny][nknight + 1] = true;
                    }
                }
            }
            for (int i=0; i<4; ++i) {
                nx = current.x + dx[i];
                ny = current.y + dy[i];
                if (nx < 0 || H <= nx || ny < 0 || W <= ny) {
                    continue;
                }
                if (check[nx][ny][nknight]) {
                    continue;
                }
                if (input[nx][ny] == 1) {
                    continue;
                }
                queue.add(new Coordinate(nx, ny, nknight, ndistance+1));
                check[nx][ny][nknight] = true;
            }
        }
        if (min == 987_654_321) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }
    }
}
class Coordinate {
    int x;
    int y;
    int knight;
    int distance;

    Coordinate (int x, int y, int knight, int distance) {
        this.x = x;
        this.y = y;
        this.knight = knight;
        this.distance = distance;
    }
}

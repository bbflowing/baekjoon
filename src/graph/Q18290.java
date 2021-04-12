package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q18290 {
    /*
    public static int R, C, answer;
    public static int board [][];
    public static boolean visited [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        board = new int [R][C];
        answer = -40001;
        for (int i=0; i<R; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<C; ++j) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i=0; i<R; ++i) {
            for (int j=0; j<C; ++j) {
                visited = new boolean [R][C];
                visited[i][j] = true;
                for (int k=0; k<4; ++k) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx<0 || R<=nx || ny<0 || C<=ny) {
                        continue;
                    }
                    visited[nx][ny] = true;
                }
                solve(i, j+1, K-1, board[i][j]);
            }
        }
        System.out.println(answer);
    }

    public static void solve (int x, int y, int remaining, int sum) {
        if (remaining == 0) {
            if (answer < sum) {
                answer = sum;
            }
            return;
        }
        if (y == C) {
            solve(x+1, 0, remaining, sum);
            return;
        }
        if (x == R) {
            return;
        }

        if (visited[x][y]) {
            solve(x, y+1, remaining, sum);
            return;
        }
        solve(x, y+1, remaining, sum);
        ArrayList<Coordinate> route = new ArrayList<>();
        route.add(new Coordinate(x,y));
        visited[x][y] = true;
        for (int dir=0; dir<4; ++dir) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx<0 || R<=nx || ny<0 || C<=ny) {
                continue;
            }
            if (visited[nx][ny]) {
                continue;
            }
            route.add(new Coordinate(nx, ny));
            visited[nx][ny] = true;
        }
        solve(x, y+1, remaining-1, sum+board[x][y]);
        for (int i=0; i<route.size(); ++i) {
            Coordinate c = route.get(i);
            visited[c.x][c.y] = false;
        }
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

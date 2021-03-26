package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q14620 {
    /*
    public static int N, min;
    public static int garden [][];
    public static boolean visited [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        garden = new int [N+1][N+1];
        for (int i=1; i<=N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=N; ++j) {
                garden[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        visited = new boolean [N+1][N+1];
        min = 987_654_321;
        solve(2, 2, 0, 0);
        System.out.println(min);
    }

    public static void solve (int x, int y, int count, int sum) {
        if (count == 3) {
            if (min > sum) {
                min = sum;
            }
            return;
        }

        if (x == N+1) {
            return;
        }

        if (y == N+1) {
            solve(x+1, 1, count, sum);
            return;
        }

        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        if (!visited[x][y]) {
            ArrayList<Coordinate> route = new ArrayList<>();
            boolean fail = false;
            for (int i=0; i<4; ++i) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx<1 || N+1<=nx || ny<1 || N+1<=ny) {
                    fail = true;
                    break;
                }
                if (visited[nx][ny]) {
                    fail = true;
                    break;
                }
                route.add(new Coordinate(nx, ny));
            }
            if (fail) {
                solve(x, y+1, count, sum);
            } else {
                int flower = 0;
                route.add(new Coordinate(x, y));
                for (int i=0; i<route.size(); ++i) {
                    Coordinate target = route.get(i);
                    visited[target.x][target.y] = true;
                    flower += garden[target.x][target.y];
                }
                solve(x, y+1, count+1, sum+flower);
                for (int i=0; i<route.size(); ++i) {
                    Coordinate target = route.get(i);
                    visited[target.x][target.y] = false;
                }
                solve(x, y+1, count, sum);
            }
        } else {
            solve(x, y+1, count, sum);
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

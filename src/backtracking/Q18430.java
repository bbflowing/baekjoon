package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q18430 {
    /*
    public static int map [][];
    public static boolean visited [][];
    public static int N, M, max;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int [N][M];
        visited = new boolean [N][M];
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; ++j) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        max = 0;
        solve(0, 0, 0);
        System.out.println(max);
    }

    public static void solve (int x, int y, int sum) {
        if (y == M) {
            solve(x+1, 0, sum);
            return;
        }

        if (x == N) {
            if (max < sum) {
                max = sum;
            }
            return;
        }
        if (visited[x][y]) {
            solve(x, y+1, sum);
            return;
        }
        solve(x, y+1, sum);
        for (int i=0; i<4; ++i) {
            int x1 = x; int y1 = y; int x2 = x; int y2 = y;
            if (i==0) {
                y1 -= 1; x2 += 1;
            } else if (i==1) {
                x1 -= 1; y2 -=1;
            } else if (i==2) {
                x1 -= 1; y2 += 1;
            } else if (i==3) {
                x1 += 1; y2 += 1;
            }
            boolean result = check(x1, y1, x2, y2);
            if (!result) {
                continue;
            }
            visited[x1][y1] = true;
            visited[x2][y2] = true;
            visited[x][y] = true;
            ArrayList<Coordinate> block = new ArrayList<>();
            block.add(new Coordinate(x1, y1));
            block.add(new Coordinate(x2, y2));
            block.add(new Coordinate(x, y));
            sum += 2*map[x][y] + map[x1][y1] + map[x2][y2];
            solve(x, y+1, sum);
            for (int j=0; j<3; ++j) {
                Coordinate target = block.get(j);
                visited[target.x][target.y] = false;
            }
            sum -= (2*map[x][y] + map[x1][y1] + map[x2][y2]);
        }

    }

    public static boolean check (int x1, int y1, int x2, int y2) {
        if (x1<0 || N<=x1 || y1<0 || M<=y1) {
            return false;
        }
        if (x2<0 || N<=x2 || y2<0 || M<=y2) {
            return false;
        }
        if (visited[x1][y1] || visited[x2][y2]) {
            return false;
        }
        return true;
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
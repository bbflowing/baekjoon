package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1937 {
    /*
    public static int forest[][];
    public static int distance[][];
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};
    public static int N;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        forest = new int[N][N];
        distance = new int[N][N];
        StringTokenizer st;
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                distance[i][j] = -1;
                forest[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int answer = -1;
        for (int i=0; i<N; ++i) {
            for (int j=0; j<N; ++j) {
                solve(i, j);
                answer = answer < distance[i][j] ? distance[i][j] : answer;
            }
        }
        System.out.println(answer);
    }

    public static int solve (int x, int y) {
        if (distance[x][y] != -1) {
            return distance[x][y];
        }
        distance[x][y] = 1;

        for (int dir=0; dir<4; ++dir) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx<0 || N<=nx || ny<0 || N<=ny) {
                continue;
            }
            if (forest[x][y] >= forest[nx][ny]) {
                continue;
            }
            distance[x][y] = Math.max(distance[x][y], solve(nx, ny)+1);
        }
        return distance[x][y];
    }
     */
}
package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q14868 {
    /*
    public static int N;
    public static int map[][];
    public static int group[][];
    public static int parents[];
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        for (int i=0; i<K; ++i) {
            st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken())-1;
            int x = N-Integer.parseInt(st.nextToken());
            map[x][y] = 1;
        }
        group = new int[N][N];
        int counter = 0;
        for (int i=0; i<N; ++i) {
            for (int j=0; j<N; ++j) {
                if (map[i][j] == 1 && group[i][j] == 0) {
                    ++counter;
                    group[i][j] = counter;
                    grouping(i, j, counter);
                }
            }
        }
        parents = new int [counter+1];
        for (int i=1; i<counter+1; ++i) {
            parents[i] = i;
        }


    }
    public static void grouping (int x, int y, int counter) {
        for (int dir=0; dir<4; ++dir) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx<0 || N<=nx || ny<0 || N<=ny) {
                continue;
            }
            if (group[nx][ny] != 0) {
                continue;
            }
            if (map[nx][ny] == 0) {
                continue;
            }
            group[nx][ny] = counter;
            grouping(nx, ny, counter);
        }
    }
     */
}
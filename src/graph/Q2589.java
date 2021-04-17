package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2589 {
    /*
    public static int R, C;
    public static char map[][];
    public static int groups[][];
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        groups = new int[R][C];
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for(int j=0; j<C; ++j) {
                map[i][j] = line.charAt(j);
            }
        }
        int counter = 0;
        for (int i=0; i<R; ++i) {
            for (int j=0; j<C; ++j) {
                if (map[i][j] == 'L' && groups[i][j] == 0) {
                    ++counter;
                    groups[i][j] = counter;
                    solve(i, j, counter);
                }
            }
        }
        int answer = -1;
        for (int i=0; i<R; ++i) {
            for (int j=0; j<C; ++j) {
                if (groups[i][j] != 0) {
                    int result = bfs(i, j, groups[i][j]);
                    answer = result > answer ? result : answer;
                }
            }
        }
        System.out.println(answer);
    }

    public static int bfs (int x, int y, int group) {
        boolean visited[][] = new boolean[R][C];
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(x, y, 0));
        visited[x][y] = true;
        int max = -1;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            max = max < c.distance ? c.distance : max;

            for (int dir=0; dir<4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx<0 || R<=nx || ny<0 || C<=ny) {
                    continue;
                }
                if (groups[nx][ny] != group) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                queue.add(new Coordinate(nx, ny, c.distance+1));
                visited[nx][ny] = true;
            }
        }
        return max;
    }

    public static void solve (int x, int y, int counter) {
        for (int dir=0; dir<4; ++dir) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx<0 || R<=nx || ny<0 || C<=ny) {
                continue;
            }
            if (groups[nx][ny] != 0) {
                continue;
            }
            if (map[nx][ny] == 'W') {
                continue;
            }
            groups[nx][ny] = counter;
            solve(nx, ny, counter);
        }
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int distance;

    Coordinate (int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}
 */
package graph;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16441 {
    /*
    public static int R, C;
    public static char map[][];
    public static boolean visited[][];

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        ArrayList<Coordinate> wolves = new ArrayList<>();
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'W') {
                    wolves.add(new Coordinate(i, j));
                }
            }
        }
        visited = new boolean[R][C];
        for (int i=0; i<wolves.size(); ++i) {
            Coordinate wolf = wolves.get(i);
            bfs(wolf);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i=0; i<R; ++i) {
            StringBuilder sb = new StringBuilder();
            for (int j=0; j<C; ++j) {
                if (map[i][j] == '.' && !visited[i][j]) {
                    map[i][j] = 'P';
                }
                sb.append(map[i][j]);
            }
            bw.append(sb);
            bw.newLine();
        }
        bw.flush();
    }

    public static void bfs (Coordinate wolf) {
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        visited[wolf.x][wolf.y] = true;
        queue.add(wolf);

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            for (int dir=0; dir<4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (!range(nx, ny)) continue;

                if (visited[nx][ny]) {
                    continue;
                }
                if (map[nx][ny] == '#') {
                    continue;
                } else if (map[nx][ny] == '+') {
                    while (true) {
                        nx += dx[dir];
                        ny += dy[dir];

                        if (!range(nx, ny)) break;
                        if (map[nx][ny] == '#') {
                            nx -= dx[dir]; ny -= dy[dir];
                            if (!visited[nx][ny]) {
                                visited[nx][ny] = true;
                                queue.add(new Coordinate(nx, ny));
                            }
                            break;
                        } else if (map[nx][ny] == '.') {
                            if (!visited[nx][ny]) {
                                visited[nx][ny] = true;
                                queue.add(new Coordinate(nx, ny));
                            }
                            break;
                        }
                    }
                } else if (map[nx][ny] == '.') {
                    if (!visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.add(new Coordinate(nx, ny));
                    }
                }
            }
        }
    }

    public static boolean range (int x, int y) {
        if (x<0 || R<=x || y<0 || C<=y) {
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

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
 */

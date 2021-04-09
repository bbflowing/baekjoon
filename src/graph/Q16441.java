package graph;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q16441 {
    /*
    public static int R, C;
    public static char map [][];
    public static boolean visited [][];
    public static boolean answer [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char [R][C];
        visited = new boolean [R][C];
        answer = new boolean [R][C];
        ArrayList<Coordinate> wolves = new ArrayList<>();
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'W') {
                    wolves.add(new Coordinate(i, j));
                    visited[i][j] = true;
                    answer[i][j] = true;
                }
            }
        }
        for (int i=0; i<wolves.size(); ++i) {
            Coordinate w = wolves.get(i);
            dfs(w.x, w.y);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i=0; i<R; ++i) {
            String temp = "";
            for (int j=0; j<C; ++j) {
                if (map[i][j] != '.') {
                    temp += map[i][j];
                } else {
                    if (!answer[i][j]) {
                        temp += 'P';
                    } else {
                        temp += '.';
                    }
                }
            }
            bw.append(temp);
            bw.newLine();
        }
        bw.flush();
    }

    public static void dfs (int x, int y) {
        for (int i=0; i<4; ++i) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx<0 || R<=nx || ny<0 || C<=ny) {
                continue;
            }
            if (visited[nx][ny] || answer[nx][ny]) {
                continue;
            }
            if (map[nx][ny] == '#') {
                continue;
            } else if (map[nx][ny] == '+') {
                int nnx = nx; int nny = ny;
                while (true) {
                    nnx += dx[i];
                    nny += dy[i];

                    if (map[nnx][nny] == '#') {
                        nnx -= dx[i];
                        nny -= dy[i];
                        break;
                    } else if (map[nnx][nny] == '.') {
                        break;
                    }
                }
                if (visited[nnx][nny] || answer[nnx][nny]) {
                    continue;
                }
                visited[nnx][nny] = true;
                answer[nnx][nny] = true;
                dfs(nnx, nny);
                visited[nnx][nny] = false;
            } else {
                visited[nx][ny] = true;
                answer[nx][ny] = true;
                dfs(nx, ny);
                visited[nx][ny] = false;
            }
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

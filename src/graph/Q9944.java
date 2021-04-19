package graph;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q9944 {
    /*
    public static int R, C, answer;
    public static char board[][];
    public static boolean visited[][];
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = 0;
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            ++T;
            StringTokenizer st = new StringTokenizer(line);
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            board = new char[R][C];
            int blanks = 0;
            ArrayList<Coordinate> start = new ArrayList<>();
            for (int i = 0; i < R; ++i) {
                line = br.readLine();
                for (int j = 0; j < C; ++j) {
                    board[i][j] = line.charAt(j);
                    if (board[i][j] == '.') {
                        ++blanks;
                        start.add(new Coordinate(i, j));
                    }
                }
            }
            answer = 987_654_321;
            for (int i = 0; i < start.size(); ++i) {
                visited = new boolean[R][C];
                Coordinate target = start.get(i);
                visited[target.x][target.y] = true;
                solve(target.x, target.y, 0, blanks-1);
            }
            StringBuilder sb = new StringBuilder();
            if (answer == 987_654_321) {
                sb.append("Case "+T+": "+-1);
            } else {
                sb.append("Case "+T+": "+answer);
            }
            bw.append(sb);
            bw.newLine();
        }
        bw.flush();
    }

    public static void solve (int x, int y, int times, int blanks) {
        if (blanks == 0) {
            if (answer > times) {
                answer = times;
            }
            return;
        }

        for (int dir=0; dir<4; ++dir) {
            int nx = x; int ny = y;
            ArrayList<Coordinate> route = new ArrayList<>();
            while (true) {
                nx += dx[dir]; ny += dy[dir];

                if (nx<0 || R<=nx || ny<0 || C<=ny) {
                    nx -= dx[dir]; ny -= dy[dir];
                    break;
                }
                if (board[nx][ny] == '*') {
                    nx -= dx[dir]; ny -= dy[dir];
                    break;
                }
                if (visited[nx][ny]) {
                    nx -= dx[dir]; ny -= dy[dir];
                    break;
                }
                visited[nx][ny] = true;
                route.add(new Coordinate(nx, ny));
                --blanks;
            }
            if (route.size() == 0) {
                continue;
            }
            solve(nx, ny, times+1, blanks);
            for (int i=0; i<route.size(); ++i) {
                Coordinate c = route.get(i);
                visited[c.x][c.y] = false;
                ++blanks;
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
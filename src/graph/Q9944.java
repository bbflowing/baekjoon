package graph;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q9944 {
    /*
    public static int N, M, answer;
    public static char board [][];
    public static boolean visited [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};

    public static void main (String args[]) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int cases = 0;
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            ++cases;
            if (cases > 1) {
                bw.newLine();
            }
            st = new StringTokenizer(line);
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            board = new char[N][M];
            int blanks = 0;
            for (int i = 0; i < N; ++i) {
                line = br.readLine();
                for (int j = 0; j < M; ++j) {
                    board[i][j] = line.charAt(j);
                    if (board[i][j] == '.') {
                        ++blanks;
                    }
                }
            }
            answer = 987_654_321;
            for (int i = 0; i < N; ++i) {
                for (int j = 0; j < M; ++j) {
                    if (board[i][j] == '.') {
                        visited = new boolean[N][M];
                        visited[i][j] = true;
                        solve(i, j, blanks - 1, 0);
                    }
                }
            }
            String temp = "Case " + cases + ": ";
            if (answer != 987_654_321) {
                temp += answer;
            } else {
                temp += -1;
            }
            bw.append(temp);
        }
        bw.flush();
    }

    public static void solve (int x, int y, int blanks, int levels) {
        if (blanks == 0) {
            if (answer > levels) {
                answer = levels;
            }
            return;
        }
        for (int dir=0; dir<4; ++dir) {
            int nx = x; int ny = y;
            ArrayList<Coordinate> route = new ArrayList<>();
            while (true) {
                nx += dx[dir]; ny += dy[dir];
                if (nx<0 || N<=nx || ny<0 || M<=ny) {
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
            solve(nx, ny, blanks, levels+1);
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

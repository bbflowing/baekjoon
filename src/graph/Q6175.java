package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6175 {
    public static int R, C, max, endR, endC, answer;
    public static char[][] map;
    public static boolean[][] visited;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        map = new char[R+1][C+1];
        visited = new boolean[R+1][C+1];
        String line = "";
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                map[r][c] = line.charAt(c);
            }
        }
        st = new StringTokenizer(br.readLine());
        int startR = Integer.parseInt(st.nextToken());
        int startC = Integer.parseInt(st.nextToken());
        endR = Integer.parseInt(st.nextToken());
        endC = Integer.parseInt(st.nextToken());
        answer = 0;
        for (int time=1; time<T; ++time) {
            max = time;
            solve(startR, startC, 0);
        }
        System.out.println(answer);

    }

    public static void solve (int r, int c, int time) {
        if (r == endR && c == endC && time == max) {
            ++answer;
            System.out.println(max);
            return;
        }
        if (visited[r][c]) return;
        visited[r][c] = true;
        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];

            if (nr<1 || R<nr || nc<1 || C<nc) {
                continue;
            }
            if (map[nr][nc] == '*') {
                continue;
            }
            solve(nr, nc, time+1);
        }
        visited[r][c] = false;
    }
}
class Coordinate {
    int r;
    int c;

    Coordinate (int r, int c) {
        this.r = r;
        this.c = c;
    }
}

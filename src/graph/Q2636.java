package graph;

// 치즈

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2636 {
    /*
    public static int R, C, cheese;
    public static int[][] board;
    public static boolean[][] visited;
    public static Queue<Piece> queue;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        board = new int[R][C];
        cheese = 0;
        for (int r=0; r<R; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<C; ++c) {
                board[r][c] = Integer.parseInt(st.nextToken());
                if (board[r][c] == 1) ++cheese;
            }
        }

        int time = 0;
        int before = 0;
        while (true) {
            visited = new boolean[R][C];
            queue = new ArrayDeque<>();
            visited[0][0] = true;
            queue.add(new Piece(0, 0));
            air(0, 0);
            ++time;
            before = cheese;
            melt();
            if (cheese == 0) {
                System.out.println(time);
                System.out.println(before);
                break;
            }
        }
    }

    public static void melt() {
        int size = queue.size();
        for (int i=0; i<size; ++i) {
            Piece cur = queue.poll();
            for (int dir = 0; dir < 4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (nr < 0 || R <= nr || nc < 0 || C <= nc) continue;
                if (board[nr][nc] == 0) continue;
                --cheese;
                board[nr][nc] = 0;
            }
        }
    }

    public static void air(int r, int c) {
        for (int dir=0; dir<4; ++dir) {
            int nr = r + dr[dir];
            int nc = c + dc[dir];
            if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
            if (visited[nr][nc]) continue;
            if (board[nr][nc] == 1) continue;
            visited[nr][nc] = true;
            queue.add(new Piece(nr, nc));
            air(nr, nc);
        }
    }
     */
}

/*
class Piece {
    int r, c;

    Piece(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */

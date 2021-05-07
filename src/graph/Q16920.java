package graph;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16920 {
    /*
    public static int R, C, P, count;
    public static Queue<Coordinate>[] queues;
    public static int[][] board;
    public static int[] moves, answer;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());
        board = new int[R][C];
        moves = new int[P+1];
        answer = new int[P+1];
        queues = new ArrayDeque[P+1];
        for (int i=0; i<P+1; ++i) queues[i] = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=P; ++i) moves[i] = Integer.parseInt(st.nextToken());
        for (int r=0; r<R; ++r) {
            String line = br.readLine();
            for (int c=0; c<C; ++c) {
                char target = line.charAt(c);
                if (target == '#') board[r][c] = -1;
                if ('1' <= target && target <= '9') {
                    board[r][c] = target - '0';
                    queues[board[r][c]].add(new Coordinate(r, c));
                    ++answer[board[r][c]];
                }
            }
        }

        count = 0;
        while (count != P) {
            for (int i=1; i<=P; ++i) {
                if (queues[i].size() == 0) continue;
                spread(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i=1; i<=P; ++i) sb.append(answer[i]+" ");
        bw.append(sb);
        bw.flush();
    }

    public static void spread (int turn) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        Queue<Coordinate> target = queues[turn];
        boolean flag = false;
        for (int i=0; i<moves[turn]; ++i) {
            int size = target.size();
            if (size == 0) {
                flag = true;
                ++count;
                break;
            }
            for (int j=0; j<size; ++j) {
                Coordinate cur = target.poll();
                for (int dir=0; dir<4; ++dir) {
                    int nr = cur.r + dr[dir];
                    int nc = cur.c + dc[dir];

                    if (nr < 0 || R<=nr || nc<0 || C<=nc) continue;
                    if (board[nr][nc] == 0) {
                        board[nr][nc] = turn;
                        ++answer[turn];
                        target.add(new Coordinate(nr, nc));
                    }
                }
            }
        }
        if (!flag && target.size() == 0) ++count;
    }
     */
}

/*
class Coordinate {
    int r;
    int c;

    Coordinate (int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */

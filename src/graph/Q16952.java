package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q16952 {
    /*
    public static int N;
    public static int[][] board;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        board = new int[N][N];
        int startR = 0; int startC = 0;
        for (int r=0; r<N; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<N; ++c) {
                board[r][c] = Integer.parseInt(st.nextToken());
                if (board[r][c] == 1) {
                    startR = r; startC = c;
                }
            }
        }
        solve(startR, startC);
    }

    public static void solve(int r, int c) {
        int[] knightR = {-1, -2, -2, -1, +1, +2, +2, +1};
        int[] knightC = {-2, -1, +1, +2, -2, -1, +1, +2};
        int[] bishopR = {-1, -1, +1, +1};
        int[] bishopC = {-1, +1, -1, +1};
        int[] rookR = {-1, 0, 0, +1};
        int[] rookC = {0, -1, +1, 0};
        int max = (int) Math.pow(N, 2);
        PriorityQueue<Square> queue = new PriorityQueue<>();
        boolean[][][][] visited = new boolean[3][max+1][N][N];
        for (int piece=0; piece<3; ++piece) {
            visited[piece][2][r][c] = true;
            queue.add(new Square(r, c, 2, piece, 0, 0));
        }

        while (!queue.isEmpty()) {
            Square s = queue.poll();
            if (s.goal == board[s.r][s.c]) {
                if (s.goal == max) {
                    System.out.println(s.time+" "+s.changes);
                    return;
                } else {
                    queue.add(new Square(s.r, s.c, s.goal+1, s.piece, s.time, s.changes));
                    continue;
                }
            } else {
                for (int piece=0; piece<3; ++piece) {
                    if (piece != s.piece) {
                        if (visited[piece][s.goal][s.r][s.c]) continue;
                        visited[piece][s.goal][s.r][s.c] = true;
                        queue.add(new Square(s.r, s.c, s.goal, piece, s.time+1, s.changes+1));
                    }
                }
                if (s.piece == 0) {
                    for (int dir=0; dir<8; ++dir) {
                        int nr = s.r + knightR[dir];
                        int nc = s.c + knightC[dir];
                        if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
                        if (visited[s.piece][s.goal][nr][nc]) continue;
                        visited[s.piece][s.goal][nr][nc] = true;
                        queue.add(new Square(nr, nc, s.goal, s.piece, s.time+1, s.changes));
                    }
                } else if (s.piece == 1) {
                    for (int dir=0; dir<4; ++dir) {
                        int nr = s.r; int nc = s.c;
                        while (true) {
                            nr += bishopR[dir]; nc += bishopC[dir];
                            if (nr<0 || N<=nr || nc<0 || N<=nc) break;
                            if (visited[s.piece][s.goal][nr][nc]) continue;
                            visited[s.piece][s.goal][nr][nc] = true;
                            queue.add(new Square(nr, nc, s.goal, s.piece, s.time+1, s.changes));
                        }
                    }
                } else {
                    for (int dir=0; dir<4; ++dir) {
                        int nr = s.r; int nc = s.c;
                        while (true) {
                            nr += rookR[dir]; nc += rookC[dir];
                            if (nr<0 || N<=nr || nc<0 || N<=nc) break;
                            if (visited[s.piece][s.goal][nr][nc]) continue;
                            visited[s.piece][s.goal][nr][nc] = true;
                            queue.add(new Square(nr, nc, s.goal, s.piece, s.time+1, s.changes));
                        }
                    }
                }
            }
        }
    }
     */
}

/*
class Square implements Comparable<Square>{
    int r, c, goal, piece, time, changes;

    Square (int r, int c, int goal, int piece, int time, int changes) {
        this.r = r;
        this.c = c;
        this.goal = goal;
        this.piece = piece;
        this.time = time;
        this.changes = changes;
    }

    @Override
    public int compareTo (Square s) {
        if (this.time > s.time) {
            return 1;
        } else if (this.time == s.time) {
            if (this.changes > s.changes) {
                return 1;
            } else if (this.changes == s.changes) {
                return 0;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
}
 */
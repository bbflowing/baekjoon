package graph;

import java.io.BufferedReader;
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
        N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        StringTokenizer st;
        int startR = 0;
        int startC = 0;
        for (int r = 0; r < N; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < N; ++c) {
                board[r][c] = Integer.parseInt(st.nextToken());
                if (board[r][c] == 1) {
                    startR = r;
                    startC = c;
                }
            }
        }
        bfs(startR, startC);
    }

    public static void bfs(int r, int c) {
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        int max = (int) Math.pow(N, 2);
        boolean[][][][] visited = new boolean[3][N][N][max + 1];

        int[] knightR = {-1, -2, -2, -1, +1, +2, +2, +1};
        int[] knightC = {-2, -1, +1, +2, -2, -1, +1, +2};
        int[] bishopR = {-1, -1, +1, +1};
        int[] bishopC = {-1, +1, -1, +1};
        int[] rookR = {-1, 0, 0, +1};
        int[] rookC = {0, -1, +1, 0};

        for (int type = 0; type < 3; ++type) {
            queue.add(new Coordinate(type, r, c, 0, 2, 0));
            visited[type][r][c][2] = true;
        }

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (cur.target == board[cur.r][cur.c]) {
                if (cur.target == max) {
                    System.out.println(cur.times + " " + cur.changes);
                    return;
                } else {
                    queue.add(new Coordinate(cur.type, cur.r, cur.c, cur.changes, cur.target + 1, cur.times));
                    visited[cur.type][cur.r][cur.c][cur.target + 1] = true;
                    continue;
                }
            } else {
                for (int type = 0; type < 3; ++type) {
                    if (cur.type != type) {
                        if (!visited[type][cur.r][cur.c][cur.target]) {
                            visited[type][cur.r][cur.c][cur.target] = true;
                            queue.add(new Coordinate(type, cur.r, cur.c, cur.changes + 1, cur.target, cur.times + 1));
                        }
                    }
                }
            }

            if (cur.type == 0) {
                for (int dir = 0; dir < 8; ++dir) {
                    int nr = cur.r + knightR[dir];
                    int nc = cur.c + knightC[dir];
                    if (!check(nr, nc)) continue;
                    if (visited[0][nr][nc][cur.target]) continue;
                    visited[0][nr][nc][cur.target] = true;
                    queue.add(new Coordinate(0, nr, nc, cur.changes, cur.target, cur.times + 1));
                }
            } else if (cur.type == 1) {
                for (int dir = 0; dir < 4; ++dir) {
                    int nr = cur.r;
                    int nc = cur.c;
                    while (true) {
                        nr += bishopR[dir];
                        nc += bishopC[dir];
                        if (!check(nr, nc)) break;
                        if (visited[1][nr][nc][cur.target]) continue;
                        visited[1][nr][nc][cur.target] = true;
                        queue.add(new Coordinate(1, nr, nc, cur.changes, cur.target, cur.times + 1));
                    }
                }
            } else {
                for (int dir = 0; dir < 4; ++dir) {
                    int nr = cur.r;
                    int nc = cur.c;
                    while (true) {
                        nr += rookR[dir];
                        nc += rookC[dir];
                        if (!check(nr, nc)) break;
                        if (visited[2][nr][nc][cur.target]) continue;
                        visited[2][nr][nc][cur.target] = true;
                        queue.add(new Coordinate(2, nr, nc, cur.changes, cur.target, cur.times + 1));
                    }
                }
            }
        }
    }

    public static boolean check(int r, int c) {
        if (r < 0 || N <= r || c < 0 || N <= c) return false;
        return true;
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate> {
    int type;
    int r;
    int c;
    int changes;
    int target;
    int times;

    Coordinate(int type, int r, int c, int changes, int target, int times) {
        this.type = type;
        this.target = target;
        this.r = r;
        this.c = c;
        this.changes = changes;
        this.times = times;
    }

    @Override
    public int compareTo(Coordinate c) {
        if (this.times > c.times) {
            return 1;
        } else if (this.times == c.times) {
            if (this.changes > c.changes) {
                return 1;
            } else if (this.changes == c.changes) {
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
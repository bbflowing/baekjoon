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
    public static int board[][];
    public static int N;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        StringTokenizer st;
        int startX = 0;
        int startY = 0;
        for (int i = 0; i < N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; ++j) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 1) {
                    startX = i;
                    startY = j;
                }
            }
        }
        bfs(startX, startY);
    }

    public static void bfs(int startX, int startY) {
        int max = (int) Math.pow(N, 2);
        //System.out.println(max);
        boolean visited[][][][] = new boolean[3][N][N][max + 1];
        int dp[][][][] = new int[3][N][N][max + 1];
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        for (int piece = 0; piece < 3; ++piece) {
            dp[piece][startX][startY][2] = 0;
            visited[piece][startX][startY][2] = true;
            queue.add(new Coordinate(piece, startX, startY, 2, 0, 0));
        }
        int knightX[] = {-1, -2, -2, -1, +1, +2, +2, +1};
        int knightY[] = {-2, -1, +1, +2, -2, -1, +1, +2};
        int bishopX[] = {-1, -1, +1, +1};
        int bishopY[] = {-1, +1, -1, +1};
        int rookX[] = {-1, 0, 0, +1};
        int rookY[] = {0, -1, +1, 0};

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.target == board[c.x][c.y]) {
                if (c.target == max) {
                    System.out.println(c.distance + " " + c.changes);
                    return;
                } else {
                    visited[c.piece][c.x][c.y][c.target + 1] = true;
                    queue.add(new Coordinate(c.piece, c.x, c.y, c.target + 1, c.distance, c.changes));
                    continue;
                }
            }
            for (int piece = 0; piece < 3; ++piece) {
                if (c.piece != piece) {
                    if (!visited[piece][c.x][c.y][c.target]) {
                        visited[piece][c.x][c.y][c.target] = true;
                        queue.add(new Coordinate(piece, c.x, c.y, c.target, c.distance + 1, c.changes + 1));
                    }
                }
            }

            if (c.piece == 0) {
                int nx = c.x;
                int ny = c.y;
                for (int dir = 0; dir < 8; ++dir) {
                    nx = c.x + knightX[dir];
                    ny = c.y + knightY[dir];
                    if (nx < 0 || N <= nx || ny < 0 || N <= ny) {
                        continue;
                    }
                    if (visited[0][nx][ny][c.target]) {
                        continue;
                    }
                    visited[0][nx][ny][c.target] = true;
                    queue.add(new Coordinate(0, nx, ny, c.target, c.distance + 1, c.changes));
                }
            } else if (c.piece == 1) {
                for (int dir = 0; dir < 4; ++dir) {
                    int nx = c.x;
                    int ny = c.y;
                    while (true) {
                        nx += bishopX[dir];
                        ny += bishopY[dir];

                        if (nx < 0 || N <= nx || ny < 0 || N <= ny) {
                            break;
                        }
                        if (visited[1][nx][ny][c.target]) {
                            continue;
                        }
                        visited[1][nx][ny][c.target] = true;
                        queue.add(new Coordinate(1, nx, ny, c.target, c.distance + 1, c.changes));
                    }
                }
            } else {
                for (int dir = 0; dir < 4; ++dir) {
                    int nx = c.x;
                    int ny = c.y;
                    while (true) {
                        nx += rookX[dir];
                        ny += rookY[dir];

                        if (nx < 0 || N <= nx || ny < 0 || N <= ny) {
                            break;
                        }
                        if (visited[2][nx][ny][c.target]) {
                            continue;
                        }
                        visited[2][nx][ny][c.target] = true;
                        queue.add(new Coordinate(2, nx, ny, c.target, c.distance + 1, c.changes));
                    }
                }
            }
        }
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate> {
    int piece;
    int x;
    int y;
    int target;
    int distance;
    int changes;

    Coordinate(int piece, int x, int y, int target, int distance, int changes) {
        this.piece = piece;
        this.x = x;
        this.y = y;
        this.target = target;
        this.distance = distance;
        this.changes = changes;
    }

    @Override
    public int compareTo(Coordinate c) {
        if (this.distance > c.distance) {
            return 1;
        } else if (this.distance == c.distance) {
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

package graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q2423 {
    /*
    public static int R, C;
    public static int[][] map;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new int[R][C];
        String line = "";
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                char target = line.charAt(c);
                if (target == '/') map[r][c] = 1;
            }
        }
        bfs();
    }

    public static void bfs() {
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        int[] zeroR = {-1, 1, 0, 0, -1, 1};
        int[] zeroC = {0, 0, -1, 1, -1, 1};
        int[] oneR = {-1, 1, 0, 0, -1, 1};
        int[] oneC = {0, 0, -1, 1, 1, -1};
        int[][][] visited = new int[2][R][C];
        for (int i=0; i<2; ++i) {
            for (int j=0; j<R; ++j) Arrays.fill(visited[i][j], -1);
        }
        if (map[0][0] == 1) {
            visited[0][0][0] = 1;
            queue.add(new Coordinate(0, 0, 0, 1));
        } else {
            visited[0][0][0] = 0;
            queue.add(new Coordinate(0, 0, 0, 0));
        }

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (cur.r == R && cur.c == C) {
                System.out.println(cur.changes);
                return;
            }
            if (cur.type == 0) { // \
                for (int dir=0; dir<6; ++dir) {
                    int nr = cur.r + zeroR[dir];
                    int nc = cur.c + zeroC[dir];
                    if (nr == R && nc == C) {
                        queue.add(new Coordinate(0, nr, nc, cur.changes));
                        continue;
                    }
                    if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                    if (dir<4) {
                        if (map[nr][nc] == 1) {
                            if (visited[1][nr][nc] == -1 || cur.changes < visited[1][nr][nc]) {
                                visited[1][nr][nc] = cur.changes;
                                queue.add(new Coordinate(1, nr, nc, cur.changes));
                            }
                        } else {
                            if (visited[0][nr][nc] == -1 || cur.changes+1 < visited[0][nr][nc]) {
                                visited[0][nr][nc] = cur.changes+1;
                                queue.add(new Coordinate(1, nr, nc, cur.changes+1));
                            }
                        }
                    } else {
                        if (map[nr][nc] == 0) {
                            if (visited[0][nr][nc] == -1 || cur.changes < visited[0][nr][nc]) {
                                visited[0][nr][nc] = cur.changes;
                                queue.add(new Coordinate(0, nr, nc, cur.changes));
                            }
                        } else {
                            if (visited[1][nr][nc] == -1 || cur.changes+1 < visited[1][nr][nc]) {
                                visited[1][nr][nc] = cur.changes+1;
                                queue.add(new Coordinate(0, nr, nc, cur.changes+1));
                            }
                        }
                    }
                }
            } else { // /
                for (int dir=0; dir<6; ++dir) {
                    int nr = cur.r + oneR[dir];
                    int nc = cur.c + oneC[dir];

                    if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                    if (dir<4) {
                        if (map[nr][nc] == 0) {
                            if (visited[0][nr][nc] == -1 || cur.changes < visited[0][nr][nc]) {
                                visited[0][nr][nc] = cur.changes;
                                queue.add(new Coordinate(0, nr, nc, cur.changes));
                            }
                        } else {
                            if (visited[1][nr][nc] == -1 || cur.changes+1 < visited[1][nr][nc]) {
                                visited[1][nr][nc] = cur.changes+1;
                                queue.add(new Coordinate(0, nr, nc, cur.changes+1));
                            }
                        }
                    } else {
                        if (map[nr][nc] == 1) {
                            if (visited[1][nr][nc] == -1 || cur.changes < visited[1][nr][nc]) {
                                visited[1][nr][nc] = cur.changes;
                                queue.add(new Coordinate(1, nr, nc, cur.changes));
                            }
                        } else {
                            if (visited[0][nr][nc] == -1 || cur.changes+1 < visited[0][nr][nc]) {
                                visited[0][nr][nc] = cur.changes;
                                queue.add(new Coordinate(1, nr, nc, cur.changes+1));
                            }
                        }
                    }
                }
            }
        }
        System.out.println("NO SOLUTION");
    }
     */
}

/*
class Coordinate implements Comparable<Coordinate> {
    int type;
    int r;
    int c;
    int changes;

    Coordinate (int type, int r, int c, int changes) {
        this.type = type;
        this.r = r;
        this.c = c;
        this.changes = changes;
    }

    @Override
    public int compareTo (Coordinate c) {
        return this.changes - c.changes;
    }
}
 */
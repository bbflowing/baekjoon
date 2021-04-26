package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q2423 {
    /*
    public static int R, C;
    public static int[][] circuit;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        circuit = new int[R][C];
        String line;
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                if (line.charAt(c) == '\\') {
                    circuit[r][c] = 1;
                }
            }
        }
        bfs();
    }

    public static void bfs () {
        int[][][] visited = new int[2][R][C];
        int[] zeroR = {-1, +1, 0, 0, -1, +1};
        int[] zeroC = {0, 0, -1, +1, +1, -1};
        int[] oneR = {-1, +1, 0, 0, -1, +1};
        int[] oneC = {0, 0, -1, +1, -1, +1};

        for (int i=0; i<2; ++i) {
            for (int j=0; j<R; ++j) {
                Arrays.fill(visited[i][j], Integer.MAX_VALUE);
            }
        }
        PriorityQueue<Coordinate> queue = new PriorityQueue<>();
        if (circuit[0][0] == 1) { // no changes
            queue.add(new Coordinate(0, 0, 1, 0));
            visited[0][0][0] = 0;
        } else {
            queue.add(new Coordinate(0,0, 1, 1));
            visited[1][0][0] = 1;
        }

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.r == R && c.c == C) {
                System.out.println(c.changes);
                return;
            }
            if (c.type == 0) { // /
                for (int dir=0; dir<6; ++dir) {
                    int nr = c.r + zeroR[dir];
                    int nc = c.c + zeroC[dir];
                    if (nr<0 || R<=nr || nc<0 || C<=nc) continue;

                    if (dir < 4) { // must be 1
                        if (circuit[nr][nc] == 1) { // no need to change
                            if (visited[0][nr][nc] > c.changes) {
                                visited[0][nr][nc] = c.changes;
                                queue.add(new Coordinate(nr, nc, 1, c.changes));
                            }
                        } else { // must change
                            if (visited[1][nr][nc] > c.changes+1) {
                                visited[1][nr][nc] = c.changes+1;
                                queue.add(new Coordinate(nr, nc, 1, c.changes+1));
                            }
                        }
                    } else { // must be 0
                        if (circuit[nr][nc] == 0) { // no need to change
                            if (visited[0][nr][nc] > c.changes) {
                                visited[0][nr][nc] = c.changes;
                                queue.add(new Coordinate(nr, nc, 0, c.changes));
                            }
                        } else { // must change
                            if (visited[1][nr][nc] > c.changes+1) {
                                visited[1][nr][nc] = c.changes+1;
                                queue.add(new Coordinate(nr, nc, 0, c.changes+1));
                            }
                        }
                    }
                }
            } else if (c.type == 1) { // \
                for (int dir=0; dir<6; ++dir) {
                    int nr = c.r + oneR[dir];
                    int nc = c.c + oneC[dir];

                    if (nr == R && nc == C) {
                        queue.add(new Coordinate(nr, nc, 1, c.changes));
                        continue;
                    }
                    if (nr<0 || R<=nr || nc<0 || C<=nc) continue;

                    if (dir < 4) { // must be 0
                        if (circuit[nr][nc] == 0) { // no need to change
                            if (visited[0][nr][nc] > c.changes) {
                                visited[0][nr][nc] = c.changes;
                                queue.add(new Coordinate(nr, nc, 0, c.changes));
                            }
                        } else { // must change
                            if (visited[1][nr][nc] > c.changes+1) {
                                visited[1][nr][nc] = c.changes+1;
                                queue.add(new Coordinate(nr, nc, 0, c.changes+1));
                            }
                        }
                    } else { // must be 1
                        if (circuit[nr][nc] == 1) { // no need to change
                            if (visited[0][nr][nc] > c.changes) {
                                visited[0][nr][nc] = c.changes;
                                queue.add(new Coordinate(nr, nc, 1, c.changes));
                            }
                        } else { // must change
                            if (visited[1][nr][nc] > c.changes+1) {
                                visited[1][nr][nc] = c.changes+1;
                                queue.add(new Coordinate(nr, nc, 1, c.changes+1));
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
class Coordinate implements Comparable<Coordinate>{
    int r;
    int c;
    int type;
    int changes;

    Coordinate (int r, int c, int type, int changes) {
        this.r = r;
        this.c = c;
        this.type = type;
        this.changes = changes;
    }

    @Override
    public int compareTo (Coordinate c) {
        return this.changes - c.changes;
    }
}
 */
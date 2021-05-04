package graph;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q9376 {
    /*
    public static int R, C;
    public static char[][] plan;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int t = 0; t < T; ++t) {
            st = new StringTokenizer(br.readLine());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            plan = new char[R + 2][C + 2];
            String line = "";
            boolean flag = false;
            Coordinate first = null;
            Coordinate second = null;
            for (int r = 0; r < R + 2; ++r) {
                if (r == 0 || r == R + 1) {
                    Arrays.fill(plan[r], '.');
                    continue;
                } else {
                    line = br.readLine();
                    for (int c = 0; c < C + 2; ++c) {
                        if (c == 0 || c == C + 1) {
                            plan[r][c] = '.';
                        } else {
                            plan[r][c] = line.charAt(c - 1);
                            if (plan[r][c] == '$') {
                                if (!flag) {
                                    first = new Coordinate(r, c, 0);
                                    flag = true;
                                } else {
                                    second = new Coordinate(r, c, 0);
                                }
                            }
                        }
                    }
                }
            }
            Coordinate outside = new Coordinate(0, 0, 0);
            int[][] distance1 = bfs(first);
            int[][] distance2 = bfs(second);
            int[][] distance3 = bfs(outside);


            int answer = Integer.MAX_VALUE;
            for (int r = 0; r < R+2; ++r) {
                for (int c = 0; c < C+2; ++c) {
                    if (distance1[r][c] == -1) {
                        continue;
                    } else if (plan[r][c] == '#') {
                        answer = Math.min(answer, distance1[r][c]+distance2[r][c]+distance3[r][c]-2);
                    } else {
                        answer = Math.min(answer, distance1[r][c]+distance2[r][c]+distance3[r][c]);
                    }

                }
            }
            bw.append(String.valueOf(answer));
            bw.newLine();
        }
        bw.flush();
    }


    public static int[][] bfs(Coordinate start) {
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(start);
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int[][] visited = new int[R + 2][C + 2];
        for (int i = 0; i < R + 2; ++i) {
            Arrays.fill(visited[i], -1);
        }
        visited[start.r][start.c] = 0;
        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            for (int dir = 0; dir < 4; ++dir) {
                int nr = c.r + dr[dir];
                int nc = c.c + dc[dir];

                if (nr < 0 || R+2 <= nr || nc < 0 || C+2 <= nc) continue;
                if (plan[nr][nc] == '*') {
                    continue;
                } else if (plan[nr][nc] == '.' || plan[nr][nc] == '$') {
                    if (visited[nr][nc] == -1 || visited[nr][nc] > c.count) {
                        visited[nr][nc] = c.count;
                        queue.add(new Coordinate(nr, nc, c.count));
                    }
                } else if (plan[nr][nc] == '#') {
                    if (visited[nr][nc] == -1 || visited[nr][nc] > c.count + 1) {
                        visited[nr][nc] = c.count + 1;
                        queue.add(new Coordinate(nr, nc, c.count+1));
                    }
                }
            }
        }
        return visited;
    }
     */
}

/*
class Coordinate {
    int r;
    int c;
    int count;

    Coordinate(int r, int c, int count) {
        this.r = r;
        this.c = c;
        this.count = count;
    }
}
 */

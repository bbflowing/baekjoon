package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q17142 {
    /*
    public static int N, M, blanks, answer;
    public static int[][] laboratory;
    public static ArrayList<Coordinate> virus;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        laboratory = new int[N][N];
        virus = new ArrayList<>();
        blanks = 0;
        for (int r=0; r<N; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<N; ++c) {
                laboratory[r][c] = Integer.parseInt(st.nextToken());
                if (laboratory[r][c] == 2) {
                    virus.add(new Coordinate(r, c));
                } else if (laboratory[r][c] == 0) ++blanks;
            }
        }
        if (blanks == 0) {
            System.out.println(0);
        } else {
            int[] result = new int[M];
            answer = Integer.MAX_VALUE;
            combination(virus.size(), 0, 0, result);
            if (answer == Integer.MAX_VALUE) System.out.println(-1);
            else System.out.println(answer);
        }

    }

    public static void combination(int N, int index, int start, int[] result) {
        if (index == M) {
            bfs(result);
            return;
        }

        if (start == N) return;

        result[index] = start;
        combination(N, index+1, start+1, result);
        combination(N, index, start+1, result);
    }

    public static void bfs(int[] result) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        boolean[][] visited = new boolean[N][N];
        Queue<Coordinate> queue = new ArrayDeque<>();
        for (int i=0; i<result.length; ++i) {
            Coordinate c = virus.get(result[i]);
            visited[c.r][c.c] = true;
            queue.add(c);
        }
        int time = 0;
        int temp = blanks;
        while (!queue.isEmpty()) {
            int size = queue.size();
            ++time;
            for (int i=0; i<size; ++i) {
                Coordinate cur = queue.poll();
                for (int dir=0; dir<4; ++dir) {
                    int nr = cur.r + dr[dir];
                    int nc = cur.c + dc[dir];

                    if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
                    if (visited[nr][nc]) continue;
                    if (laboratory[nr][nc] == 1) continue;
                    visited[nr][nc] = true;
                    queue.add(new Coordinate(nr, nc));
                    if (laboratory[nr][nc] == 0) --temp;
                    if (temp == 0) {
                        answer = Math.min(time, answer);
                        return;
                    }
                }
            }
        }
    }
     */
}

/*
class Coordinate {
    int r, c;

    Coordinate (int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */
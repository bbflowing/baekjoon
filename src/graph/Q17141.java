package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Q17141 {
    /*
    public static int N, count, answer;
    public static int[][] laboratory;
    public static ArrayList<Coordinate> virus;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        laboratory = new int[N][N];
        virus = new ArrayList<>();
        count = 0;
        for (int r = 0; r < N; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < N; ++c) {
                laboratory[r][c] = Integer.parseInt(st.nextToken());
                if (laboratory[r][c] == 2) {
                    virus.add(new Coordinate(r, c));
                    laboratory[r][c] = 0;
                    ++count;
                } else if (laboratory[r][c] == 0) {
                    ++count;
                }
            }
        }
        count -= M;
        if (count == 0) {
            System.out.println(0);
        } else {
            answer = Integer.MAX_VALUE;
            int[] result = new int[M];
            combination(virus.size(), M, 0, 0, result);
            if (answer == Integer.MAX_VALUE) answer = -1;
            System.out.println(answer);
        }
    }

    public static void bfs(int[] result) {
        Queue<Coordinate> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[N][N];
        for (int i=0; i<result.length; ++i) {
            Coordinate target = virus.get(result[i]);
            queue.add(target);
            visited[target.r][target.c] = true;
        }
        int temp = count;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int time = 0;
        while (!queue.isEmpty()) {
            ++time;
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                Coordinate cur = queue.poll();
                for (int dir=0; dir<4; ++dir) {
                    int nr = cur.r + dr[dir];
                    int nc = cur.c + dc[dir];

                    if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
                    if (visited[nr][nc]) continue;
                    if (laboratory[nr][nc] != 0) continue;
                    visited[nr][nc] = true;
                    queue.add(new Coordinate(nr, nc));
                    --temp;
                }
            }
            if (temp == 0) answer = Math.min(time, answer);
        }
    }

    public static void combination(int N, int R, int index, int start, int[] result) {
        if (index == R) {
            bfs(result);
            return;
        }
        if (start == N) return;
        result[index] = start;
        combination(N, R, index+1, start+1, result);
        combination(N, R, index, start+1, result);
    }
     */
}

/*
class Coordinate {
    int r, c;

    Coordinate(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */
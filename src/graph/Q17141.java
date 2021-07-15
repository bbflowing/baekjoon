package graph;

// 연구소2

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Q17141 {
    /*
    public static int N, M, blanks, answer;
    public static int[][] laboratory;
    public static ArrayList<Blank> virus;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        laboratory = new int[N][N];
        virus = new ArrayList<>();
        blanks = 0;
        int possible = 0;
        for (int r=0; r<N; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<N; ++c) {
                laboratory[r][c] = Integer.parseInt(st.nextToken());
                if (laboratory[r][c] == 2) {
                    virus.add(new Blank(r, c));
                    ++possible;
                } else if (laboratory[r][c] == 0) {
                    ++blanks;
                }
            }
        }
        blanks += (possible - M);
        if (blanks == 0) answer = 0;
        else {
            answer = Integer.MAX_VALUE;
            Blank[] result = new Blank[M];
            combination(result, 0, 0);
            if (answer == Integer.MAX_VALUE) answer = -1;
        }
        System.out.println(answer);
    }

    public static void combination(Blank[] result, int index, int start) {
        if (index == M) {
            int temp = bfs(result);
            if (temp != -1) answer = Math.min(answer, temp);
            return;
        }

        if (start == virus.size()) return;

        result[index] = virus.get(start);
        combination(result, index+1, start+1);
        combination(result, index, start+1);
    }

    public static int bfs(Blank[] result) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        Queue<Blank> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[N][N];
        for (int i=0; i<M; ++i) {
            queue.add(result[i]);
            visited[result[i].r][result[i].c] = true;
        }
        int remaining = blanks;
        int time = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            ++time;

            for (int i=0; i<size; ++i) {
                Blank cur = queue.poll();
                for (int dir=0; dir<4; ++dir) {
                    int nr = cur.r + dr[dir];
                    int nc = cur.c + dc[dir];
                    if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
                    if (visited[nr][nc]) continue;
                    if (laboratory[nr][nc] == 1) continue;
                    else {
                        queue.add(new Blank(nr, nc));
                        visited[nr][nc] = true;
                        --remaining;
                    }
                }
            }
            if (remaining == 0) return time;
        }
        return -1;
    }
     */
}

/*
class Blank {
    int r, c;

    Blank (int r, int c) {
        this.r = r;
        this.c = c;
    }
}

 */
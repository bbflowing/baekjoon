package graph;

// 연구소3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q17142 {
    /*
    public static int N, M, blanks, answer;
    public static int[][] laboratory;
    public static ArrayList<Blank> virus;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException{
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
                if (laboratory[r][c] == 2) virus.add(new Blank(r, c));
                else if (laboratory[r][c] == 0) ++blanks;
            }
        }
        answer = Integer.MAX_VALUE;
        if (blanks == 0) answer = 0;
        else {
            Blank[] result = new Blank[M];
            combination(result, virus.size(), 0, 0);
            if (answer == Integer.MAX_VALUE) answer = -1;
        }
        System.out.println(answer);
    }

    public static void combination(Blank[] result, int N, int start, int index) {
        if (index == M) {
            int temp = bfs(result);
            if (temp != -1) answer = Math.min(answer, temp);
            return;
        }

        if (start == N) return;

        result[index] = virus.get(start);
        combination(result, N, start+1, index+1);
        combination(result, N, start+1, index);
    }

    public static int bfs(Blank[] result) {
        Queue<Blank> queue = new ArrayDeque<>();
        int count = blanks;
        boolean[][] visited = new boolean[N][N];
        for (int i=0; i<M; ++i) {
            Blank next = result[i];
            queue.add(next);
            visited[next.r][next.c] = true;
        }
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
                    if (laboratory[nr][nc] != 1) {
                        queue.add(new Blank(nr, nc));
                        visited[nr][nc] = true;
                        if (laboratory[nr][nc] == 0) {
                            --count;
                            if (count == 0) return time;
                        }
                    } else continue;
                }
            }
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
        this.c =c;
    }
}
 */
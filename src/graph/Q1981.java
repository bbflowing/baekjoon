package graph;

import java.io.*;
import java.util.*;

public class Q1981 {
    /*
    public static int N;
    public static int[][] array;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        array = new int[N][N];
        StringTokenizer st;
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int r=0; r<N; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<N; ++c) {
                array[r][c] = Integer.parseInt(st.nextToken());
                if (!numbers.contains(array[r][c])) {
                    numbers.add(array[r][c]);
                }
            }
        }
        Collections.sort(numbers);
        int answer = solve(numbers);
        StringBuilder sb = new StringBuilder();
        sb.append(answer);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.append(sb);
        bw.flush();
    }

    public static int solve (ArrayList<Integer> numbers) {
        int minIndex = 0;
        int maxIndex = 0;
        int answer = Integer.MAX_VALUE;

        while (minIndex < numbers.size() && maxIndex < numbers.size()) {
            int min = numbers.get(minIndex);
            int max = numbers.get(maxIndex);
            if (array[0][0] < min || max < array[0][0]) {
                ++maxIndex;
                continue;
            }
            if (bfs(min, max)) {
                answer = Math.min(max-min, answer);
                ++minIndex;
            } else ++maxIndex;
        }
        return answer;
    }

    public static boolean bfs (int min, int max) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        boolean[][] visited = new boolean[N][N];
        visited[0][0] = true;
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(0, 0));

        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            if (cur.r == N-1 && cur.c == N-1) return true;
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
                if (visited[nr][nc]) continue;
                if (min <= array[nr][nc] && array[nr][nc] <= max) {
                    visited[nr][nc] = true;
                    queue.add(new Coordinate(nr, nc));
                }
            }
        }
        return false;
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
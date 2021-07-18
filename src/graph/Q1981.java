package graph;

import java.io.*;
import java.util.*;

public class Q1981 {
    /*
    public static int N;
    public static int[][] array;
    public static ArrayList<Integer> numbers;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        array = new int[N][N];
        numbers = new ArrayList<>();
        StringTokenizer st;
        for (int r=0; r<N; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<N; ++c) {
                array[r][c] = Integer.parseInt(st.nextToken());
                if (!numbers.contains(array[r][c])) numbers.add(array[r][c]);
            }
        }
        Collections.sort(numbers);
        solve();
    }

    public static void solve() {
        int minIndex = 0;
        int maxIndex = 0;
        int min = 0;
        int max = 0;
        int answer = Integer.MAX_VALUE;

        while (minIndex < numbers.size() && maxIndex < numbers.size()) {
            min = numbers.get(minIndex);
            max = numbers.get(maxIndex);
            if (max < array[0][0] || array[0][0] < min) {
                ++maxIndex;
                continue;
            }
            boolean result = bfs(min, max);
            if (result) {
                answer = Math.min(answer, max-min);
                ++minIndex;
            } else {
                ++maxIndex;
            }
        }
        System.out.println(answer);
    }

    public static boolean bfs (int min, int max) {
        Queue<Location> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[N][N];
        queue.add(new Location(0, 0));
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            Location cur = queue.poll();
            if (cur.r == N-1 && cur.c == N-1) return true;
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (nr<0 || N<=nr || nc<0 || N<=nc) continue;
                if (visited[nr][nc]) continue;
                if (array[nr][nc] < min || max < array[nr][nc]) continue;
                visited[nr][nc] = true;
                queue.add(new Location(nr, nc));
            }
        }
        return false;
    }
     */
}

/*
class Location {
    int r, c;

    Location(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */

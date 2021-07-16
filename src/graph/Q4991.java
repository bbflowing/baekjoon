package graph;

import java.io.*;
import java.util.*;

public class Q4991 {
    /*
    public static int R, C, answer;
    public static char[][] room;
    public static ArrayList<Location> dust;
    public static int[][] distances;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String line = "";
        while (true) {
            line = br.readLine();
            if (line.equals("0 0")) break;
            st = new StringTokenizer(line);
            C = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            room = new char[R][C];
            dust = new ArrayList<>();
            int count = 0;
            Location S = null;
            for (int r=0; r<R; ++r) {
                line = br.readLine();
                for (int c=0; c<C; ++c) {
                    room[r][c] = line.charAt(c);
                    if (room[r][c] == 'o') S = new Location(r, c);
                    else if (room[r][c] == '*') {
                        dust.add(new Location(r, c));
                        ++count;
                    }
                }
            }
            distances = new int[count+1][count+1];
            dust.add(0, S);
            for (int i=0; i<count; ++i) {
                Location begin = dust.get(i);
                for (int j=i+1; j<count+1; ++j) {
                    Location end = dust.get(j);
                    int result = bfs(begin, end);
                    distances[i][j] = result;
                    distances[j][i] = distances[i][j];
                }
            }
            dust.remove(0);
            int[] result = new int[count];
            boolean[] visited = new boolean[count];
            answer = Integer.MAX_VALUE;
            permutation(result, visited, count, 0);
            if (answer == Integer.MAX_VALUE) answer = -1;
            bw.append(String.valueOf(answer));
            bw.newLine();
        }
        bw.flush();
    }

    public static void permutation(int[] result, boolean[] visited, int N, int index) {
        if (index == N) {
            int[] route = new int[N+1];
            route[0] = 0;
            for (int i=1; i<N+1; ++i) route[i] = result[i-1];
            int temp = 0;
            for (int i=0; i<N; ++i) {
                if (distances[route[i]][route[i+1]] == -1) return;
                temp += distances[route[i]][route[i+1]];
                if (answer < temp) return;
            }
            answer = temp;
            return;
        }

        for (int i=0; i<N; ++i) {
            if (!visited[i]) {
                result[index] = i+1;
                visited[i] = true;
                permutation(result, visited, N, index+1);
                visited[i] = false;
            }
        }
    }

    public static int bfs(Location begin, Location end) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        boolean[][] visited = new boolean[R][C];
        Queue<Location> queue = new ArrayDeque<>();
        visited[begin.r][begin.c] = true;
        queue.add(begin);
        int distance = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            ++distance;
            for (int i=0; i<size; ++i) {
                Location cur = queue.poll();
                for (int dir=0; dir<4; ++dir) {
                    int nr = cur.r + dr[dir];
                    int nc = cur.c + dc[dir];

                    if (nr < 0 || R <= nr || nc < 0 || C <= nc) continue;
                    if (nr == end.r && nc == end.c) return distance;
                    if (visited[nr][nc]) continue;
                    if (room[nr][nc] == 'x') continue;
                    visited[nr][nc] = true;
                    queue.add(new Location(nr, nc));
                }
            }
        }
        return -1;
    }
     */
}

/*
class Location {
    int r, c;

    Location (int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */
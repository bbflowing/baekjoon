package graph;

// 아맞다우산

import java.io.*;
import java.util.*;

public class Q17244 {
    /*
    public static int R, C, answer;
    public static char[][] house;
    public static ArrayList<Location> belongings;
    public static int[][] distances;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        house = new char[R][C];
        belongings = new ArrayList<>();
        String line = "";
        Location S = null; Location E = null;
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                house[r][c] = line.charAt(c);
                if (house[r][c] == 'S') S = new Location(r, c, 0);
                else if (house[r][c] == 'E') E = new Location(r, c, 0);
                else if (house[r][c] == 'X') belongings.add(new Location(r, c, 0));
            }
        }
        belongings.add(E);
        belongings.add(0, S);
        distances = new int[belongings.size()][belongings.size()];
        for (int i=0; i<belongings.size()-1; ++i) {
            Location begin = belongings.get(i);
            for (int j=i+1; j<belongings.size(); ++j) {
                Location end = belongings.get(j);
                distances[i][j] = bfs(begin, end);
                distances[j][i] = distances[i][j];
            }
        }
        belongings.remove(0);
        belongings.remove(belongings.size()-1);
        int[] result = new int[belongings.size()];
        boolean[] visited = new boolean[belongings.size()];
        answer = Integer.MAX_VALUE;
        permutation(result, visited, belongings.size(), 0);
        System.out.println(answer);
    }

    public static void permutation(int[] result, boolean[] visited, int N, int index) {
        if (index == N) {
            int[] route = new int[N+2];
            route[0] = 0;
            for (int i=1; i<N+1; ++i) route[i] = result[i-1];
            route[N+1] = N+1;
            int temp = 0;
            for (int i=0; i<N+1; ++i) {
                if (distances[route[i]][route[i+1]] == -1) return;
                temp += distances[route[i]][route[i+1]];
                if (temp > answer) return;
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
        Queue<Location> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[R][C];
        queue.add(begin);
        visited[begin.r][begin.c] = true;

        while (!queue.isEmpty()) {
            Location cur = queue.poll();
            if (cur.r == end.r && cur.c == end.c) {
                return cur.times;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (visited[nr][nc]) continue;
                if (house[nr][nc] == '#') continue;
                visited[nr][nc] = true;
                queue.add(new Location(nr, nc, cur.times+1));
            }
        }
        return -1;
    }
     */
}

/*
class Location {
    int r, c, times;

    Location(int r, int c, int times) {
        this.r = r;
        this.c = c;
        this.times = times;
    }
}
 */
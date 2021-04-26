package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q17244 {
    /*
    public static int R, C, answer;
    public static char[][] house;
    public static int[][] distances;
    public static Coordinate start, end;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        house = new char[R][C];
        ArrayList<Coordinate> things = new ArrayList<>();
        start = null; end = null;
        String line = "";

        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                house[r][c] = line.charAt(c);
                if (house[r][c] == 'S') {
                    start = new Coordinate(r, c);
                } else if (house[r][c] == 'X') {
                    things.add(new Coordinate(r, c));
                } else if (house[r][c] == 'E') {
                    end = new Coordinate(r, c);
                }
            }
        }
        things.add(0, start);
        things.add(end);
        distances = new int[things.size()][things.size()];
        for (int i=0; i<things.size()-1; ++i) {
            Coordinate begin = things.get(i);
            for (int j=i+1; j<things.size(); ++j) {
                Coordinate dst = things.get(j);
                distances[i][j] = getDistance(begin, dst);
                distances[j][i] = distances[i][j];
            }
        }
        things.remove(0);
        things.remove(things.size()-1);
        int[] result = new int[things.size()];
        boolean[] visited = new boolean[things.size()];
        answer = Integer.MAX_VALUE;
        permutation(things.size(), 0, visited, result);
        System.out.println(answer);
    }

    public static void permutation (int N, int index, boolean[] visited, int[] result) {
        if (index == N) {
            int[] route = new int[N+2];
            route[0] = 0;
            for (int i=1; i<=N; ++i) {
                route[i] = result[i-1];
            }
            route[N+1] = N+1;
            int temp = 0;
            for (int i=0; i<N+1; ++i) {
                int start = route[i];
                int dst = route[i+1];
                if (distances[start][dst] == -1) return;
                temp += distances[start][dst];
                if (temp > answer) return;
            }
            answer = temp;
            return;
        }

        for (int i=0; i<N; ++i) {
            if (!visited[i]) {
                visited[i] = true;
                result[index] = i+1;
                permutation(N, index+1, visited, result);
                visited[i] = false;
            }
        }
    }

    public static int getDistance(Coordinate begin, Coordinate dst) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(begin.r, begin.c, 0));
        boolean[][] visited = new boolean[R][C];
        visited[begin.r][begin.c] = true;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.r == dst.r && c.c == dst.c) {
                return c.distance;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = c.r + dr[dir];
                int nc = c.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (visited[nr][nc]) continue;
                if (house[nr][nc] == '#') continue;

                queue.add(new Coordinate(nr, nc, c.distance+1));
                visited[nr][nc] = true;
            }
        }
        return -1;
    }
     */
}

/*
class Coordinate {
    int r;
    int c;
    int distance;

    Coordinate (int r, int c) {
        this.r = r;
        this.c = c;
    }

    Coordinate (int r, int c, int distance) {
        this.r = r;
        this.c = c;
        this.distance = distance;
    }
}
 */

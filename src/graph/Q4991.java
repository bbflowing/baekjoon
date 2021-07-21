package graph;

import java.io.*;
import java.util.*;

public class Q4991 {
    /*
    public static int C, R, answer;
    public static char[][] room;
    public static int[][] distance;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

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
            Location start = null;
            ArrayList<Location> dust = new ArrayList<>();
            for (int r=0; r<R; ++r) {
                line = br.readLine();
                for (int c=0; c<C; ++c) {
                    room[r][c] = line.charAt(c);
                    if (room[r][c] == 'o') start = new Location(r, c, 0);
                    else if (room[r][c] == '*') dust.add(new Location(r, c, 0));
                }
            }
            dust.add(0, start);
            distance = new int[dust.size()][dust.size()];
            for (int i=0; i<dust.size()-1; ++i) {
                Location begin = dust.get(i);
                for (int j=i+1; j<dust.size(); ++j) {
                    Location end= dust.get(j);
                    distance[i][j] = getDistance(begin, end);
                    distance[j][i] = distance[i][j];
                }
            }
            dust.remove(0);
            answer = Integer.MAX_VALUE;
            int[] result = new int[dust.size()];
            boolean[] visited = new boolean[dust.size()];
            permutation(result, visited, 0, dust.size());
            if (answer == Integer.MAX_VALUE) bw.append(String.valueOf(-1));
            else bw.append(String.valueOf(answer));
            bw.newLine();
        }
        bw.flush();
    }

    public static void permutation(int[] result, boolean[] visited, int index, int N) {
        if (index == N) {
            int[] route = new int[N+1];
            route[0] = 0;
            for (int i=1; i<N+1; ++i) route[i] = result[i-1];
            int temp = 0;
            for (int i=0; i<N; ++i) {
                int next = distance[route[i]][route[i+1]];
                if (next == -1) return;
                temp += next;
                if (answer < temp) return;
            }
            answer = temp;
            return;
        }

        for (int i=0; i<N; ++i) {
            if (!visited[i]) {
                visited[i] = true;
                result[index] = i+1;
                permutation(result, visited, index+1, N);
                visited[i] = false;
            }
        }
    }

    public static int getDistance (Location begin, Location end) {
        Queue<Location> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[R][C];
        queue.add(begin);
        visited[begin.r][begin.c] = true;

        while (!queue.isEmpty()) {
            Location cur = queue.poll();
            if (cur.r == end.r && cur.c == end.c) return cur.distance;
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (room[nr][nc] == 'x') continue;
                if (visited[nr][nc]) continue;
                visited[nr][nc] = true;
                queue.add(new Location(nr, nc, cur.distance+1));
            }
        }
        return -1;
    }
     */
}

/*
class Location {
    int r, c, distance;

    Location (int r, int c, int distance) {
        this.r = r;
        this.c = c;
        this.distance = distance;
    }
}
 */
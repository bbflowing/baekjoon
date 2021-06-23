package graph;

import java.io.*;
import java.util.*;

public class Q17244 {
    /*
    public static int R, C, answer;
    public static char[][] house;
    public static ArrayList<Coordinate> belongings;
    public static int[][] distances;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        house = new char[R][C];
        belongings = new ArrayList<>();
        String line = "";
        Coordinate start = null;
        Coordinate end = null;

        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                house[r][c] = line.charAt(c);
                if (house[r][c] == 'S') start = new Coordinate(r, c, 0);
                else if (house[r][c] == 'E') end = new Coordinate(r, c, 0);
                else if (house[r][c] == 'X') belongings.add(new Coordinate(r, c, 0));
            }
        }
        belongings.add(0, start);
        belongings.add(end);
        distances = new int[belongings.size()][belongings.size()];
        for (int i=0; i<belongings.size()-1; ++i) {
            Coordinate begin = belongings.get(i);
            for (int j=i+1; j<belongings.size(); ++j) {
                Coordinate dst = belongings.get(j);
                int answer = getDistance(begin, dst);
                distances[i][j] = answer;
                distances[j][i] = answer;
            }
        }
        belongings.remove(0);
        belongings.remove(belongings.size()-1);
        int[] result = new int[belongings.size()];
        boolean[] visited = new boolean[belongings.size()];
        answer = Integer.MAX_VALUE;
        permutation(0, result, visited);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.append(String.valueOf(answer));
        bw.flush();
    }

    public static void permutation(int index, int[] result, boolean[] visited) {
        if (index == belongings.size()) {
            int[] route = new int[belongings.size()+2];
            route[0] = 0;
            for (int i=1; i<=belongings.size(); ++i) route[i] = result[i-1];
            route[belongings.size()+1] = belongings.size()+1;
            int temp = 0;
            for (int i=0; i<route.length-1; ++i) {
                if (distances[route[i]][route[i+1]] == -1) return;
                else temp += distances[route[i]][route[i+1]];
                if (answer <= temp) return;
            }
            answer = temp;
            return;
        }

        for (int i=0; i<belongings.size(); ++i) {
            if (!visited[i]) {
                visited[i] = true;
                result[index] = i+1;
                permutation(index+1, result, visited);
                visited[i] = false;
            }
        }
    }

    public static int getDistance(Coordinate begin, Coordinate end) {
        boolean[][] visited = new boolean[R][C];
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(begin);
        visited[begin.r][begin.c] = true;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.r == end.r && c.c == end.c) return c.distance;
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
    int r, c, distance;

    Coordinate (int r, int c, int distance) {
        this.r = r;
        this.c = c;
        this.distance = distance;
    }
}
 */
package graph;

import java.io.*;
import java.util.*;

public class Q4991 {
    /*
    public static int R, C, answer;
    public static char room[][];
    public static int distances[][];

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        while (true) {
            String line = br.readLine();
            if (line.equals("0 0")) {
                break;
            }
            st = new StringTokenizer(line);
            C = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            room = new char[R][C];
            Coordinate start = null;
            ArrayList<Coordinate> dust = new ArrayList<>();
            for (int i = 0; i < R; ++i) {
                line = br.readLine();
                for (int j = 0; j < C; ++j) {
                    room[i][j] = line.charAt(j);
                    if (room[i][j] == 'o') {
                        start = new Coordinate(i, j, 0);
                    } else if (room[i][j] == '*') {
                        dust.add(new Coordinate(i, j, 0));
                    }
                }
            }
            dust.add(0, start);
            int N = dust.size();
            distances = new int[N][N];
            for (int i = 0; i < N - 1; ++i) {
                Coordinate begin = dust.get(i);
                for (int j = i+1; j < N; ++j) {
                    Coordinate dst = dust.get(j);
                    distances[i][j] = getDistance(begin, dst);
                    distances[j][i] = distances[i][j];
                }
            }
            dust.remove(0);
            int result[] = new int[N - 1];
            boolean visited[] = new boolean[N - 1];
            answer = 987_654_321;
            permutation(N - 1, 0, visited, result);
            if (answer == 987_654_321) {
                bw.append(String.valueOf(-1));
            } else {
                bw.append(String.valueOf(answer));
            }
            bw.newLine();
        }
        bw.flush();
    }

    public static void permutation (int N, int index, boolean[] visited, int[] result) {
        if (index == N) {
            int route [] = new int[N+1];
            route[0] = 0;
            for (int i=1; i<N+1; ++i) {
                route[i] = result[i-1];
            }

            int temp = 0;
            for (int i=0; i<N; ++i) {
                int start = route[i];
                int end = route[i+1];
                if (distances[start][end] == -1) {
                    return;
                }
                temp += distances[start][end];
                if (temp > answer) {
                    return;
                }
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

    public static int getDistance (Coordinate begin, Coordinate dst) {
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        boolean visited[][] = new boolean[R][C];
        visited[begin.x][begin.y] = true;
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(begin);

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == dst.x && c.y == dst.y) {
                return c.distance;
            }
            for (int dir=0; dir<4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx<0 || R<=nx || ny<0 || C<=ny) {
                    continue;
                }
                if (room[nx][ny] == 'x') {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                visited[nx][ny] = true;
                queue.add(new Coordinate(nx, ny, c.distance+1));
            }
        }
        return -1;
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int distance;

    Coordinate (int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}
 */
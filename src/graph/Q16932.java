package graph;

import java.io.*;
import java.util.*;

public class Q16932 {
    public static int N, M, size;
    public static int input [][];
    public static int group [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        input = new int [N][M];
        ArrayList<Coordinate> zeros = new ArrayList<>();
        ArrayList<Coordinate> ones = new ArrayList<>();
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
                if (input[i][j] == 0) {
                    zeros.add(new Coordinate(i, j));
                } else {
                    ones.add(new Coordinate(i, j));
                }
            }
        }
        int counter = 0;
        group = new int [N][M];
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i=0; i<ones.size(); ++i) {
            Coordinate c = ones.get(i);
            if (group[c.x][c.y] == 0) {
                ++counter;
                group[c.x][c.y] = counter;
                int area = bfs (c.x, c.y, counter);
                result.put(counter, area);
            }
        }
        int max = -1;
        for (int i=0; i<zeros.size(); ++i) {
            Coordinate c = zeros.get(i);
            int area = 1;
            boolean check [] = new boolean [counter+1];
            for (int j=0; j<4; ++j) {
                int nx = c.x + dx[j];
                int ny = c.y + dy[j];

                if (0 <= nx && nx < N && 0 <= ny && ny < M) {
                    if (group[nx][ny] != 0 && !check[group[nx][ny]]) {
                        check[group[nx][ny]] = true;
                        area += result.get(group[nx][ny]);
                    }
                }
            }
            if (area > max) {
                max = area;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.append(String.valueOf(max));
        bw.flush();
    }

    public static int bfs (int x, int y, int counter) {
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(x, y));
        int size = 0;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            ++size;

            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (0 <= nx && nx < N && 0 <= ny && ny < M) {
                    if (group[nx][ny] == 0 && input[nx][ny] == 1) {
                        group[nx][ny] = counter;
                        queue.add(new Coordinate(nx, ny));
                    }
                }
            }
        }
        return size;
    }

}

class Coordinate {
    int x;
    int y;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

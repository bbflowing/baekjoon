package graph;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q8061 {
    /*
    public static int N, M;
    public static int input[][];
    public static int distances [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        input = new int [N][M];
        distances = new int [N][M];
        Queue<Coordinate> queue = new LinkedList<>();
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                input[i][j] = line.charAt(j) - '0';
                if (input[i][j] == 1) {
                    queue.add(new Coordinate(i, j, 0));
                }
            }
        }
        bfs(queue);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i=0; i<N; ++i) {
            String line = "";
            for (int j=0; j<M; ++j) {
                line += distances[i][j]+" ";
            }
            bw.append(line);
            bw.newLine();
        }
        bw.flush();
    }

    public static void bfs (Queue<Coordinate> queue) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (0 <= nx && nx < N && 0 <= ny && ny < M) {
                    if (input[nx][ny] == 0) {
                        if (distances[nx][ny] == 0) {
                            distances[nx][ny] = c.distance+1;
                            queue.add(new Coordinate(nx, ny, c.distance+1));
                        }
                    }
                }
            }
        }
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

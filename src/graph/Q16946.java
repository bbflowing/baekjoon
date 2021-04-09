package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16946 {
    /*
    public static char input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new char [N][M];

        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                input[i][j] = line.charAt(j);
            }
        }
        int result [][] = new int [N][M];

        for (int i=0; i<N; ++i) {
            for (int j=0; j<M; ++j) {
                if (input[i][j] == '1') {
                    input[i][j] = '0';
                    result[i][j] = bfs(i, j, N, M);
                    input[i][j] = '1';
                } else if (input[i][j] == '0') {
                    result[i][j] = 0;
                }
            }
        }
        for (int i=0; i<N; ++i) {
            String temp = "";
            for (int j=0; j<M; ++j) {
                temp+=result[i][j];
            }
            System.out.println(temp);
        }
    }

    public static int bfs (int x, int y, int N, int M) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        boolean visited [][] = new boolean [N][M];
        queue.add(new Coordinate(x, y));
        visited[x][y] = true;
        int answer = 0;

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            ++answer;

            for (int i=0; i<4; ++i) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx<0 || N<=nx || ny<0 || M<=ny) {
                    continue;
                }
                if (input[nx][ny] != '0') {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }

                visited[nx][ny] = true;
                queue.add(new Coordinate(nx, ny));
            }
        }
        return answer%10;


    }
     */
}

/*
class Coordinate {
    int x;
    int y;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
 */

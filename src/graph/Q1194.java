package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1194 {
    /*
    public static char input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new char [N][M];
        Coordinate start = null;

        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                input[i][j] = line.charAt(j);
                if (input[i][j] == '0') {
                    start = new Coordinate(i, j);
                    input[i][j] = '.';
                }
            }
        }
        bfs(start, N, M);
    }

    public static void bfs (Coordinate start, int N, int M) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        boolean visited [][][] = new boolean [N][M][1<<6];
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(start.x, start.y, 0, 0));
        visited[start.x][start.y][0] = true;
        boolean success = false;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();

            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];
                //System.out.println(c.x+","+c.y+"->"+nx+","+ny+","+Integer.toBinaryString(c.key));

                if (nx<0 || N<=nx || ny<0 || M<=ny) {
                    continue;
                }
                if (visited[nx][ny][c.key]) {
                    continue;
                }
                if ('A' <= input[nx][ny] && input[nx][ny] <= 'F') {
                    int tempKey = c.key & 1<<(input[nx][ny]-'A');
                    if (tempKey > 0) { //key already exists
                        queue.add(new Coordinate(nx, ny, c.key, c.times+1));
                        visited[nx][ny][c.key] = true;
                    }
                }
                if ('a' <= input[nx][ny] && input[nx][ny] <= 'f') {
                    int nkey = c.key | 1<<(input[nx][ny]-'a');
                    visited[nx][ny][c.key] = true;
                    visited[nx][ny][nkey] = true;
                    queue.add(new Coordinate(nx, ny, nkey, c.times+1));
                }
                if (input[nx][ny] == '.') {
                    queue.add(new Coordinate(nx, ny, c.key, c.times+1));
                    visited[nx][ny][c.key] = true;
                }
                if (input[nx][ny] == '1') {
                    System.out.println(c.times+1);
                    success = true;
                    break;
                }
            }
            if (success) {
                break;
            }
        }
        if (!success) {
            System.out.println(-1);
        }
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int key;
    int times;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate (int x, int y, int key, int times) {
        this.x = x;
        this.y = y;
        this.key = key;
        this.times = times;
    }
}
 */


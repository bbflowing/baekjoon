package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1194 {
    public static char input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new char [N][M];
        int startX = 0; int startY = 0;
        int count = 0;
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                input[i][j] = line.charAt(j);
                if (input[i][j] == '0') {
                    startX = i;
                    startY = j;
                } else if ('A'<=input[i][j] && input[i][j] <= 'F') {
                    ++count;
                }
            }
        }
        bfs(startX, startY, N, M, count);
    }

    public static void bfs (int startX, int startY, int N, int M, int count) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(startX, startY, 0, 0));
        boolean visited [][][] = new boolean [N][M][1<<6];
        visited[startX][startY][0] = true;

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            int nkey = current.key;
            int ndistance = current.distance;

            if (input[current.x][current.y] == '1') {
                System.out.println(ndistance);
                return;
            }

            for (int i=0; i<4; ++i) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx<0 || nx>=N || ny<0 || ny>=M) {
                    continue;
                }
                if (input[nx][ny] == '#' || visited[nx][ny][nkey]) {
                    continue;
                }

                if ('a' <= input[nx][ny] && input[nx][ny] <= 'f') {
                    int tempKey = nkey | 1<< (input[nx][ny] - 'a');
                    if (!visited[nx][ny][tempKey]) {
                        visited[nx][ny][tempKey] = true;
                        visited[nx][ny][nkey] = true;
                        queue.add(new Coordinate(nx, ny, tempKey, ndistance+1));
                    }
                }  else if ('A' <= input[nx][ny] && input[nx][ny] <= 'F') {
                    int tempDoor = nkey & 1 << (input[nx][ny]-'a');
                    if (tempDoor > 0) { // key exists
                        visited[nx][ny][nkey] = true;
                        queue.add(new Coordinate(nx, ny, nkey, ndistance+1));
                    }
                } else {
                    visited[nx][ny][nkey] = true;
                    queue.add(new Coordinate(nx, ny, nkey, ndistance+1));
                }
                //System.out.println(nx+", "+ny+","+nkey+","+nbefore+","+ndistance);
            }
        }
        System.out.println(-1);

    }
}
class Coordinate {
    int x;
    int y;
    int key;
    int distance;

    Coordinate (int x, int y, int key, int distance) {
        this.x = x;
        this.y = y;
        this.key = key;
        this.distance = distance;
    }

}


package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16933 {
    /*
    public static int input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        input = new int [N+1][M+1];
        for (int i=1; i<=N; ++i) {
            String line = br.readLine();
            for (int j=1; j<=M; ++j) {
                input[i][j] = line.charAt(j-1) - '0';
            }
        }
        bfs(N, M, K);
    }

    public static void bfs (int N, int M, int K) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        boolean visited [][][][] = new boolean [N+1][M+1][2][K+1];
        queue.add(new Coordinate(1, 1, 0, 0, 1));
        visited[1][1][0][0] = true;
        boolean flag = false;


            day ->
            1. stay if you haven't stayed for the night yet
            2. move if the next destination is 0
            3. move if the next destination is 1 (break the wall)

            night ->
            1. stay if you haven't visited during the day
            2. move if the next destination is 0
            3. stay if the next destination is 1 (can't break the wall)



        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            if (current.x == N && current.y == M) {
                System.out.println(current.distance);
                flag = true;
                break;
            }
            if (current.time == 0 && !visited[current.x][current.y][1][current.broken]) { // day-1
                visited[current.x][current.y][1][current.broken] = true;
                queue.add(new Coordinate(current.x, current.y, 1, current.broken, current.distance+1));
            }
            if (current.time == 1 && !visited[current.x][current.y][0][current.broken]) { // night-1
                visited[current.x][current.y][0][current.broken] = true;
                queue.add(new Coordinate(current.x, current.y, 0, current.broken, current.distance+1));
            }

            for (int i=0; i<4; ++i) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx<1 || N+1<=nx || ny<1 || M+1<=ny) {
                    continue;
                }
                if (current.time == 0) {
                    if (input[nx][ny] == 0 && !visited[nx][ny][1][current.broken]) { //day-2
                        visited[nx][ny][1][current.broken] = true;
                        queue.add(new Coordinate(nx, ny, 1, current.broken, current.distance + 1));
                    } else if (input[nx][ny] == 1 && current.broken+1 <= K && !visited[nx][ny][1][current.broken+1]) {
                        visited[nx][ny][1][current.broken+1] = true;
                        queue.add(new Coordinate(nx, ny, 1, current.broken+1, current.distance+1));
                    }
                } else if (current.time == 1) {
                    if (input[nx][ny] == 0 && !visited[nx][ny][0][current.broken]) {
                        visited[nx][ny][0][current.broken] = true;
                        queue.add(new Coordinate(nx, ny, 0, current.broken, current.distance+1));
                    } else if (input[nx][ny] == 1 && current.broken+1 <= K && !visited[nx][ny][0][current.broken+1]) {
                        //visited[nx][ny][0][current.broken+1] = true;
                        visited[current.x][current.y][1][current.broken] = true;
                        queue.add(new Coordinate(current.x, current.y, 0, current.broken, current.distance+1));
                    }
                }
            }
        }
        if (!flag) {
            System.out.println(-1);
        }
    }
    */
}

/*
class Coordinate {
    int x;
    int y;
    int time;
    int broken;
    int distance;

    Coordinate (int x, int y, int time, int broken, int distance) {
        this.x = x;
        this.y = y;
        this.time = time;
        this.broken = broken;
        this.distance = distance;
    }
}

 */

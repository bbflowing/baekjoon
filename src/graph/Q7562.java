package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7562 {
    public static String answer;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        answer = "";
        for (int i=0; i<T; ++i) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            if (startX == endX && startY == endY) {
                answer += 0+"\n";
            } else {
                bfs(N, startX, startY, endX, endY);
            }
        }
        System.out.println(answer);
    }

    public static void bfs(int N, int startX, int startY, int endX, int endY) {
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(startX, startY, 0));
        int dx [] = {-1, -2, -2, -1, +1, +2, +2, +1};
        int dy [] = {-2, -1, +1, +2, -2, -1, +1, +2};
        boolean visited [][] = new boolean [N][N];
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            Coordinate knight = queue.poll();
            int ndistance = knight.distance;

            for (int i=0; i<8; ++i) {
                int nx = knight.x + dx[i];
                int ny = knight.y + dy[i];

                if (nx == endX && ny == endY) {
                    answer += (ndistance+1)+"\n";
                    return;
                }

                if (nx<0 || N<=nx || ny<0 || N<=ny) {
                    continue;
                }

                if (visited[nx][ny]) {
                    continue;
                }
                queue.add(new Coordinate(nx, ny, ndistance+1));
                visited[nx][ny] = true;
            }
        }
    }
}

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
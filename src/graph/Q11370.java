package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q11370 {
    public static char map [][];
    public static String answer;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        answer = "";
        while (true) {
            String line = br.readLine();
            if (line.equals("0 0")) {
                break;
            }
            StringTokenizer st = new StringTokenizer(line);
            int W = Integer.parseInt(st.nextToken());
            int H = Integer.parseInt(st.nextToken());
            map = new char [H][W];
            Coordinate start = null;
            for (int i=0; i<H; ++i) {
                line = br.readLine();
                for (int j=0; j<W; ++j) {
                    map[i][j] = line.charAt(j);
                    if (map[i][j] == 'S') {
                        start = new Coordinate(i, j);
                    }
                }
            }
            bfs(start, H, W);
        }
        System.out.println(answer);
    }

    public static void bfs (Coordinate start, int H, int W) {
        boolean visited [][] = new boolean [H][W];
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(start.x, start.y));
        visited[start.x][start.y] = true;
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        char temp [][] = new char [H][W];
        for (int i=0; i<H; ++i) {
            temp[i] = map[i].clone();
        }

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            for (int i=0; i<4; ++i) {
                int nx = c.x + dx[i];
                int ny = c.y + dy[i];

                if (nx<0 || H<=nx || ny<0 || W<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (temp[nx][ny] == '.') {
                    continue;
                }
                map[nx][ny] = 'S';
                visited[nx][ny] = true;
                queue.add(new Coordinate(nx, ny));
            }
        }
        for (int i=0; i<H; ++i) {
            for (int j=0; j<W; ++j) {
                answer += map[i][j];
            }
            answer+="\n";
        }
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

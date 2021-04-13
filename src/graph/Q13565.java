package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q13565 {
    /*
    public static int R, C;
    public static char input[][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        input = new char [R][C];
        ArrayList<Coordinate> begins = new ArrayList<>();
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                input[i][j] = line.charAt(j);
                if (i == 0 && input[i][j] == '0') {
                    begins.add(new Coordinate(i, j));
                }
            }
        }
        for (int i=0; i<begins.size(); ++i) {
            Coordinate start = begins.get(i);
            boolean result = bfs(start);
            if (result) {
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }

    public static boolean bfs (Coordinate start) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(start);
        boolean visited [][] = new boolean [R][C];
        visited[start.x][start.y] = true;

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (c.x == R-1) {
                return true;
            }
            for (int dir=0; dir<4; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx<0 || R<=nx || ny<0 || C<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (input[nx][ny] == '1') {
                    continue;
                }
                visited[nx][ny] = true;
                queue.add(new Coordinate(nx, ny));
            }
        }
        return false;
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
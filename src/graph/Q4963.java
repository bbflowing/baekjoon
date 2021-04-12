package graph;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q4963 {
    /*
    public static char map [][];
    public static boolean visited [][];
    public static int C, R;
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
            map = new char [R][C];
            for (int i=0; i<R; ++i) {
                st = new StringTokenizer(br.readLine());
                for (int j=0; j<C; ++j) {
                    map[i][j] = st.nextToken().charAt(0);
                }
            }
            int answer = 0;
            visited = new boolean [R][C];
            for (int i=0; i<R; ++i) {
                for (int j=0; j<C; ++j) {
                    if (!visited[i][j] && map[i][j] == '1') {
                        visited[i][j] = true;
                        ++answer;
                        bfs(i, j);
                    }
                }
            }
            bw.append(String.valueOf(answer));
            bw.newLine();
        }
        bw.flush();
    }

    public static void bfs (int x, int y) {
        int dx [] = {-1, -1, -1, 0, 0, +1, +1, +1};
        int dy [] = {-1, 0, +1, -1, +1, -1, 0, +1};

        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(x, y));

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            for (int dir=0; dir<8; ++dir) {
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (nx<0 || R<=nx || ny<0 || C<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (map[nx][ny] == '0') {
                    continue;
                }
                visited[nx][ny] = true;
                queue.add(new Coordinate(nx, ny));
            }
        }
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

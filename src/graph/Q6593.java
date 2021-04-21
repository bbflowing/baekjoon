package graph;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q6593 {
    /*
    public static int L, R, C;
    public static char building[][][];
    public static BufferedWriter bw;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = br.readLine();
            if (line.equals("0 0 0")) {
                break;
            }
            st = new StringTokenizer(line);
            L = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            building = new char[L][R][C];
            int z = 0; int x = 0; int y = 0;
            for (int i=0; i<L; ++i) {
                for (int j=0; j<=R; ++j) {
                    line = br.readLine();
                    if (j == R) {
                        continue;
                    }
                    for (int k=0; k<C; ++k) {
                        building[i][j][k] = line.charAt(k);
                        if (building[i][j][k] == 'S') {
                            z = i; x = j; y = k;
                        }
                    }
                }
            }
            bfs(z, x, y);
        }
        bw.flush();
    }

    public static void bfs (int z, int x, int y) throws IOException {
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(z, x, y, 0));
        boolean visited[][][] = new boolean[L][R][C];
        visited[z][x][y] = true;
        int dz[] = {0, 0, 0, 0, -1, 1};
        int dx[] = {-1, 1, 0, 0, 0, 0};
        int dy[] = {0, 0, -1, 1, 0, 0};

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (building[c.z][c.x][c.y] == 'E') {
                bw.append("Escaped in "+c.minutes+" minute(s).");
                bw.newLine();
                return;
            }

            for (int dir=0; dir<6; ++dir) {
                int nz = c.z + dz[dir];
                int nx = c.x + dx[dir];
                int ny = c.y + dy[dir];

                if (!check(nz, nx, ny)) {
                    continue;
                }

                if (visited[nz][nx][ny]) {
                    continue;
                }
                if (building[nz][nx][ny] == '#') {
                    continue;
                }
                visited[nz][nx][ny] = true;
                queue.add(new Coordinate(nz, nx, ny, c.minutes+1));
            }
        }
        bw.append("Trapped!");
        bw.newLine();
    }

    public static boolean check (int z, int x, int y) {
        if (z<0 || L<=z || x<0 || R<=x || y<0 || C<=y) {
            return false;
        }
        return true;
    }
     */
}

/*
class Coordinate {
    int z;
    int x;
    int y;
    int minutes;

    Coordinate (int z, int x, int y, int minutes) {
        this.z = z;
        this.x = x;
        this.y = y;
        this.minutes = minutes;
    }
}
 */

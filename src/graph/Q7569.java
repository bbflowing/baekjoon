package graph;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7569 {
    /*
    public static int M, N, H;
    public static int tomatoes [][][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        tomatoes = new int [N][M][H];
        Queue<Coordinate> queue = new LinkedList<>();
        int unripe = 0;
        for (int i=0; i<H; ++i) {
            for (int j=0; j<N; ++j) {
                st = new StringTokenizer(br.readLine());
                for (int k=0; k<M; ++k) {
                    tomatoes[j][k][i] = Integer.parseInt(st.nextToken());
                    if (tomatoes[j][k][i] == 1) {
                        queue.add(new Coordinate(j, k ,i));
                    } else if (tomatoes[j][k][i] == 0) {
                        ++unripe;
                    }
                }
            }
        }
        if (unripe == 0) {
            System.out.println(0);
        } else {
            bfs(queue, unripe);
        }
    }

    public static void bfs (Queue<Coordinate> queue, int unripe) {
        boolean visited [][][] = new boolean [N][M][H];
        int dx [] = {-1, 1, 0, 0, 0, 0};
        int dy [] = {0, 0, -1, 1, 0, 0};
        int dz [] = {0, 0, 0, 0, -1, 1};
        int time = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i=0; i<size; ++i) {
                Coordinate c = queue.poll();
                for (int j=0; j<6; ++j) {
                    int nx = c.x + dx[j];
                    int ny = c.y + dy[j];
                    int nz = c.z + dz[j];

                    if (nx<0 || N<=nx || ny<0 || M<=ny || nz<0 || H<=nz) {
                        continue;
                    }
                    if (visited[nx][ny][nz]) {
                        continue;
                    }
                    if (tomatoes[nx][ny][nz] == 1 || tomatoes[nx][ny][nz] == -1) {
                        continue;
                    }
                    visited[nx][ny][nz] = true;
                    --unripe;
                    queue.add(new Coordinate(nx, ny, nz));
                }
            }
            ++time;
        }
        if (unripe == 0) {
            System.out.println(time-1);
        } else {
            System.out.println(-1);
        }
    }
}

class Coordinate {
    int x;
    int y;
    int z;

    Coordinate (int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
     */
}
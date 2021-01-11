package graph;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q7569 {
    public static int input [][][];
    public static int N;
    public static int M;
    public static int H;
    public static Queue<Coordinate> queue;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        input = new int [N][M][H];
        boolean allRipe = true;
        int empty = 0;
        queue = new LinkedList<>();
        for (int i=0; i<H; ++i) {
            for (int j=0; j<N; ++j) {
                st = new StringTokenizer(br.readLine());
                for (int k=0; k<M; ++k) {
                    input[j][k][i] = Integer.parseInt(st.nextToken());
                    if (input[j][k][i] == 0) {
                        allRipe = false;
                    } else if (input[j][k][i] == 1) {
                        queue.add(new Coordinate(j, k, i));
                    } else {
                        ++empty;
                    }
                }
            }
        }
        if (allRipe) {
            System.out.println(0);
            System.exit(0);
        }
        bfs(empty);
    }

    public static void bfs(int empty) {
        int dx [] = {-1, 1, 0, 0, 0, 0};
        int dy [] = {0, 0, -1, 1, 0, 0};
        int dz [] = {0, 0, 0, 0, -1, 1};
        int time = 0;
        int counter = 0;
        boolean check [][][] = new boolean [N][M][H];

        while (!queue.isEmpty()) {
            int queueSize = queue.size();
            ++time;

            for (int i=0; i<queueSize; ++i) {
                Coordinate current = queue.poll();
                ++counter;
                check[current.x][current.y][current.z] = true;
                for (int j=0; j<6; ++j) {
                    int nextX = current.x + dx[j];
                    int nextY = current.y + dy[j];
                    int nextZ = current.z + dz[j];

                    if (nextX < 0 || N <= nextX || nextY < 0 || M <= nextY || nextZ < 0 || H <= nextZ) {
                        continue;
                    }

                    if (input[nextX][nextY][nextZ] == 0 && !check[nextX][nextY][nextZ]) {
                        queue.add(new Coordinate(nextX, nextY, nextZ));
                        check[nextX][nextY][nextZ] = true;
                        input [nextX][nextY][nextZ] = 1;
                    }
                }
            }
            if (queue.size() == 0) {
                if (counter == N*M*H - empty) {
                    System.out.println(time-1);
                } else {
                    System.out.println(-1);
                }
                break;
            }
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
}

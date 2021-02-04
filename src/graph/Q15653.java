package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q15653 {
    /*
    public static char input [][];
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1}; // 0: north, 1: south, 2: west, 3: east
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new char [N][M];
        int blueX = 0; int blueY = 0;
        int redX = 0; int redY = 0;
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                input[i][j] = line.charAt(j);
                if (input[i][j] == 'B') {
                    blueX = i; blueY = j;
                } else if (input[i][j] == 'R') {
                    redX = i; redY = j;
                }
            }
        }
        bfs(blueX, blueY, redX, redY, N, M);
    }

    public static void bfs (int blueX, int blueY, int redX, int redY, int N, int M) {
        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(blueX, blueY, redX, redY, 0));
        boolean check [][][][] = new boolean [N][M][N][M];
        check[blueX][blueY][redX][redY] = true;

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            for (int direction=0; direction<4; ++direction) {
                int nbx = current.blueX;
                int nby = current.blueY;
                int nrx = current.redX;
                int nry = current.redY;

                Coordinate blue = move(nbx, nby, direction, N, M);
                Coordinate red = move(nrx, nry, direction, N, M);
                nbx = blue.x; nby = blue.y; nrx = red.x; nry = red.y;
                if (input[blue.x][blue.y] == 'O') {
                    continue;
                }
                if (input[red.x][red.y] == 'O') {
                    System.out.println(current.time + 1);
                    System.exit(0);
                }
                if (blue.x == red.x && blue.y == red.y) {
                    if (direction == 0) { //north
                        if (current.blueX < current.redX) {
                            ++nrx;
                        } else {
                            ++nbx;
                        }
                    } else if (direction == 1) { //south
                        if (current.blueX < current.redX) {
                            --nbx;
                        } else {
                            --nrx;
                        }
                    } else if (direction == 2) { //west
                        if (current.blueY < current.redY) {
                            ++nry;
                        } else {
                            ++nby;
                        }
                    } else if (direction == 3) { //east
                        if (current.blueY < current.redY) {
                            --nby;
                        } else {
                            --nry;
                        }
                    }
                }
                if (check[nbx][nby][nrx][nry]) {
                    continue;
                }
                check[nbx][nby][nrx][nry] = true;
                queue.add(new Coordinate(nbx, nby, nrx, nry, current.time + 1));
            }
        }
        System.out.println(-1);
    }
    public static Coordinate move (int x, int y, int direction, int N, int M) {
        int nx = x;
        int ny = y;
        //System.out.println(nx+", "+ny);
        while (true) {
            nx += dx[direction];
            ny += dy[direction];
            if (input[nx][ny] == 'O') {
                break;
            } else if (input[nx][ny] == '#') {
                if (direction == 0) { //north
                    ++nx;
                } else if (direction == 1) { //south
                    --nx;
                } else if (direction == 2) { //west
                    ++ny;
                } else if (direction == 3) { //east
                    --ny;
                }
                break;
            }

        }
        return new Coordinate (nx, ny);
    }
     */
}
/*
class Coordinate {
    int x;
    int y;
    int blueX;
    int blueY;
    int redX;
    int redY;
    int time;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate (int blueX, int blueY, int redX, int redY, int time) {
        this.blueX = blueX;
        this.blueY = blueY;
        this.redX = redX;
        this.redY = redY;
        this.time = time;
    }
}
 */
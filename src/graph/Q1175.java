package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1175 {
    public static char input [][];
    public static int counter;
    public static ArrayList<ArrayList<Coordinate>> combinations;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new char [N][M];
        counter = 0;
        Coordinate start = null; Coordinate first = null; Coordinate second = null;
        int presents = 0;
        boolean flag = false;
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                input[i][j] = line.charAt(j);
                if (input[i][j] == 'S') {
                    start = new Coordinate(i, j);
                    input[i][j] = '.';
                } else if (input[i][j] == 'C') {
                    ++presents;
                    input[i][j] = '.';
                    if (!flag) {
                        first = new Coordinate(i, j);
                        flag = true;
                    } else {
                        second = new Coordinate(i, j);
                    }

                }
            }
        }

        bfs(start, first, second, N, M, presents);
    }

    public static void bfs (Coordinate start, Coordinate first, Coordinate second, int N, int M, int presents) {
        Queue<Coordinate> queue = new LinkedList<>();
        boolean visited [][][][] = new boolean [N][M][4][3];
        queue.add(new Coordinate(start.x, start.y, -1, 0, 0));
        visited[start.x][start.y][0][0] = true;
        visited[start.x][start.y][1][0] = true;
        visited[start.x][start.y][2][0] = true;
        visited[start.x][start.y][3][0] = true;
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            int nfound = current.found;
            if (current.x == first.x && current.y == first.y && current.found != 1) {
                nfound += 1;
            }

            if (current.x == second.x && current.y == second.y && current.found != 2) {
                nfound += 2;
            }

            if (nfound == 3) {
                System.out.println(current.distance);
                System.exit(0);
            }

            for (int i=0; i<4; ++i) {
                if (current.direction != i) {
                    int nx = current.x + dx[i];
                    int ny = current.y + dy[i];

                    if (nx<0 || N<=nx || ny<0 || M<=ny) {
                        continue;
                    }
                    if (visited[nx][ny][i][nfound]) {
                        continue;
                    }
                    if (input[nx][ny] != '.') {
                        continue;
                    }
                    visited[nx][ny][i][nfound] = true;
                    queue.add(new Coordinate(nx, ny, i, current.distance+1, nfound));
                    //System.out.println(nx+","+ny+","+(current.distance+1));
                }
            }
        }
        System.out.println(-1);
    }
}

class Coordinate {
    int x;
    int y;
    int direction;
    int distance;
    int found;

    Coordinate (int x, int y, int direction, int distance, int found) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.distance = distance;
        this.found = found;
    }

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

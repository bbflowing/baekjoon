package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q4179 {
    /*
    public static char map [][];
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        map = new char [R][C];
        Queue<Coordinate> jQ = new LinkedList<>();
        Queue<Coordinate> fQ = new LinkedList<>();
        boolean [][] jV = new boolean [R][C];
        boolean [][] fV = new boolean [R][C];
        for (int i=0; i<R; ++i) {
            String line = br.readLine();
            for (int j=0; j<C; ++j) {
                map[i][j] = line.charAt(j);
                if (map[i][j] == 'J') {
                    jQ.add(new Coordinate(i, j, 0));
                    jV[i][j] = true;
                } else if (map[i][j] == 'F') {
                    fQ.add(new Coordinate(i, j));
                    fV[i][j] = true;
                }
            }
        }
        int answer = bfs(jQ, fQ, jV, fV, R, C);
        if (answer == -1) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(answer);
        }
    }

    public static int bfs (Queue<Coordinate> jQ, Queue<Coordinate> fQ, boolean [][] jV,
                            boolean [][] fV, int R, int C) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        while (true) {
            int fSize = fQ.size();
            for (int i=0; i<fSize; ++i) {
                Coordinate fire = fQ.poll();
                for (int j=0; j<4; ++j) {
                    int nx = fire.x + dx[j];
                    int ny = fire.y + dy[j];

                    if (nx<0 || R<=nx || ny<0 || C<=ny) {
                        continue;
                    }
                    if (fV[nx][ny]) {
                        continue;
                    }
                    if (map[nx][ny] == '#') {
                        continue;
                    }
                    fV[nx][ny] = true;
                    fQ.add(new Coordinate(nx, ny));
                }
            }

            int jSize = jQ.size();
            for (int i=0; i<jSize; ++i) {
                Coordinate j = jQ.poll();
                for (int k=0; k<4; ++k) {
                    int nx = j.x + dx[k];
                    int ny = j.y + dy[k];

                    if (nx<0 || R<=nx || ny<0 || C<=ny) {
                        return j.times+1;
                    }
                    if (fV[nx][ny] || jV[nx][ny]) {
                        continue;
                    }
                    if (map[nx][ny] == '#') {
                        continue;
                    }
                    jV[nx][ny] = true;
                    jQ.add(new Coordinate(nx, ny, j.times+1));
                }
            }

            if (jQ.size() == 0) {
                return -1;
            }
        }
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int times;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate (int x, int y, int times) {
        this.x = x;
        this.y = y;
        this.times = times;
    }
}
 */

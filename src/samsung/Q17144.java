package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q17144 {
    /*
    public static int map [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        map = new int [R][C];
        boolean flag = false;
        Coordinate up = null;
        Coordinate down = null;
        for (int i=0; i<R; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<C; ++j) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == -1) {
                    if (!flag) {
                        up = new Coordinate(i, j);
                        flag = true;
                    } else {
                        down = new Coordinate(i, j);
                    }
                }
            }
        }
        for (int i=0; i<T; ++i) {
            spread(R, C);
            clean(up, down, R, C);
        }
        int answer = 0;
        for (int i=0; i<R; ++i) {
            for (int j=0; j<C; ++j) {
                if (map[i][j] != -1) {
                    answer += map[i][j];
                }
            }
        }
        System.out.println(answer);
    }

    public static void clean (Coordinate up, Coordinate down, int R, int C) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        int temp [][] = new int [R][C];
        for (int i=0; i<R; ++i) {
            temp[i] = map[i].clone();
        }

        int upX = up.x;
        int upY = up.y;

        map[upX][upY+1] = 0;
        for (int i=1; i<C-1; ++i) {
            map[upX][i+1] = temp [upX][i];
        }
        for (int i=upX-1; 0<=i; --i) {
            map[i][C-1] = temp[i+1][C-1];
        }

        for (int i=C-1; 1<=i; --i) {
            map[0][i-1] = temp[0][i];
        }

        for (int i=1; i<up.x; ++i) {
            map[i][0] = temp[i-1][0];
        }


        int downX = down.x;
        int downY = down.y;

        map[downX][downY+1] = 0;
        for (int i=1; i<C-1; ++i) {
            map[downX][i+1] = temp[downX][i];
        }

        for (int i=downX+1; i<=R-1; ++i) {
            map[i][C-1] = temp[i-1][C-1];
        }

        for (int i=C-1; 1<=i; --i) {
            map[R-1][i-1] = temp[R-1][i];
        }

        for (int i=R-2; downX+1<=i; --i) {
            map[i][0] = temp[i+1][0];
        }

    }

    public static void spread (int R, int C) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        int temp [][] = new int [R][C];
        for (int i=0; i<R; ++i) {
            temp[i] = map[i].clone();
        }

        for (int i=0; i<R; ++i) {
            for (int j=0; j<C; ++j) {
                if (temp[i][j] > 0) {
                    int counter = 0;
                    for (int k=0; k<4; ++k) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        if (nx<0 || R<=nx || ny<0 || C<=ny) {
                            continue;
                        }
                        if (temp[nx][ny] == -1) {
                            continue;
                        }
                        map[nx][ny] += temp[i][j]/5;
                        ++counter;
                    }
                    map[i][j] -= temp[i][j]/5*counter;
                }
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

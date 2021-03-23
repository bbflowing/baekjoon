package backtracking;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q17136 {
    /*
    public static int board [][];
    public static int papers [];
    public static int answer;
    public static BufferedWriter bw;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        board = new int [10][10];
        StringTokenizer st;
        int ones = 0;
        papers = new int [] {0, 5, 5, 5, 5, 5};
        for (int i=0; i<10; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<10; ++j) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 1) {
                    ++ones;
                }
            }
        }
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        answer = Integer.MAX_VALUE;
        solve(0, 0, ones, 0);
        if (answer == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(answer);
        }
    }

    public static void solve (int x, int y, int ones, int count) {
        if (ones == 0) {
            if (answer > count) {
                answer = count;
            }
            return;
        }
        if (y == 10) {
            solve(x+1, 0, ones, count);
            return;
        }
        if (x == 10) {
            return;
        }
        if (board[x][y] == 0) {
            solve(x, y+1, ones, count);
            return;
        }

        int ncount = count;
        int nones = ones;
        for (int size=5; 1<=size; --size) {
            if (papers[size] == 0) {
                continue;
            }
            if (10 < x+size || 10 < y+size) {
                continue;
            }
            ArrayList<Coordinate> list = new ArrayList<>();
            boolean zeroFound = false;
            for (int i=x; i<x+size; ++i) {
                for (int j=y; j<y+size; ++j) {
                    if (board[i][j] == 0) {
                        zeroFound = true;
                        break;
                    }
                    list.add(new Coordinate(i, j));
                }
                if (zeroFound) {
                    break;
                }
            }
            if (zeroFound) {
                continue;
            }

            --papers[size];
            for (int i=0; i<list.size(); ++i) {
                Coordinate target = list.get(i);
                board[target.x][target.y] = 0;
                --nones;
            }
            ncount += 1;
            solve(x, y+1, nones, ncount);
            ncount -= 1;
            ++papers[size];
            for (int i=0; i<list.size(); ++i) {
                Coordinate target = list.get(i);
                board[target.x][target.y] = 1;
                ++nones;
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
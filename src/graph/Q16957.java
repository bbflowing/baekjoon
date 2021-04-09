package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q16957 {
    public static int input [][];
    public static int count [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        input = new int [R][C];
        count = new int [R][C];

        for (int i=0; i<R; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<C; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        while (true) {
            check(R, C);
        }
    }

    public static void check (int R, int C) {
        int dx [] = {-1, -1, -1, 0, 0, +1, +1, +1};
        int dy [] = {-1, +0, +1, -1, +1, -1, 0, +1};

        for (int i=0; i<R; ++i) {
            for (int j=0; j<C; ++j) {
                for (int k=0; k<8; ++k) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx<0 || R<=nx || ny<0 || C<=ny) {
                        continue;
                    }

                }


            }
        }
    }
}

package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q18808 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Sticker> stickers = new LinkedList<>();
        int notebook [][] = new int [N+1][M+1];
        for (int i=0; i<K; ++i) {
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int layout [][] = new int [R+1][C+1];
            for (int j=1; j<=R; ++j) {
                st = new StringTokenizer(br.readLine());
                for (int k=1; k<=C; ++k) {
                    layout[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            stickers.add(new Sticker(R, C, layout));
        }


        for (int i=0; i<K; ++i) {
            Sticker target = stickers.poll();
            for (int j=1; j<=Math.ceil(N/target.R); ++j) {
                for (int k=1; k<=Math.ceil(M/target.C); ++k) {
                    if (notebook[j][k] != 1) {
                        int flag = 0;
                        for (int l=0; l< target.R; ++l) {
                            for (int m=0; m< target.C; ++m) {
                                if (target.layout[l+1][m+1]==1 && notebook[j+l][k+m] == 0) {
                                    notebook[j+l][k+m] = 1;
                                } else {
                                    flag = 1;
                                    break;
                                }
                            }
                            if (flag == 1) {
                                break;
                            }
                        }
                    }

                }
            }
        }
    }
    */
}
/*
class Sticker {
    int R;
    int C;
    int [][] layout;

    Sticker (int R, int C, int [][] layout) {
        this.R = R;
        this.C = C;
        this.layout = layout;
    }
}
 */

package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2583 {
    public static int input [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        input = new int [M][N];
        ArrayList<Coordinate> list = new ArrayList<>();
        for (int a []:input) {
            Arrays.fill(a, 1);
        }

        for (int i = 0; i < K; ++i) {
            st = new StringTokenizer(br.readLine());
            list.add (new Coordinate(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
                                        Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        for (int i = 0; i < K; ++i) {
            Coordinate square = list.get(i);
            for (int j = M - 2*square.startY - square.endY; j <= M - 3*square.startY - 1; ++j) {
                for (int k = square.startX; k <= square.endX - 1; ++k) {
                    input[j][k] = 0;
                }
            }

        }

        for (int i = 0; i < N; ++i) {
            System.out.println(Arrays.toString(input[i]));
        }


    }
}

class Coordinate {
    int startX;
    int startY;
    int endX;
    int endY;

    Coordinate(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }
}

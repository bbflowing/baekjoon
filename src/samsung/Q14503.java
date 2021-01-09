package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14503 {
    public static int N;
    public static int M;
    public static int [][] input;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int dx [] = {-1, 0, 1, 0};
        int dy [] = {0, -1, 0, 1}; // 0: North, 1: West, 2: South, 3: East

        st = new StringTokenizer(br.readLine());
        int robotX = Integer.parseInt(st.nextToken());
        int robotY = Integer.parseInt(st.nextToken());
        int direction = Integer.parseInt(st.nextToken()); // 0: North, 1: East, 2: South, 3: West
        if (direction == 3) {
            direction = 1;
        } else if (direction == 1) {
            direction = 3;
        }

        input = new int [N][M];
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; ++j) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        input[robotX][robotY] = 1 ;
        int counter = 1;
        while (true) {

        }


    }

}

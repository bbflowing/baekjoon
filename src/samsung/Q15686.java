package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q15686 {
    /*
    public static int map [][];
    public static ArrayList<Coordinate> houses;
    public static int answer;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        map = new int [N][N];
        houses = new ArrayList<>();
        ArrayList<Coordinate> chicken = new ArrayList<>();
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {
                    houses.add(new Coordinate(i, j));
                } else if (map[i][j] == 2) {
                    chicken.add(new Coordinate(i, j));
                }
            }
        }
        answer = 987_654_321;
        for (int i=1; i<=M; ++i) {
            Coordinate [] result = new Coordinate [i];
            combination(chicken, chicken.size(), i, 0, 0, result);
        }
        System.out.println(answer);
    }

    public static void solve (Coordinate [] result) {
        int sum = 0;
        for (Coordinate coordinate : houses) {
            int distance = 987_654_321;
            for (Coordinate coordinate1 :result) {
                int temp = Math.abs(coordinate.x - coordinate1.x) + Math.abs(coordinate.y - coordinate1.y);
                if (temp < distance) {
                    distance = temp;
                }
            }
            sum += distance;
        }
        if (answer > sum) {
            answer = sum;
        }
    }

    public static void combination (ArrayList<Coordinate> chicken, int N, int R,
                                    int index, int start, Coordinate [] result) {
        if (index == R) {
            solve(result);
            return;
        }

        if (start == N) {
            return;
        }

        result[index] = chicken.get(start);
        combination(chicken, N, R, index+1, start+1, result);
        combination(chicken, N, R, index, start+1, result);
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

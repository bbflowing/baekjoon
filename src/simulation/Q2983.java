package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q2983 {
    public static boolean map [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String moves = br.readLine();
        HashMap<String, Boolean> map = new HashMap<>();
        ArrayList<Coordinate> plants = new ArrayList<>();
        for (int i=0; i<K; ++i) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            plants.add(new Coordinate(x, y));
            map.put(x+","+y, true);
        }
        Coordinate frog = new Coordinate(plants.get(0).x, plants.get(0).y);

        int dx [] = {1, 1, -1, -1};
        int dy [] = {1, -1, 1, -1};
        for (int i=0; i<moves.length(); ++i) {
            char move = moves.charAt(i);
            int nx = frog.x; int ny = frog.y;
            if (move == 'A') {
                while (true) {
                    nx += dx[0];
                    ny += dy[0];
                    if (map.containsKey(nx+","+ny)) {
                        frog.x = nx;
                        frog.y = ny;
                        break;
                    }
                }
            } else if (move == 'B') {
                while (true) {
                    nx += dx[1];
                    ny += dy[1];
                    if (map.containsKey(nx+","+ny)) {
                        frog.x = nx;
                        frog.y = ny;
                        break;
                    }
                }
            } else if (move == 'C') {
                while (true) {
                    nx += dx[2];
                    ny += dy[2];
                    if (map.containsKey(nx+","+ny)) {
                        frog.x = nx;
                        frog.y = ny;
                        break;
                    }
                }
            } else if (move == 'D') {
                while (true) {
                    nx += dx[3];
                    ny += dy[3];
                    if (map.containsKey(nx+","+ny)) {
                        frog.x = nx;
                        frog.y = ny;
                        break;
                    }
                }
            }
        }
        System.out.println(frog.x+" "+frog.y);
    }

}

class Coordinate {
    int x;
    int y;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }
}
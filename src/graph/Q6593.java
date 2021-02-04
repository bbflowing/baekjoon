package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q6593 {
    public static char building [][][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        while (!line.contentEquals("0 0 0")) {
            StringTokenizer st = new StringTokenizer(line);
            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int startX = 0; int startY = 0; int startZ = 0;
            int endX = 0; int endY = 0; int endZ = 0;
            building = new char [L][R][C];
            for (int i=0; i<L; ++i) {
                for (int j=0; j<R; ++j) {
                    line = br.readLine();
                    //String temp = "";
                    for (int l=0; l<C; ++l) {
                        building [i][j][l] = line.charAt(l);
                        if (building[i][j][l] == 'S') {
                            startZ = i; startX = j; startY = l;
                        }
                        //temp += building[i][j][l];
                    }
                    //System.out.println(temp);
                }
                String blank = br.readLine();
                //System.out.println(blank);
            }
            bfs(startZ, startX, startY, L, R, C);
            line = br.readLine();
        }
    }
    public static void bfs (int startZ, int startX, int startY, int L, int R, int C) {
        int dz [] = {0, 0, 0, 0, -1, 1};
        int dx [] = {-1, 1, 0, 0, 0, 0};
        int dy [] = {0, 0, -1, 1, 0, 0};

        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(startZ, startX, startY, 0));
        boolean check [][][] = new boolean [L][R][C];
        check[startZ][startX][startY] = true;

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            if (building[current.z][current.x][current.y] == 'E') {
                System.out.println("Escaped in "+current.time+" minute(s).");
                return;
            }
            for (int i=0; i<6; ++i) {
                int newZ = current.z + dz[i];
                int newX = current.x + dx[i];
                int newY = current.y + dy[i];

                if (newZ < 0 || L <= newZ || newX < 0 || R <= newX || newY < 0 || C <= newY) {
                    continue;
                }
                if (check[newZ][newX][newY]) {
                    continue;
                }
                if (building[newZ][newX][newY] == '#') {
                    continue;
                }
                System.out.println(newZ+", "+newX+", "+newY);
                queue.add(new Coordinate(newZ, newX, newY, current.time + 1));
                check[newZ][newX][newY] = true;
            }
        }
        System.out.println("Trapped!");
    }
}

class Coordinate {
    int z;
    int x;
    int y;
    int time;

    Coordinate (int z, int x, int y, int time) {
        this.z = z;
        this.x = x;
        this.y = y;
        this.time = time;
    }
}

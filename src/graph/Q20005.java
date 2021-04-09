package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q20005 {
    /*
    public static char map [][];
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        Coordinate location [] = new Coordinate [P];
        map = new char [N][M];
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                map[i][j] = line.charAt(j);
                if ('a' <= map[i][j] && map[i][j] <= 'z') {
                    //System.out.println(map[i][j]-'a'+","+map[i][j]);
                    location [map[i][j] - 'a'] = new Coordinate(i, j);
                }
            }
        }
        int damage [] = new int [P];
        for (int i=0; i<P; ++i) {
            st = new StringTokenizer(br.readLine());
            String player = st.nextToken();
            damage[i] = Integer.parseInt(st.nextToken());
        }
        int time [] = new int [P];
        boolean players [] = new boolean [P];
        int min = 987_654_321;
        for (int i=0; i<P; ++i) {
            Coordinate c = location[i];
            //System.out.println(c.x+","+c.y);
            time[i] = bfs(c, N, M);
            if (min > time[i] && time[i] != -1) {
                min = time[i];
            }
        }
        //System.out.println(Arrays.toString(time));
        int hp = Integer.parseInt(br.readLine());
        int count = min;
        while (hp > 0) {
            int turn = 0;
            for (int i=0; i<P; ++i) {
                if (time[i] <= count && time[i] != -1) {
                    players[i] = true;
                    turn += damage[i];
                }
            }
            hp -= turn;
            ++count;
        }

        int answer = 0;
        for (int i=0; i<P; ++i) {
            if (players[i]) {
                ++answer;
            }
        }
        System.out.println(answer);
    }

    public static int bfs (Coordinate c, int N, int M) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> queue = new LinkedList<>();
        boolean visited [][] = new boolean [N][M];
        queue.add(new Coordinate(c.x, c.y, 0));
        visited[c.x][c.y] = true;

        while (!queue.isEmpty()) {
            Coordinate current = queue.poll();
            if (map[current.x][current.y] == 'B') {
                //System.out.println(current.time);
                return current.time;
            }
            for (int i=0; i<4; ++i) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

                if (nx<0 || N<=nx || ny<0 || M<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                if (map[nx][ny] == 'X') {
                    continue;
                }
                queue.add(new Coordinate(nx, ny, current.time+1));
                visited[nx][ny] = true;
                //System.out.println(nx+","+ny+","+(current.time+1));
            }
        }
        return -1;
    }
     */
}

/*
class Coordinate {
    int x;
    int y;
    int time;

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate (int x, int y, int time) {
        this.x = x;
        this.y = y;
        this.time = time;
    }
}

 */

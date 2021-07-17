package graph;

// 보물섬

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2589 {
    /*
    public static int R, C;
    public static char[][] map;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new char[R][C];
        ArrayList<Location> list = new ArrayList<>();
        String line = "";
        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                map[r][c] = line.charAt(c);
                if (map[r][c] == 'L') list.add(new Location(r, c, 0));
            }
        }
        int answer = 0;
        for (Location l : list) answer = Math.max(bfs(l), answer);
        System.out.println(answer);
    }

    public static int bfs(Location start) {
        boolean[][] visited = new boolean[R][C];
        visited[start.r][start.c] = true;
        Queue<Location> queue = new ArrayDeque<>();
        queue.add(start);
        int answer = 0;

        while (!queue.isEmpty()) {
            Location cur = queue.poll();
            answer = Math.max(answer, cur.distance);
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (visited[nr][nc]) continue;
                if (map[nr][nc] == 'W') continue;
                visited[nr][nc] = true;
                queue.add(new Location(nr, nc, cur.distance+1));
            }
        }
        return answer;
    }
     */
}

/*
class Location {
    int r, c, distance;

    Location(int r, int c, int distance) {
        this.r = r;
        this.c = c;
        this.distance = distance;
    }
}
 */
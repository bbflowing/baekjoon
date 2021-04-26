package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q5980 {
    /*
    public static int R, C;
    public static char[][] maze;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        maze = new char[R][C];
        Coordinate start = null;
        ArrayList<ArrayList<Coordinate>> slides = new ArrayList<>(26);
        for (int i=0; i<26; ++i) {
            slides.add(new ArrayList<>());
        }
        String line;

        for (int r=0; r<R; ++r) {
            line = br.readLine();
            for (int c=0; c<C; ++c) {
                maze[r][c] = line.charAt(c);
                if (maze[r][c] == '@') {
                    start = new Coordinate(r, c, 0);
                } else if (0 <= maze[r][c]-'A' && maze[r][c]-'A' < 26) {
                    int index = maze[r][c]-'A';
                    slides.get(index).add(new Coordinate(r, c));
                }
            }
        }
        bfs(start, slides);
    }
    public static void bfs (Coordinate start, ArrayList<ArrayList<Coordinate>> slides) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        Queue<Coordinate> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[R][C];
        visited[start.r][start.c] = true;
        queue.add(start);

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            if (maze[c.r][c.c] == '=') {
                System.out.println(c.time);
                return;
            }
            for (int dir=0; dir<4; ++dir) {
                int nr = c.r + dr[dir];
                int nc = c.c + dc[dir];

                if (nr<0 || R<=nr || nc<0 || C<=nc) {
                    continue;
                }
                if (visited[nr][nc]) {
                    continue;
                }
                if (maze[nr][nc] == '#') {
                    continue;
                } else if (0 <= maze[nr][nc]-'A' && maze[nr][nc]-'A' < 26) {
                    int index = maze[nr][nc]-'A';
                    ArrayList<Coordinate> target = slides.get(index);
                    if (target.get(0).r == nr && target.get(0).c == nc) {
                        queue.add(new Coordinate(target.get(1).r, target.get(1).c, c.time+1));
                    } else {
                        queue.add(new Coordinate(target.get(0).r, target.get(0).c, c.time+1));
                    }
                } else {
                    queue.add(new Coordinate(nr, nc, c.time+1));
                    visited[nr][nc] = true;
                }
            }
        }
    }
     */
}

/*
class Coordinate {
    int r;
    int c;
    int time;

    Coordinate (int r, int c, int time) {
        this.r = r;
        this.c = c;
        this.time = time;
    }

    Coordinate (int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */
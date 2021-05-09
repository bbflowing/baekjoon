package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Q17025 {
    /*
    public static int N;
    public static char[][] map;
    public static boolean[][] visited;

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        String line = "";
        for (int r=0; r<N; ++r) {
            line = br.readLine();
            for (int c=0; c<N; ++c) {
                map[r][c] = line.charAt(c);
            }
        }
        ArrayList<Coordinate> answers = new ArrayList<>();
        visited = new boolean[N][N];
        for (int r=0; r<N; ++r) {
            for (int c=0; c<N; ++c) {
                if (map[r][c] == '#' && !visited[r][c]) {
                    answers.add(bfs(r, c));
                }
            }
        }
        Collections.sort(answers, (c1, c2) -> {
            if (c1.r < c2.r) {
                return 1;
            } else if (c1.r == c2.r) {
                if (c1.c > c2.c) {
                    return 1;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        });
        Coordinate answer = answers.get(0);
        System.out.println(answer.r+" "+answer.c);
    }

    public static Coordinate bfs (int r, int c) {
        Queue<Coordinate> queue = new ArrayDeque<>();
        queue.add(new Coordinate(r, c));
        visited[r][c] = true;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int size = 0;
        int perimeter = 0;
        while (!queue.isEmpty()) {
            Coordinate cur = queue.poll();
            ++size;

            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];

                if (nr<0 || N<=nr || nc<0 || N<=nc) {
                    ++perimeter;
                    continue;
                }
                if (visited[nr][nc]) continue;
                if (map[nr][nc] == '.') {
                    ++perimeter;
                    continue;
                }
                queue.add(new Coordinate(nr, nc));
                visited[nr][nc] = true;
            }
        }
        return new Coordinate (size, perimeter);
    }
     */
}

/*
class Coordinate {
    int r;
    int c;

    Coordinate (int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */

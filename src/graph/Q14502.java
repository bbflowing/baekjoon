package graph;

//연구소

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q14502 {
    /*
    public static int R, C, blank, answer;
    public static int map[][];
    public static Queue<Location> queue;
    public static ArrayList<Location> blanks;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new int[R][C];
        queue = new ArrayDeque<>();
        blank = 0;
        answer = Integer.MIN_VALUE;
        blanks = new ArrayList<>();
        for (int r=0; r<R; ++r) {
            st = new StringTokenizer(br.readLine());
            for (int c=0; c<C; ++c) {
                map[r][c] = Integer.parseInt(st.nextToken());
                if (map[r][c] == 2) queue.add(new Location(r, c));
                else if (map[r][c] == 0) {
                    ++blank;
                    blanks.add(new Location(r, c));
                }
            }
        }
        Location[] result = new Location[3];
        combination(result, 0, 0);
        System.out.println(answer);
    }

    public static int bfs(Location[] result) {
        Queue<Location> virus = new ArrayDeque<>(queue);
        for (int i=0; i<3; ++i) map[result[i].r][result[i].c] = 1;
        boolean[][] visited = new boolean[R][C];
        int count = blank-3;

        while (!virus.isEmpty()) {
            Location cur = virus.poll();
            for (int dir=0; dir<4; ++dir) {
                int nr = cur.r + dr[dir];
                int nc = cur.c + dc[dir];
                if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                if (visited[nr][nc]) continue;
                if (map[nr][nc] != 0) continue;
                visited[nr][nc] = true;
                --count;
                virus.add(new Location(nr, nc));
            }
        }
        for (int i=0; i<3; ++i) map[result[i].r][result[i].c] = 0;
        return count;
    }

    public static void combination(Location[] result, int start, int index) {
        if (index == 3) {
            answer = Math.max(answer, bfs(result));
            return;
        }

        if (start == blanks.size()) return;

        result[index] = blanks.get(start);
        combination(result, start+1, index+1);
        combination(result, start+1, index);
    }
     */
}

/*
class Location {
    int r, c;

    Location(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */
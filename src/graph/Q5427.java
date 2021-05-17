package graph;

import java.io.*;
import java.util.*;

public class Q5427 {
    /*
    public static int R, C;
    public static char[][] building;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int t=0; t<T; ++t) {
            st = new StringTokenizer(br.readLine());
            C = Integer.parseInt(st.nextToken());
            R = Integer.parseInt(st.nextToken());
            building = new char[R][C];
            boolean[][] fireV = new boolean[R][C];
            boolean[][] personV = new boolean[R][C];
            Queue<Coordinate> fire = new ArrayDeque<>();
            Queue<Coordinate> person = new ArrayDeque<>();
            String line = "";
            for (int r=0; r<R; ++r) {
                line = br.readLine();
                for (int c=0; c<C; ++c) {
                    building[r][c] = line.charAt(c);
                    if (building[r][c] == '*') {
                        fireV[r][c] = true;
                        fire.add(new Coordinate(r, c));
                    } else if (building[r][c] == '@') {
                        personV[r][c] = true;
                        person.add(new Coordinate(r, c));
                    }
                }
            }
            int answer = bfs(fireV, personV, fire, person);
            if (answer == -1) bw.append("IMPOSSIBLE");
            else bw.append(String.valueOf(answer));
            bw.newLine();
        }
        bw.flush();
    }

    public static int bfs(boolean[][] fireV, boolean[][] personV,
                          Queue<Coordinate> fire, Queue<Coordinate> person) {
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        int time = 0;

        while (!person.isEmpty()) {
            ++time;
            int size = fire.size();
            for (int i=0; i<size; ++i) {
                Coordinate f = fire.poll();
                for (int dir=0; dir<4; ++dir) {
                    int nr = f.r + dr[dir];
                    int nc = f.c + dc[dir];
                    if (nr<0 || R<=nr || nc<0 || C<=nc) continue;
                    if (fireV[nr][nc]) continue;
                    if (building[nr][nc] == '#') continue;
                    fire.add(new Coordinate(nr, nc));
                    fireV[nr][nc] = true;
                }
            }
            size = person.size();
            for (int i=0; i<size; ++i) {
                Coordinate p = person.poll();
                for (int dir=0; dir<4; ++dir) {
                    int nr = p.r + dr[dir];
                    int nc = p.c + dc[dir];
                    if (nr<0 || R<=nr || nc<0 || C<=nc) return time;
                    if (fireV[nr][nc] || personV[nr][nc]) continue;
                    if (building[nr][nc] == '#') continue;
                    person.add(new Coordinate(nr, nc));
                    personV[nr][nc] = true;
                }
            }
            if (person.size() == 0) break;
        }
        return -1;
    }
     */
}

/*
class Coordinate {
    int r, c;

    Coordinate(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
 */
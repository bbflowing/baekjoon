package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q4179 {
    public static char input [][];
    public static int min;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        input = new char [R+2][C+2];
        Queue<Coordinate> fire = new LinkedList<>();
        int check [][] = new int [R+2][C+2];
        Coordinate person = null;
        for (int i=1; i<=R; ++i) {
            String line = br.readLine();
            for (int j=1; j<=C; ++j) {
                input[i][j] = line.charAt(j-1);
                if (input[i][j] == 'F') {
                    fire.add(new Coordinate(i, j));
                    check[i][j] = -1;
                } else if (input[i][j] == 'J') {
                    person = new Coordinate(i, j, 0);
                } else if (input[i][j] == '#') {
                    check[i][j] = -1;
                }
            }
        }
        min = 987_654_321;
        bfs(fire, check, person, R, C);
        if (min == 987_654_321) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(min);
        }
    }
    public static void bfs (Queue<Coordinate> fire, int [][] check, Coordinate person, int R, int C) {
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};
        Queue<Coordinate> location = new LinkedList<>();
        location.add(person);
        check[person.x][person.y] = 1;

        while (!location.isEmpty()) {
            for (int i=0, end = fire.size(); i<end; ++i) {
                Coordinate currentFire = fire.poll();
                for (int j=0; j<4; ++j) {
                    int nfx = currentFire.x + dx[j];
                    int nfy = currentFire.y + dy[j];
                    if (0 < nfx && nfx < R+1 && 0 < nfy && nfy < C+1) {
                        if (check[nfx][nfy] == -1) {
                            continue;
                        } else {
                            check[nfx][nfy] = -1;
                            fire.add(new Coordinate(nfx, nfy));
                        }
                    }
                }
            }
            for (int i=0, end = location.size(); i<end; ++i) {
                Coordinate p = location.poll();
                if (p.x == 0 || p.x == R+1 || p.y == 0 || p.y == C+1) {
                    if (p.time < min) {
                        min = p.time;
                    }
                    continue;
                }
                for (int j=0; j<4; ++j) {
                    int nx = p.x + dx[j];
                    int ny = p.y + dy[j];
                    if (0 <= nx && nx <= R+1 && 0 <= ny && ny <= C+1) {

                        if (check[nx][ny] == -1 || check[nx][ny] == 1) {
                            continue;
                        } else {
                            check[nx][ny] = 1;
                            location.add(new Coordinate(nx, ny, p.time + 1));
                        }
                    }
                }
            }
        }
    }
}

class Coordinate {
    int x;
    int y;
    int time;

    Coordinate (int x, int y, int time) {
        this.x = x;
        this.y = y;
        this.time = time;
    }

    Coordinate (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

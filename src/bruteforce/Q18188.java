package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q18188 {
    public static char hill [][];
    public static char instructions [][];
    public static boolean visited [][];
    public static int H, W, N;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        hill = new char [H+1][W+1];
        Coordinate dao = null;
        for (int i=1; i<=H; ++i) {
            String line = br.readLine();
            for (int j=1; j<=W; ++j) {
                hill[i][j] = line.charAt(j-1);
                if (hill[i][j] == 'D') {
                    dao = new Coordinate(i, j);
                }
            }
        }
        N = Integer.parseInt(br.readLine());
        instructions = new char [N][2];
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            instructions[i][0] = st.nextToken().charAt(0);
            instructions[i][1] = st.nextToken().charAt(0);
        }
        solve(dao.x, dao.y, 0, "");
        System.out.println("NO");
    }

    public static void solve (int x, int y, int times, String route) {
        if (hill[x][y] == 'Z') {
            System.out.println("YES");
            System.out.println(route);
            System.exit(0);
        }

        if (times == N) {
            return;
        }

        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        char in1 = instructions[times][0];
        char in2 = instructions[times][1];

        for (int i=0; i<2; ++i) {
            int nx = x; int ny = y; String nroute = "";
            if (i==0) {
                if (in1 == 'W') {
                    nx += dx[0];
                    ny += dy[0];
                    nroute = "W";
                } else if (in1 == 'A') {
                    nx += dx[2];
                    ny += dy[2];
                    nroute = "A";
                } else if (in1 == 'S') {
                    nx += dx[1];
                    ny += dy[1];
                    nroute = "S";
                } else if (in1 == 'D') {
                    nx += dx[3];
                    ny += dy[3];
                    nroute = "D";
                }
            } else {
                if (in2 == 'W') {
                    nx += dx[0];
                    ny += dy[0];
                    nroute = "W";
                } else if (in2 == 'A') {
                    nx += dx[2];
                    ny += dy[2];
                    nroute = "A";
                } else if (in2 == 'S') {
                    nx += dx[1];
                    ny += dy[1];
                    nroute = "S";
                } else if (in2 == 'D') {
                    nx += dx[3];
                    ny += dy[3];
                    nroute = "D";
                }
            }


            if (nx<1 || H+1<=nx || ny<1 || W+1<=ny) {
                continue;
            }


            if (hill[nx][ny] == '@') {
                continue;
            }

            //System.out.println(route);
            solve(nx, ny, times+1, route+nroute);
        }
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

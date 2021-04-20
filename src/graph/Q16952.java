package graph;

public class Q16952 {
    /*
    public static int N;
    public static int board[][];

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        StringTokenizer st;
        int startX = 0; int startY = 0;
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<N; ++j) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 1) {
                    startX = i; startY = j;
                }
            }
        }
        solve(startX, startY);
    }

    public static void solve (int x, int y) {
        int max = (int) Math.pow(N, 2);
        boolean visited[][][][] = new boolean[3][N][N][max+1];
        PriorityQueue<Coordinate> queue = new PriorityQueue<>((c1, c2) -> {
            if (c1.distance > c2.distance) {
                return 1;
            } else if (c1.distance == c2.distance) {
                if (c1.changes > c2.changes) {
                    return 1;
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        });
        for (int piece=0; piece<3; ++piece) {
            visited[piece][x][y][2] = true;
            queue.add(new Coordinate(piece, x, y, 2, 0, 0));
        }

        int knightX[] = {-1, -2, -2, -1, +1, +2, +2, +1};
        int knightY[] = {-2, -1, +1, +2, -2, -1, +1, +2};
        int bishopX[] = {-1, -1, +1, +1};
        int bishopY[] = {-1, +1, -1, +1};
        int rookX[] = {-1, 0, 0, +1};
        int rookY[] = {0, -1, +1, 0};

        while (!queue.isEmpty()) {
            Coordinate c = queue.poll();
            //System.out.println(c.x+","+c.y+","+c.piece+","+c.target+","+c.distance+","+c.changes);
            if (c.target == board[c.x][c.y]) {
                if (c.target == max) {
                    System.out.println(c.distance+" "+c.changes);
                    return;
                } else {
                    visited[c.piece][c.x][c.y][c.target+1] = true;
                    queue.add(new Coordinate(c.piece, c.x, c.y, c.target+1, c.distance, c.changes));
                    continue;
                }
            }

            for (int piece=0; piece<3; ++piece) {
                if (c.piece != piece) {
                    if (!visited[piece][c.x][c.y][c.target]) {
                        visited[piece][c.x][c.y][c.target] = true;
                        queue.add(new Coordinate(piece, c.x, c.y, c.target, c.distance+1, c.changes+1));
                    }
                }
            }

            if (c.piece == 0) {
                int nx = c.x; int ny = c.y;
                for (int dir=0; dir<8; ++dir) {
                    nx = c.x + knightX[dir];
                    ny = c.y + knightY[dir];

                    if (!check(nx, ny)) continue;
                    if (visited[c.piece][nx][ny][c.target]) continue;
                    visited[c.piece][nx][ny][c.target] = true;
                    queue.add(new Coordinate(c.piece, nx, ny, c.target, c.distance+1, c.changes));
                }
            } else if (c.piece == 1) {
                for (int dir=0; dir<4; ++dir) {
                    int nx = c.x; int ny = c.y;
                    while (true) {
                        nx += bishopX[dir];
                        ny += bishopY[dir];

                        if (!check(nx, ny)) break;
                        if (visited[c.piece][nx][ny][c.target]) continue;
                        visited[c.piece][nx][ny][c.target] = true;
                        queue.add(new Coordinate(c.piece, nx, ny, c.target, c.distance+1, c.changes));
                    }
                }
            } else {
                for (int dir=0; dir<4; ++dir) {
                    int nx = c.x; int ny = c.y;
                    while (true) {
                        nx += rookX[dir];
                        ny += rookY[dir];

                        if (!check(nx, ny)) break;
                        if (visited[c.piece][nx][ny][c.target]) continue;
                        visited[c.piece][nx][ny][c.target] = true;
                        queue.add(new Coordinate(c.piece, nx, ny, c.target, c.distance+1, c.changes));
                    }
                }
            }
        }
    }

    public static boolean check (int x, int y) {
        if (x<0 || N<=x || y<0 || N<=y) {
            return false;
        }
        return true;
    }
     */
}
/*
class Coordinate {
    int piece;
    int x;
    int y;
    int target;
    int distance;
    int changes;

    Coordinate (int piece, int x, int y, int target, int distance, int changes) {
        this.piece = piece;
        this.x = x;
        this.y = y;
        this.target = target;
        this.distance = distance;
        this.changes = changes;
    }
}
 */

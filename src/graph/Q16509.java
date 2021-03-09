package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q16509 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Coordinate king = null; Coordinate sang = null;
        StringTokenizer st = new StringTokenizer(br.readLine());
        sang = new Coordinate(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        king = new Coordinate(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        bfs(sang, king);
    }

    public static void bfs (Coordinate sang, Coordinate king) {
        int dx [] = {-3, -3, -2, -2, +3, +3, +2, +2};
        int dy [] = {-2, +2, -3, +3, -2, +2, -3, +3};
        Queue<Coordinate> queue = new LinkedList<>();
        //ArrayList<Coordinate> route = new ArrayList<>();
        //route.add(new Coordinate(sang.x, sang.y));
        queue.add(new Coordinate(sang.x, sang.y, 0));
        boolean visited [][] = new boolean [10][9];
        visited[sang.x][sang.y] = true;
        boolean success = false;

        while (!queue.isEmpty()) {
            Coordinate s = queue.poll();

            for (int i=0; i<8; ++i) {
                int nx = s.x + dx[i];
                int ny = s.y + dy[i];

                if (nx<0 || 10<=nx || ny<0 || 9<=ny) {
                    continue;
                }
                if (visited[nx][ny]) {
                    continue;
                }
                Pair temp = check(i, s.x, s.y, king);
                if (!temp.result && temp.flag == 0) {
                    continue;
                }
                if (temp.result) {
                    System.out.println(s.distance+1);
                    success = true;
                    break;
                }
                visited[nx][ny] = true;
                queue.add(new Coordinate(nx, ny, s.distance+1));
            }
            if (success) {
                break;
            }
        }
        if (!success) {
            System.out.println(-1);
        }
    }

    public static Pair check (int i, int x, int y, Coordinate king) {
        if (i==0) { // -3, -2
            if (x-1 == king.x && y == king.y) {
                return new Pair (false, 0);
            }
            if (x-2 == king.x && y-1 == king.y) {
                return new Pair (false, 0);
            }
            if (x-3 == king.x && y-2 == king.y) {
                return new Pair (true, 0);
            }
        } else if (i==1) {
            if (x-1 == king.x && y == king.y) {
                return new Pair (false, 0);
            }
            if (x-2 == king.x && y+1 == king.y) {
                return new Pair (false, 0);
            }
            if (x-3 == king.x && y+2 == king.y) {
                return new Pair (true, 0);
            }
        } else if (i==2) {
            if (x == king.x && y-1 == king.y) {
                return new Pair (false, 0);
            }
            if (x-1 == king.x && y-2 == king.y) {
                return new Pair (false, 0);
            }
            if (x-2 == king.x && y-3 == king.y) {
                return new Pair (true, 0);
            }
        } else if (i==3) {
            if (x == king.x && y+1 == king.y) {
                return new Pair (false, 0);
            }
            if (x-1 == king.x && y+2 == king.y) {
                return new Pair (false, 0);
            }
            if (x-2 == king.x && y+3 == king.y) {
                return new Pair (true, 0);
            }
        } else if (i==4) {
            if (x+1 == king.x && y == king.y) {
                return new Pair (false, 0);
            }
            if (x+2 == king.x && y-1 == king.y) {
                return new Pair (false, 0);
            }
            if (x+3 == king.x && y-2 == king.y) {
                return new Pair (true, 0);
            }
        } else if (i==5) {
            if (x+1 == king.x && y == king.y) {
                return new Pair (false, 0);
            }
            if (x+2 == king.x && y+1 == king.y) {
                return new Pair (false, 0);
            }
            if (x+3 == king.x && y+2 == king.y) {
                return new Pair (true, 0);
            }
        } else if (i==6) {
            if (x == king.x && y-1 == king.y) {
                return new Pair (false, 0);
            }
            if (x+1 == king.x && y-2 == king.y) {
                return new Pair (false, 0);
            }
            if (x+2 == king.x && y-3 == king.y) {
                return new Pair (true, 0);
            }
        } else if (i==7) {
            if (x == king.x && y+1 == king.y) {
                return new Pair (false, 0);
            }
            if (x+1 == king.x && y+2 == king.y) {
                return new Pair (false, 0);
            }
            if (x+2 == king.x && y+3 == king.y) {
                return new Pair (true, 0);
            }
        }
        return new Pair (false, 1);
    }
     */
}

/*
class Pair {
    boolean result;
    int flag;

    Pair (boolean result, int flag) {
        this.result = result;
        this.flag = flag;
    }
}

class Coordinate {
    int x;
    int y;
    int distance;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate(int x, int y, int distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }
}

 */

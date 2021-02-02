package simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q13459 {
    public static char input [][];
    public static int holeX;
    public static int holeY;
    public static void main (String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new char [N][M];
        int blueX = 0; int blueY = 0;
        int redX = 0; int redY = 0;
        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                input[i][j] = line.charAt(j);
                if (input[i][j] == 'O') {
                    holeX = i; holeY = j;
                } else if (input[i][j] == 'B') {
                    blueX = i; blueY = j;
                } else if (input[i][j] == 'R') {
                    redX = i; redY = j;
                }
            }
        }

        Queue<Location> queue = new LinkedList<>();
        queue.add(new Location(redX, redY, blueX, blueY, 0));
        boolean check [][][][] = new boolean [N][M][N][M];
        check[redX][redY][blueX][blueY] = true;
        int counter = 0;

        while (!queue.isEmpty()) {
            Location current = queue.poll();
            if (current.counter >= 10) {
                continue;
            }
            Marble red; Marble blue;
            for (int i=0; i<4; ++i) {
                red = move(current.redX, current.redY, i);
                blue = move(current.blueX, current.blueY, i);

                if (input[red.x][red.y] == 'O' && input[blue.x][blue.y] == 'O') {
                    System.out.println(0);
                    System.exit(0);
                } else if (input[red.x][red.y] == 'O' && input[blue.x][blue.y] != 'O') {
                    System.out.println(1);
                    System.exit(0);
                } else if (input[red.x][red.y] != 'O' && input[blue.x][blue.y] == 'O') {
                    continue;
                }

                if (red.x == blue.x && red.y == blue.y) {

                    if (i == 0) { //north
                        if (current.redX < current.blueX) {
                            ++blue.x;
                        } else {
                            ++red.x;
                        }
                    } else if (i == 1) { //south
                        if (current.redX < current.blueX) {
                            --red.x;
                        } else {
                            --blue.x;
                        }
                    } else if (i == 2) { //west
                        if (current.redY < current.blueY) {
                            ++blue.y;
                        } else {
                            ++red.y;
                        }
                    } else { //east
                        if (current.redY < current.blueY) {
                            --red.y;
                        } else {
                            --blue.y;
                        }
                    }
                }

                if (!check[red.x][red.y][blue.x][blue.y]) {
                    counter = current.counter + 1;
                    queue.add(new Location(red.x, red.y, blue.x, blue.y, counter));
                    check[red.x][red.y][blue.x][blue.y] = true;
                }
            }
        }
        System.out.println(0);
    }

    public static Marble move(int x, int y, int direction) {
        int dx [] = {-1, 1, 0, 0}; //north, south, west, east
        int dy [] = {0, 0, -1, 1};
        int finalX = 0; int finalY = 0;
        int newX = x; int newY = y;
        while (true) {
            newX += dx[direction];
            newY += dy[direction];
            if (input[newX][newY] == 'O') {
                finalX = newX;
                finalY = newY;
                break;
            } else if (input[newX][newY] == '#') {
                finalX = newX - dx[direction];
                finalY = newY - dy[direction];
                break;
            }
        }
        return new Marble(finalX, finalY);
    }
}

class Location {
    int redX;
    int redY;
    int blueX;
    int blueY;
    int counter;

    Location(int redX, int redY, int blueX, int blueY, int counter) {
        this.redX = redX;
        this.redY = redY;
        this.blueX = blueX;
        this.blueY = blueY;
        this.counter = counter;
    }
}

class Marble {
    int x;
    int y;

    Marble (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q13460 {
    public static Character input [][];
    public static void main (String args[]) throws IOException {
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        input = new Character [N][M];
        int redX = 0; int redY = 0; int blueX = 0; int blueY = 0; int goalX = 0; int goalY = 0;

        for (int i=0; i<N; ++i) {
            String line = br.readLine();
            for (int j=0; j<M; ++j) {
                if (line.charAt(j) == '.') {
                    input[i][j] = '.';
                } else if (line.charAt(j) == '#') {
                    input[i][j] = '#';
                } else if (line.charAt(j) == 'O') {
                    input[i][j] = 'O'; //goal
                } else if (line.charAt(j) == 'B') {
                    input[i][j] = 'B'; //blue
                    blueX = i; blueY = j;
                } else if (line.charAt(j) == 'R') {
                    input[i][j] = 'R'; //red
                    redX = i; redY = j;
                }
            }

        }
        /*
        for (int i=0; i<input.length; ++i) {
            System.out.println(Arrays.toString(input[i]));
        }


        bfs(redX, redY, blueX, blueY, N, M);
    }

    public static void bfs (int redX, int redY, int blueX, int blueY, int N, int M) {
        Queue<Coordinate> position = new LinkedList<>();
        position.add(new Coordinate(redX, redY, blueX, blueY, 0));
        boolean check [][][][] = new boolean [N][M][N][M];
        int dx [] = {-1, 1, 0, 0};
        int dy [] = {0, 0, -1, 1};

        while (!position.isEmpty()) {
            Coordinate previous = position.poll();
            check[previous.redX][previous.redY][previous.blueX][previous.blueY] = true;

            if (previous.count >= 10) {
                break;
            }

            for (int i=0; i<4; ++i) {
                int dRedX = previous.redX; int dRedY = previous.redY;
                int dBlueX = previous.blueX; int dBlueY = previous.blueY;
                int dCount = previous.count;
                //System.out.println("previous: "+dRedX+", "+dRedY+", "+dBlueX+", "+dBlueY+", "+dCount);

                while (input[dBlueX+dx[i]][dBlueY+dy[i]] != '#') {
                    dBlueX += dx[i]; dBlueY += dy[i];
                    if (input[dBlueX][dBlueY] == 'O') {
                        break;
                    }
                }

                if (input[dBlueX][dBlueY] == 'O') {
                    continue;
                }

                while (input[dRedX+dx[i]][dRedY+dy[i]] != '#') {
                    dRedX += dx[i]; dRedY += dy[i];
                    if (input[dRedX][dRedY] == 'O') {
                        System.out.println(dCount+1);
                        System.exit(0);
                    }
                }


                if (dRedX == dBlueX && dRedY == dBlueY) {
                    if (i==0) { //north
                        if (previous.redX > previous.blueX) {
                            dRedX++;
                        } else {
                            dBlueX++;
                        }
                    } else if (i==1) {
                        if (previous.redX > previous.blueX) {
                            dBlueX--;
                        } else {
                            dRedX--;
                        }
                    } else if (i==2) {
                        if (previous.redY > previous.blueY) {
                            dRedY++;
                        } else {
                            dBlueY++;
                        }
                    } else if (i==3) {
                        if (previous.redY > previous.blueY) {
                            dBlueY--;
                        } else {
                            dRedY--;
                        }
                    }

                }

                if (!check[dRedX][dRedY][dBlueX][dBlueY]) {
                    position.add(new Coordinate(dRedX, dRedY, dBlueX, dBlueY, dCount+1));
                    //System.out.println(dRedX+", "+dRedY+", "+dBlueX+", "+dBlueY+", "+(dCount+1));
                }
            }
        }
        System.out.println(-1);
        */
    }
}
/*

class Coordinate {
    int redX;
    int redY;
    int blueX;
    int blueY;
    int count;

    Coordinate (int redX, int redY, int blueX, int blueY, int count) {
        this.redX = redX;
        this.redY = redY;
        this.blueX = blueX;
        this.blueY = blueY;
        this.count = count;
    }

}

 */
package graph;

import java.io.*;
import java.util.ArrayList;

public class Q7682 {
    /*
    public static char game[][];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String line = br.readLine();
            if (line.equals("end")) {
                break;
            }
            ArrayList<Coordinate> Os = new ArrayList<>();
            ArrayList<Coordinate> Xs = new ArrayList<>();
            for (int i = 0; i < 9; ++i) {
                int x = i / 3;
                int y = i % 3;
                char target = line.charAt(i);
                if (target != '.') {
                    if (target == 'X') {
                        Xs.add(new Coordinate(x, y));
                    } else if (target == 'O') {
                        Os.add(new Coordinate(x, y));
                    }
                }
            }
            int xSize = Xs.size();
            int oSize = Os.size();
            if (xSize - oSize > 1 || xSize - oSize < 0) {
                bw.append("invalid");
                bw.newLine();
                continue;
            }

            boolean visited[] = new boolean[xSize];
            Coordinate[] result = new Coordinate[xSize];
            ArrayList<Coordinate[]> Xorders = new ArrayList<>();
            permutation(Xs, Xorders, xSize, visited, 0, result);
            visited = new boolean[oSize];
            result = new Coordinate[oSize];
            ArrayList<Coordinate[]> Oorders = new ArrayList<>();
            permutation(Os, Oorders, oSize, visited, 0, result);
            boolean valid = false;
            boolean finish = false;
            for (int i = 0; i < Xorders.size(); ++i) {
                Coordinate[] xOrder = Xorders.get(i);
                for (int j = 0; j < Oorders.size(); ++j) {
                    valid = false; finish = false;
                    game = new char[3][3];
                    Coordinate[] oOrder = Oorders.get(j);
                    int total = 0;
                    int countx = 0;
                    int counto = 0;
                    for (int k = 0; k < xSize; ++k) {
                        int x = xOrder[k].x;
                        int y = xOrder[k].y;
                        game[x][y] = 'X';
                        ++countx;
                        ++total;
                        boolean check = success(x, y, 'X');
                        if (check) {
                            if (countx == xSize && counto == oSize) {
                                valid = true;
                                bw.append("valid");
                                bw.newLine();
                            }
                            finish = true;
                            break;
                        } else {
                            if (total == 9) {
                                bw.append("valid");
                                bw.newLine();
                                valid = true;
                                finish = true;
                                break;
                            }
                        }
                        if (xSize == oSize || ((xSize != oSize)) && k != xSize - 1) {
                            x = oOrder[k].x;
                            y = oOrder[k].y;
                            game[x][y] = 'O';
                            ++total;
                            ++counto;
                            check = success(x, y, 'O');
                            if (check) {
                                if (countx == xSize && counto == oSize) {
                                    bw.append("valid");
                                    valid = true;
                                    bw.newLine();
                                }
                                finish = true;
                                break;
                            }
                        }
                        if (finish && !valid) continue;
                        else if (finish && valid) break;
                    }
                    if (finish && !valid) continue;
                    else if (finish && valid) break;
                }
                if (finish && !valid) continue;
                else if (finish && valid) break;
            }
            if (!valid) {
                bw.append("invalid");
                bw.newLine();
            }
        }
        bw.flush();
    }

    public static boolean success(int x, int y, char turn) {
        int counter = 0;
        for (int i = 0; i < 3; ++i) {
            if (game[x][i] == turn) {
                ++counter;
            }
        }

        if (counter != 3) {
            counter = 0;
            for (int i = 0; i < 3; ++i) {
                if (game[i][y] == turn) {
                    ++counter;
                }
            }
        }

        if (counter != 3) {
            counter = 1;
            if (x == 0 && y == 0) {
                if (game[1][1] == turn && game[2][2] == turn) {
                    counter = 3;
                }
            } else if (x == 0 && y == 2) {
                if (game[1][1] == turn && game[2][0] == turn) {
                    counter = 3;
                }
            } else if (x == 2 && y == 0) {
                if (game[1][1] == turn && game[0][2] == turn) {
                    counter = 3;
                }
            } else if (x == 2 && y == 2) {
                if (game[1][1] == turn && game[0][0] == turn) {
                    counter = 3;
                }
            } else if (x == 1 && y == 1) {
                if (game[0][0] == turn && game[2][2] == turn) {
                    counter = 3;
                }
            }
        }
        if (counter == 3) {
            return true;
        } else {
            return false;
        }
    }

    public static void permutation(ArrayList<Coordinate> Xs, ArrayList<Coordinate[]> Xorders, int N,
                                   boolean visited[], int index, Coordinate[] result) {
        if (index == N) {
            Xorders.add(result.clone());
            return;
        }

        for (int i = 0; i < N; ++i) {
            if (!visited[i]) {
                visited[i] = true;
                result[index] = Xs.get(i);
                permutation(Xs, Xorders, N, visited, index + 1, result);
                visited[i] = false;
            }
        }
    }
     */
}

/*
class Coordinate {
    int x;
    int y;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
 */

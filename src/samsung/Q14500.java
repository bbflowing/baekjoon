package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q14500 {
    public static int input [][];
    public static ArrayList<Pair> list;
    public static int answer;
    public static int max;
    public static int dx [] = {-1, 1, 0, 0};
    public static int dy [] = {0, 0, -1, 1};
    public static int N;
    public static int M;
    public static Queue<newPair> queue;
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        input = new int [N][M];
        list = new ArrayList<>();
        answer = 0;
        max = 0;
        for (int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<M; ++j) {
                int value = Integer.parseInt(st.nextToken());
                input[i][j] = value;
                list.add(new Pair(value, i, j));
                if (value > max) {
                    max = value;
                }
            }
        }
        list.sort((Pair p1, Pair p2) -> {
           if (p1.value < p2.value) {
               return 1;
           } else if (p1.value == p2.value) {
               if (p1.x > p2.x) {
                   return 1;
               } else if (p1.x == p2.x) {
                   if (p1.y > p2.y) {
                       return 1;
                   } else {
                       return -1;
                   }
               } else {
                   return -1;
               }
           } else {
               return -1;
           }
        });

/*
        for (int i=0; i<list.size(); ++i) {
            System.out.println(list.get(i).value+", "+list.get(i).x+", "+list.get(i).y);
        }
*/


        for (int i=0; i<list.size(); ++i) {
            Pair next = list.get(i);
            int nextX = next.x;
            int nextY = next.y;
            int sum = 0;
            boolean check [][] = new boolean [N][M];
            int counter = 0;
            if (input[nextX][nextY]+max*3 > answer) {
                dfs(nextX, nextY, sum, check, counter);
                int sum1 = 0; int sum2 = 0; int sum3 = 0; int sum4 = 0;
                if (0 <= nextX-1 && 0 <= nextY-1 && nextY +1 <M) {
                    sum1 = input[nextX-1][nextY-1] + input [nextX-1][nextY] + input[nextX-1][nextY+1] + input[nextX][nextY];
                }
                if (nextX + 1 < N && 0 <= nextY - 1 && nextY + 1 < M) {
                    sum2 = input[nextX+1][nextY-1] + input[nextX+1][nextY] + input[nextX+1][nextY+1] + input[nextX][nextY];
                }
                if (0 <= nextX - 1 && nextX + 1 < N  && nextY + 1 < M) {
                    sum3 = input[nextX-1][nextY+1] + input[nextX][nextY+1] + input[nextX+1][nextY+1] + input[nextX][nextY];
                }
                if (0 <= nextX - 1 && nextX + 1 < N && 0 <= nextY - 1) {
                    sum4 = input[nextX-1][nextY-1] + input[nextX][nextY-1] + input[nextX+1][nextY-1] + input[nextX][nextY];
                }

                int temp1 = 0; int temp2 = 0; int temp3 = 0;
                temp1 = Math.max(sum1, sum2);
                temp2 = Math.max(sum3, sum4);
                temp3 = Math.max(temp1, temp2);
                if (temp3 > answer) {
                    answer = temp3;
                }
            }
        }

        System.out.println(answer);
    }

    public static void dfs (int currentX, int currentY, int sum, boolean [][] check, int counter) {
        check[currentX][currentY] = true;
        ++counter;
        sum += input[currentX][currentY];
        if (counter == 4) {
            if (sum > answer) {
                answer = sum;
            }
        } else if (counter < 4) {
            if (answer < sum + (4-counter)*max) {
                for (int i = 0; i < 4; ++i) {
                    if (0 <= currentX + dx[i] && currentX + dx[i] < N && 0 <= currentY + dy[i] && currentY + dy[i] < M) {
                        int newX = currentX + dx[i];
                        int newY = currentY + dy[i];
                        if (!check[newX][newY]) {
                            dfs(newX, newY, sum, check, counter);
                        }
                    }
                }
            }
        }
    }

    public static void bfs (int currentX, int currentY, int sum, boolean [][] check, int counter) {
        queue = new LinkedList<>();
        queue.add(new newPair(currentX, currentY, sum, check, counter));
        while (!queue.isEmpty()) {
            newPair current = queue.poll();
            current.sum += input[current.x][current.y];
            ++current.counter;
            current.check[current.x][current.y] = true;

            if (current.counter == 4) {
                if (current.sum > answer) {
                    answer = current.sum;
                }
            } else if (current.counter < 4){
                if (answer >= current.sum + max*(4-current.counter)) {
                    continue;
                }
                for (int i=0; i<4; ++i) {
                    if (0 <= current.x + dx[i] && current.x + dx[i] < N &&
                            0 <= current.y + dy[i] && current.y + dy[i] < M) {
                        if (!check[current.x + dx[i]][current.y + dy[i]]) {
                            int nextX = current.x + dx[i];
                            int nextY = current.y + dy[i];
                            //System.out.println(nextX+", "+nextY+", "+current.sum+", "+current.counter);
                            queue.add(new newPair(nextX, nextY, current.sum, current.check, current.counter));
                        }
                    }
                }
            }
        }
    }
}

class Pair {
    int value;
    int x;
    int y;

    Pair (int value, int x, int y) {
        this.value = value;
        this.x = x;
        this.y =y;
    }
}

class newPair {
    int x;
    int y;
    int sum;
    boolean [][] check;
    int counter;

    newPair (int x, int y, int sum, boolean [][] check, int counter) {
        this.x = x;
        this.y = y;
        this.sum = sum;
        this.check = check;
        this.counter = counter;
    }
}

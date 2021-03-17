package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q2251 {
    /*
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        bfs(A,B,C);
    }

    public static void bfs (int A, int B, int C) {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Water> queue = new LinkedList<>();
        boolean visited [][][] = new boolean [201][201][201];
        visited [0][0][C] = true;
        queue.add(new Water(0, 0, C));

        while (!queue.isEmpty()) {
            Water w = queue.poll();
            if (w.A == 0) {
                if (!result.contains(w.C)) {
                    result.add(w.C);
                }
            }

            if (w.A > 0) {
                for (int i=0; i<2; ++i) {
                    int nA = w.A; int nB = w.B; int nC = w.C;
                    if (i==0) {
                        if (nA + nB <= B) {
                            nB = nA + nB;
                            nA = 0;
                        } else if (nA + nB > B) {
                            nA = nA - (B-nB);
                            nB = B;
                        }
                    } else {
                        if (nA + nC <= C) {
                            nC = nA + nC;
                            nA = 0;
                        } else if (nA + nC > C) {
                            nA = nA - (C-nC);
                            nC = C;
                        }
                    }
                    if (!visited[nA][nB][nC]) {
                        visited[nA][nB][nC] = true;
                        queue.add(new Water (nA, nB, nC));
                        //System.out.println(nA+","+nB+","+nC);
                    }
                }
            }
            if (w.B > 0) {
                for (int i=0; i<2; ++i) {
                    int nA = w.A; int nB = w.B; int nC = w.C;
                    if (i==0) {
                        if (nA + nB <= A) {
                            nA = nA + nB;
                            nB = 0;
                        } else if (nA + nB > A) {
                            nB = nB - (A-nA);
                            nA = A;
                        }
                    } else {
                        if (nB + nC <= C) {
                            nC = nB + nC;
                            nB = 0;
                        } else if (nB + nC > C) {
                            nB = nB - (C-nC);
                            nC = C;
                        }
                    }
                    if (!visited[nA][nB][nC]) {
                        visited[nA][nB][nC] = true;
                        queue.add(new Water (nA, nB, nC));
                        //System.out.println(nA+","+nB+","+nC);
                    }
                }
            }

            if (w.C > 0) {
                for (int i=0; i<2; ++i) {
                    int nA = w.A; int nB = w.B; int nC = w.C;
                    if (i==0) {
                        if (nA + nC <= A) {
                            nA = nA + nC;
                            nC = 0;
                        } else if (nA + nC > A) {
                            nC = nC - (A-nA);
                            nA = A;
                        }
                    } else {
                        if (nB + nC <= B) {
                            nB = nB + nC;
                            nC = 0;
                        } else if (nB + nC > B) {
                            nC = nC - (B-nB);
                            nB = B;
                        }
                    }
                    if (!visited[nA][nB][nC]) {
                        visited[nA][nB][nC] = true;
                        queue.add(new Water (nA, nB, nC));
                        //System.out.println(nA+","+nB+","+nC);
                    }
                }
            }
        }
        Collections.sort(result);
        String answer = "";
        for (int i=0; i<result.size(); ++i) {
            answer += result.get(i)+" ";
        }
        System.out.println(answer);
    }
     */
}

/*
class Water {
    int A;
    int B;
    int C;

    Water(int A, int B, int C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
}
 */
